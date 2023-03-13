package ruby.guppang.workRecord;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ruby.guppang.workRecord.dto.WorkRecordGet;
import ruby.guppang.workRecord.dto.WorkRecordPeriod;

import java.util.List;

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

    List<WorkRecordGet> findByWorkerAndPeriod(
            @Param("workerId")Long workerId,
            @Param("period")WorkRecordPeriod workRecordPeriod
    );
}
