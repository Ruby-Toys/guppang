package ruby.guppang.workRecord;

import lombok.Builder;
import lombok.Getter;
import ruby.guppang.workRecord.enums.WorkPlace;
import ruby.guppang.workRecord.enums.WorkState;
import ruby.guppang.workRecord.enums.WorkTime;

@Getter
public class WorkRecord {
    // 근무 신청자, 신청 시간, 상태, 근무지
    private final Long workerId;
    private final String workTime;
    private final String workPlace;
    private final String workState;

    @Builder
    public WorkRecord(Long workerId, String workTime, String workPlace, String workState) {
        this.workerId = workerId;
        this.workTime = workTime;
        this.workPlace = workPlace;
        this.workState = workState;
    }
}
