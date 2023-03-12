package ruby.guppang.workRecord.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WorkState {

    PROPOSAL("근무신청"),
    CONFIRMED("근무확정"),
    CANCEL("근무취소");

    final String state;
}
