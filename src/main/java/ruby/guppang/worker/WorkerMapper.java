package ruby.guppang.worker;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkerMapper {
    void insert(Worker worker);
    Worker findByEmail(String email);
}
