package ruby.guppang.workRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ruby.guppang.workRecord.dto.WorkRecordPost;
import ruby.guppang.workRecord.enums.WorkState;
import ruby.guppang.worker.Worker;

@Service
@RequiredArgsConstructor
@Transactional
public class WorkRecordServiceImpl implements WorkRecordService{

    private final WorkRecordMapper workRecordMapper;


    @Override
    public void addRecord(Worker worker, WorkRecordPost workRecordPost) {
        WorkRecord workRecord = WorkRecord.builder()
                .workerId(worker.getId())
                .workTime(workRecordPost.workTimeCord())
                .workPlace(workRecordPost.workPlaceCord())
                .workState(WorkState.PROPOSAL.name())
                .build();

        workRecordMapper.insert(workRecord);
    }

    @Override
    public void updateRecordState(Long id, String workState) {
        workRecordMapper.updateWorkState(id, workState);
    }
}