package ruby.guppang.workRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ruby.guppang.workRecord.dto.WorkRecordPost;
import ruby.guppang.workRecord.enums.WorkState;
import ruby.guppang.worker.Worker;

@Service
@RequiredArgsConstructor
public class WorkRecordServiceImpl implements WorkRecordService{

    private final WorkRecordMapper workRecordMapper;


    @Override
    @Transactional
    public void addRecord(Worker worker, WorkRecordPost workRecordPost) {
        // 근무 신청자, 신청 시간, 상태, 근무지
        WorkRecord workRecord = WorkRecord.builder()
                .workerId(worker.getId())
                .workTime(workRecordPost.workTimeCord())
                .workPlace(workRecordPost.workPlaceCord())
                .workState(WorkState.PROPOSAL.name())
                .build();

        workRecordMapper.insert(workRecord);
    }
}