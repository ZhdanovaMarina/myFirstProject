package lesson_17.HW;

import lesson_17.task1.ICopyUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements ICopyUtils {

    @Override
    public void copy(String from, String to) {
        File fileFrom = new File(from);
        File fileTo = new File(to);

        try {
            FileUtils.copyFile(fileFrom, fileTo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
