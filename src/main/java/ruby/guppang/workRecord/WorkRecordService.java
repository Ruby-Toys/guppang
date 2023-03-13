package ruby.guppang.workRecord;

import ruby.guppang.workRecord.dto.WorkRecordGet;
import ruby.guppang.workRecord.dto.WorkRecordPeriod;
import ruby.guppang.workRecord.dto.WorkRecordPost;

import java.util.List;

public interface WorkRecordService {
    void addRecord(Long workerId, WorkRecordPost workRecordPost);
    void updateRecordState(Long id, String workState);
    List<WorkRecordGet> getWorkRecordList(Long workerId, WorkRecordPeriod workRecordPeriod);
}
