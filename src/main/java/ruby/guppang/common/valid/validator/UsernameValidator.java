package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.UsernamePattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator implements ConstraintValidator<UsernamePattern, String> {

    private static final String REGEXP = "^[가-힣a-zA-Z]{2,20}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
