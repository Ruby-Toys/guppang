package ruby.guppang.workRecord;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkRecordMapper {
    void insert(WorkRecord workRecord);
    boolean existsByIdAndWorkerId(
            @Param("id")Long id,
            @Param("workerId")Long workerId
    );

    void updateWorkState(
            @Param("id")Long id,
            @Param("workState")String workState
    );
}
