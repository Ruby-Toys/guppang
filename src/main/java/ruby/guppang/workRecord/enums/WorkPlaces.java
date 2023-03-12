package ruby.guppang.workRecord.enums;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Getter
public class WorkPlaces {

    private final List<WorkPlaceMapper> workPlaceMappers = Arrays.stream(WorkPlace.values())
            .map(workPlace -> new WorkPlaceMapper(workPlace.name(), workPlace.getPlace()))
            .toList();
}
