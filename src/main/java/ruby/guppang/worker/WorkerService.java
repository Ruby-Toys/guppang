package ruby.guppang.worker;

import ruby.guppang.worker.dto.WorkerSignUp;
import ruby.guppang.worker.dto.WorkerUpdate;

public interface WorkerService {

    void signUp(WorkerSignUp workerSignUp);
    boolean existsByEmail(String email);
    void update(WorkerUpdate workerUpdate);
    void delete(Long id);

}
