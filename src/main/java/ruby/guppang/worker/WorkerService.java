package ruby.guppang.worker;

import ruby.guppang.worker.dto.MemberInfo;
import ruby.guppang.worker.dto.MemberSignUp;
import ruby.guppang.worker.dto.MemberUpdate;

public interface WorkerService {

    void signUp(MemberSignUp memberSignUp);
    void update(MemberUpdate memberUpdate);
    void delete(Long id);
    MemberInfo getInfo(Long id);
}
