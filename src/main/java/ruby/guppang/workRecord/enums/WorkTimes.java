package ruby.guppang.workRecord.enums;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Getter
public class WorkTimes {

    private final List<WorkTimeMapper> workTimeMappers = Arrays.stream(WorkTime.values())
            .map(workTime -> new WorkTimeMapper(workTime.name(), workTime.getPart(), workTime.getTime()))
            .toList();
}
