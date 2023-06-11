package exceptions;

public class FIOException extends RuntimeException{
    public FIOException(String valueFIO, String valueErr) {
        super(String.format("Введено неправильное значение <%s>!!! Введено: %s", valueFIO, valueErr));
    }
}
