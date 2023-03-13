package ruby.guppang.workRecord.dto;

import ruby.guppang.common.valid.LocalDatePattern;

public record WorkRecordPeriod(
        @LocalDatePattern String start,
        @LocalDatePattern String end
) { }
