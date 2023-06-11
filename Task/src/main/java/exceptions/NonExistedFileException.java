package exceptions;

import java.io.FileNotFoundException;

public class NonExistedFileException extends FileNotFoundException {
    public NonExistedFileException(String value) {
        super(String.format("Файл %s не существует!!!", value));
    }
}
