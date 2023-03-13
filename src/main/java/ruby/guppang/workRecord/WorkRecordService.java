package ruby.guppang.workRecord;

import ruby.guppang.workRecord.dto.WorkRecordPatch;
import ruby.guppang.workRecord.dto.WorkRecordPost;
import ruby.guppang.worker.Worker;

public interface WorkRecordService {
    void addRecord(Worker worker, WorkRecordPost workRecordPost);

    void updateRecordState(Long id, String workState);
}
