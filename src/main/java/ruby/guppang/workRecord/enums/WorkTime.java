package ruby.guppang.workRecord.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WorkTime {

    MORNING_SHIFT("오전조", "09:00 ~ 17:00"),
    AFTERNOON_CENTER("오후조", "17:00 ~ 02:00"),
    NIGHT_CENTER("야간조", "20:00 ~ 06:00");

    final String part;
    final String time;
}
