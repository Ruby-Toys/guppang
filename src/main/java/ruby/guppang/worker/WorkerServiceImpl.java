package ruby.guppang.worker;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ruby.guppang.worker.dto.WorkerInfo;
import ruby.guppang.worker.dto.WorkerLogin;
import ruby.guppang.worker.dto.WorkerSignUp;
import ruby.guppang.worker.dto.WorkerUpdate;
import ruby.guppang.worker.enums.WorkerRole;
import ruby.guppang.worker.exception.WorkerNotFoundException;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerMapper workerMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void signUp(WorkerSignUp workerSignUp) {
        Worker worker = Worker.builder()
                .name(workerSignUp.getName())
                .email(workerSignUp.getEmail())
                .password(passwordEncoder.encode(workerSignUp.getPassword()))
                .role(WorkerRole.UNVERIFIED)
                .build();

        workerMapper.insert(worker);
    }

    @Override
    public WorkerInfo login(WorkerLogin workerLogin) {
        Worker worker = workerMapper.findByEmail(workerLogin.email());

        boolean matches = passwordEncoder.matches(workerLogin.password(), worker.getPassword());

        if (matches) {
            return new WorkerInfo(worker.getEmail(), worker.getName());
        }

        throw new WorkerNotFoundException();
    }

    @Override
    public void update(WorkerUpdate workerUpdate) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public WorkerInfo getInfo(Long id) {
        return null;
    }
}
