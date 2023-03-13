package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.LocalDatePattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalDateValidator implements ConstraintValidator<LocalDatePattern, String> {

    private static final String REGEXP = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
