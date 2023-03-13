package ruby.guppang.workRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ruby.guppang.security.AuthenticationWorker;
import ruby.guppang.workRecord.dto.WorkRecordPatch;
import ruby.guppang.workRecord.dto.WorkRecordPost;
import ruby.guppang.workRecord.enums.WorkPlaceMapper;
import ruby.guppang.workRecord.enums.WorkPlaces;
import ruby.guppang.workRecord.enums.WorkTimeMapper;
import ruby.guppang.workRecord.enums.WorkTimes;
import ruby.guppang.workRecord.exception.WorkRecordNotFoundException;
import ruby.guppang.worker.Worker;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workRecords")
public class WorkRecordController {

    private final WorkRecordMapper workRecordMapper;
    private final WorkRecordService workRecordService;
    private final WorkPlaces workPlaces;
    private final WorkTimes workTimes;

    @PostMapping
    public void postWorkRecord(
            @RequestBody WorkRecordPost workRecordPost,
            @AuthenticationWorker Worker worker) {
        // TODO - 시큐리티 설정으로 권한을 체크
        workRecordService.addRecord(worker, workRecordPost);
    }

    @PatchMapping("/{id}")
    public void patchWorkRecord(
            @PathVariable Long id,
            @RequestBody WorkRecordPatch workRecordPatch,
            @AuthenticationWorker Worker worker) {
        Long workerId = worker.getId();
        boolean exists = workRecordMapper.existsByIdAndWorkerId(id, workerId);

        if (!exists) {
            throw new WorkRecordNotFoundException();
        }

        workRecordService.updateRecordState(id, workRecordPatch.workState());
    }

    @GetMapping("/workplaces")
    public List<WorkPlaceMapper> getWorkPlaces() {
        return workPlaces.getWorkPlaceMappers();
    }

    @GetMapping("/worktimes")
    public List<WorkTimeMapper> getWorkTimes() {
        return workTimes.getWorkTimeMappers();
    }
}
