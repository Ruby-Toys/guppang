package ruby.guppang.worker;

import ruby.guppang.worker.dto.WorkerInfo;
import ruby.guppang.worker.dto.WorkerLogin;
import ruby.guppang.worker.dto.WorkerSignUp;
import ruby.guppang.worker.dto.WorkerUpdate;

public interface WorkerService {

    void signUp(WorkerSignUp workerSignUp);
    WorkerInfo login(WorkerLogin workerLogin);
    void update(WorkerUpdate workerUpdate);
    void delete(Long id);
    WorkerInfo getInfo(Long id);
}
