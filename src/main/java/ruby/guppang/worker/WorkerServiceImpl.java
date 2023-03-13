package ruby.guppang.worker;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ruby.guppang.worker.dto.WorkerSignUp;
import ruby.guppang.worker.enums.WorkerRole;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerMapper workerMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void signUp(WorkerSignUp workerSignUp) {
        Worker worker = Worker.builder()
                .name(workerSignUp.name())
                .email(workerSignUp.email())
                .password(passwordEncoder.encode(workerSignUp.password()))
                .role(WorkerRole.UNVERIFIED.name())
                .build();

        workerMapper.insert(worker);
    }

    @Override
    public boolean existsByEmail(String email) {
        Worker byEmail = workerMapper.findByEmail(email);
        return byEmail != null;
    }

    @Override
    public void delete(Long id) {

    }


}
