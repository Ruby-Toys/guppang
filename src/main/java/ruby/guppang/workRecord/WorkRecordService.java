package ruby.guppang.workRecord;

import ruby.guppang.workRecord.dto.WorkRecordPost;
import ruby.guppang.worker.Worker;

public interface WorkRecordService {
    void addRecord(Worker worker, WorkRecordPost workRecordPost);
}
