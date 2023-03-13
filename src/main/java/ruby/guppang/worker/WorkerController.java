package ruby.guppang.worker;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ruby.guppang.security.AuthenticationWorker;
import ruby.guppang.worker.dto.WorkerInfo;
import ruby.guppang.worker.dto.WorkerSignUp;
import ruby.guppang.worker.exception.WorkerExistsEmailException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workers")
public class WorkerController {

    private final WorkerMapper workerMapper;
    private final WorkerService workerService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signUp")
    public void signUp(@RequestBody @Valid WorkerSignUp workerSignUp) {
        String email = workerSignUp.email();
        boolean existsByEmail = workerService.existsByEmail(email);
        if (existsByEmail) {
            throw new WorkerExistsEmailException();
        }

        workerService.signUp(workerSignUp);
    }

    @GetMapping("/info")
    public WorkerInfo getInfo(@AuthenticationWorker Worker worker) {
        return new WorkerInfo(worker.getEmail(), worker.getName());
    }
}
