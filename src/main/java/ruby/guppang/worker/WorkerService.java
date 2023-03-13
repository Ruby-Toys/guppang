package ruby.guppang.worker;

import ruby.guppang.worker.dto.WorkerSignUp;

public interface WorkerService {

    void signUp(WorkerSignUp workerSignUp);
    boolean existsByEmail(String email);
    void delete(Long id);

}
