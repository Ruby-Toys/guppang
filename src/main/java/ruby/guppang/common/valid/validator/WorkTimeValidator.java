package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.WorkTimePattern;
import ruby.guppang.workRecord.enums.WorkTime;

import java.util.Arrays;

public class WorkTimeValidator implements ConstraintValidator<WorkTimePattern, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Arrays.stream(WorkTime.values())
                .anyMatch(workTime -> workTime.name().equals(value));
    }
}
