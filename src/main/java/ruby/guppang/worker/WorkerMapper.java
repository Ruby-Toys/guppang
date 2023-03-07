package ruby.guppang.worker;

import org.apache.ibatis.annotations.Mapper;
import ruby.guppang.worker.dto.MemberSignUp;

@Mapper
public interface WorkerMapper {
    void insert(MemberSignUp memberSignUp);
}
