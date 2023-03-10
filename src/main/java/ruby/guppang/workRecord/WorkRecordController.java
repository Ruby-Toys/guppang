package ruby.guppang.workRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workRecord")
public class WorkRecordController {

    @PostMapping
    public void postWorkRecord() {
        // 근무 신청자, 신청 시간, 상태,
    }
}
