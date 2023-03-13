package ruby.guppang.workRecord;

import lombok.Builder;

@Builder
public record WorkRecord(Long workerId, String workTime, String workPlace, String workState, String workDate) { }
