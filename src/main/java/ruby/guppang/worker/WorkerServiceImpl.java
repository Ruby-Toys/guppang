package ruby.guppang.worker;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ruby.guppang.worker.dto.MemberInfo;
import ruby.guppang.worker.dto.MemberSignUp;
import ruby.guppang.worker.dto.MemberUpdate;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerMapper workerMapper;

    @Override
    public void signUp(MemberSignUp memberSignUp) {
        workerMapper.insert(memberSignUp);
    }

    @Override
    public void update(MemberUpdate memberUpdate) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public MemberInfo getInfo(Long id) {
        return null;
    }
}
