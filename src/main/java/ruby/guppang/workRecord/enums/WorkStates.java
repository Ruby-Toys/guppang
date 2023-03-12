package ruby.guppang.workRecord.enums;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Getter
public class WorkStates {

    private final List<WorkStateMapper> workStateMappers = Arrays.stream(WorkState.values())
            .map(workState -> new WorkStateMapper(workState.name(), workState.getState()))
            .toList();
}
