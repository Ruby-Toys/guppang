package ruby.guppang.common.valid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ruby.guppang.common.valid.validator.WorkTimeValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = WorkTimeValidator.class)
@Documented
public @interface WorkTimePattern {

    String MESSAGE = "파트 타임 값이 올바르지 않습니다.";

    String message() default MESSAGE;

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}