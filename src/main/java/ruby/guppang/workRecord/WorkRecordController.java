package ruby.guppang.workRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ruby.guppang.security.AuthenticationWorker;
import ruby.guppang.workRecord.dto.WorkRecordGet;
import ruby.guppang.workRecord.dto.WorkRecordPatch;
import ruby.guppang.workRecord.dto.WorkRecordPeriod;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void postWorkRecord(
            @RequestBody WorkRecordPost workRecordPost,
            @AuthenticationWorker Worker worker) {
        workRecordService.addRecord(worker.getId(), workRecordPost);
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

    @GetMapping
    public List<WorkRecordGet> getWorkRecords(
            WorkRecordPeriod workRecordPeriod,
            @AuthenticationWorker Worker worker) {
        return workRecordService.getWorkRecordList(worker.getId(), workRecordPeriod);
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
