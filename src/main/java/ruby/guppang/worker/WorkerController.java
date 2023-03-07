package ruby.guppang.worker;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ruby.guppang.worker.dto.MemberSignUp;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workers")
public class WorkerController {

    private final WorkerService workerService;

    @PostMapping
    void signUp(@RequestBody MemberSignUp memberSignUp) {
        workerService.signUp(memberSignUp);
    }
}
