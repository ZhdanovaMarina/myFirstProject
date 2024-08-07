package lesson_31.task2;

import lesson_31.task2.exception.TaskExecutionFailedException;
import lesson_31.task2.interfaces.Task;
import lesson_31.task2.interfaces.TaskExecutor;
import lesson_31.task2.interfaces.TasksStorage;

public class TaskExecutorImpl implements TaskExecutor, Runnable{

    private TasksStorage tasksStorage;
    private boolean isStopped;
    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        tasksStorage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return tasksStorage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        new Thread(this).start();
    }

    @Override
    public void stop() throws IllegalStateException {
        isStopped = true;
    }

    @Override
    public void run() {
        while (! isStopped){
            // 1. Достать задачу на исполнение из хранилища.
            // 2. Если зачад нет - завершить свою работу. Если задача получена - то выполнить ее.
            // 3. Если задача выполнена - вывести в консоль результаты.
            // 4. Если задача не выполнена - увеличить счетчик кол-ва исполнений, и вернуть задачу обратно в хранилище
            // Если счетчик исполнения равен 5, то задачу в хранилище не возвращать, а удалить окончательно.

            Task task = tasksStorage.get(); // получили задачу
            String threadName = Thread.currentThread().getName();
            if (task == null){
                System.out.printf("Задач на выполнение нет, поток %s завершает свою работу\n", threadName);
                stop();
                continue;
            }

            int id = task.getId();

            try {
                System.out.printf("Поток %s выполняет задачу %d\n", threadName, id);
                task.execute();
                System.out.printf("Задача %d была успешно выполнена потоком %s\n",id, threadName);
            } catch (Exception e) {
                int tryCount = task.getTryCount();
                if (tryCount >= 5){
                    task.incTryCount();
                    tasksStorage.add(task);
                    System.out.printf("Задача %d была возвращена потоком %s в хранилище\n",id, threadName);
                }
            }
        }
    }
}
