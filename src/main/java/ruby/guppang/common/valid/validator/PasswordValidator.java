package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.PasswordPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<PasswordPattern, String> {

    private static final String REGEXP = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@!%*#?&])[A-Za-z\\d$@!%*#?&]{8,50}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
