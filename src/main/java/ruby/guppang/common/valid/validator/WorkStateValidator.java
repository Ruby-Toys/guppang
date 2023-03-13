package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.WorkStatePattern;
import ruby.guppang.workRecord.enums.WorkState;

import java.util.Arrays;

public class WorkStateValidator implements ConstraintValidator<WorkStatePattern, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Arrays.stream(WorkState.values())
                .anyMatch(workState -> workState.name().equals(value));
    }
}
