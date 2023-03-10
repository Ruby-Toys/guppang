package ruby.guppang.worker.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WorkPlace {
    SEOUL_CENTER("서울 센터"),
    SUWON_CENTER("수원 센터"),
    GWANGJU_CENTER("광주 센터");

    String place;
}
