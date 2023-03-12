package ruby.guppang.workRecord;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkRecordMapper {
    void insert(WorkRecord workRecord);
}
