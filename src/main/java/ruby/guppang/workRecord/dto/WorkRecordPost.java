package ruby.guppang.workRecord.dto;

import ruby.guppang.common.valid.LocalDatePattern;
import ruby.guppang.common.valid.WorkPlacePattern;
import ruby.guppang.common.valid.WorkTimePattern;

public record WorkRecordPost(
        @WorkTimePattern String workTimeCord,
        @WorkPlacePattern String workPlaceCord,
        @LocalDatePattern String workDate
) {}
