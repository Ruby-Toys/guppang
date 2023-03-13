package ruby.guppang.workRecord.dto;

import ruby.guppang.common.valid.WorkStatePattern;

public record WorkRecordPatch (
        @WorkStatePattern String workState) {
}
