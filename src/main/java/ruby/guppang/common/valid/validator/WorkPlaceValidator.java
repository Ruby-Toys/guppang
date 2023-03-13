package ruby.guppang.common.valid.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ruby.guppang.common.valid.WorkPlacePattern;
import ruby.guppang.workRecord.enums.WorkPlace;

import java.util.Arrays;

public class WorkPlaceValidator implements ConstraintValidator<WorkPlacePattern, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Arrays.stream(WorkPlace.values())
                .anyMatch(workPlace -> workPlace.name().equals(value));
    }
}
