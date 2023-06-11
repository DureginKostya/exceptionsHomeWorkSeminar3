package validations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import exceptions.*;

public class MyDate {
    public void isValidDate(String dateUser) throws DateException {
        if (dateUser == null || !dateUser.matches("[0-3]\\d.[01]\\d.\\d{4}"))
            throw new DateException(dateUser);
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(false);
        try {
            df.parse(dateUser);
        } catch (ParseException e) {
            throw new DateException(dateUser);
        }
    }
}
