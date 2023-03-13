package ruby.guppang.workRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ruby.guppang.workRecord.dto.WorkRecordGet;
import ruby.guppang.workRecord.dto.WorkRecordPeriod;
import ruby.guppang.workRecord.dto.WorkRecordPost;
import ruby.guppang.workRecord.enums.WorkState;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WorkRecordServiceImpl implements WorkRecordService{

    private final WorkRecordMapper workRecordMapper;


    @Override
    public void addRecord(Long workerId, WorkRecordPost workRecordPost) {
        WorkRecord workRecord = WorkRecord.builder()
                .workerId(workerId)
                .workTime(workRecordPost.workTimeCord())
                .workPlace(workRecordPost.workPlaceCord())
                .workState(WorkState.PROPOSAL.name())
                .workDate(workRecordPost.workDate())
                .build();

        workRecordMapper.insert(workRecord);
    }

    @Override
    public void updateRecordState(Long id, String workState) {
        workRecordMapper.updateWorkState(id, workState);
    }

    @Override
    public List<WorkRecordGet> getWorkRecordList(Long workerId, WorkRecordPeriod workRecordPeriod) {
        return workRecordMapper.findByWorkerAndPeriod(workerId, workRecordPeriod);
    }
}