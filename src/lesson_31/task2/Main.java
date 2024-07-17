package lesson_31.task2;

import lesson_17.task1.CopyWithNIO;
import lesson_31.task2.interfaces.CopyFileTask;
import lesson_31.task2.interfaces.Task;
import lesson_31.task2.interfaces.TaskExecutor;
import lesson_31.task2.interfaces.TasksStorage;

public class Main {
    public static void main(String[] args) {

        CopyFileTask task1 = new CopyFileTaskImpl("\\C:\\Games\\video1.mp4", "1.mp4", 1);
        CopyFileTask task2 = new CopyFileTaskImpl("\\C:\\Games\\video1.mp4", "2.mp4", 2);
        CopyFileTask task3 = new CopyFileTaskImpl("\\C:\\Games\\video1.mp4", "3.mp4", 3);
        CopyFileTask task4 = new CopyFileTaskImpl("\\C:\\Games\\video1.mp4", "4.mp4", 4);
        CopyFileTask task5 = new CopyFileTaskImpl("\\C:\\Games\\video111.mp4", "5.mp4", 5);

        task1.setFileCopyUtils(new CopyWithNIO());
        task2.setFileCopyUtils(new CopyWithNIO());
        task3.setFileCopyUtils(new CopyWithNIO());
        task4.setFileCopyUtils(new CopyWithNIO());
        task5.setFileCopyUtils(new CopyWithNIO());

        TasksStorage tasksStorage = new TaskStorageImpl();
        tasksStorage.add(task1);
        tasksStorage.add(task2);
        tasksStorage.add(task3);
        tasksStorage.add(task4);
        tasksStorage.add(task5);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();

        executor1.setStorage(tasksStorage);
        executor2.setStorage(tasksStorage);
        executor3.setStorage(tasksStorage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
