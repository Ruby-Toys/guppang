package ruby.guppang.common.valid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ruby.guppang.common.valid.validator.UsernameValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = UsernameValidator.class)
@Documented
public @interface UsernamePattern {

    String MESSAGE = "이름은 2~20자 한글, 영문 대소문자만 입력할 수 있습니다.";

    String message() default MESSAGE;

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}