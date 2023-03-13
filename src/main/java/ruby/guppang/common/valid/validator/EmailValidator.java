package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.EmailPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<EmailPattern, String> {

    private static final String REGEXP = "^[\\da-zA-Z]([-_.]?[\\da-zA-Z])*@[\\da-zA-Z]([-_.]?[\\da-zA-Z])*.[a-zA-Z]{2,3}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
