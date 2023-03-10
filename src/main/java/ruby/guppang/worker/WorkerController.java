package ruby.guppang.worker;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ruby.guppang.worker.dto.WorkerSignUp;
import ruby.guppang.worker.enums.WorkPlaceMapper;
import ruby.guppang.worker.enums.WorkPlaces;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workers")
public class WorkerController {

    private final WorkerService workerService;
    private final WorkPlaces workPlaces;

    @PostMapping("/signUp")
    public void signUp(@RequestBody WorkerSignUp workerSignUp) {
        workerService.signUp(workerSignUp);
    }

    @GetMapping("/workplaces")
    public List<WorkPlaceMapper> getWorkPlaceValue() {
        return workPlaces.getWorkPlaceMappers();
    }
}
