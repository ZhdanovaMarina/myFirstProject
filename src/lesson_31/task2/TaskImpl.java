package lesson_31.task2;

import lesson_31.task2.exception.TaskExecutionFailedException;
import lesson_31.task2.interfaces.Task;

public abstract class TaskImpl implements Task {

    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

}
