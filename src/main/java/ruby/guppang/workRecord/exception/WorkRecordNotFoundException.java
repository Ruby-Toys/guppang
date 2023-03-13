package ruby.guppang.workRecord.exception;

import org.springframework.http.HttpStatus;
import ruby.guppang.common.exception.CustomRuntimeException;

public class WorkRecordNotFoundException extends CustomRuntimeException {

    public static final String MESSAGE = "근무 기록을 찾을 수 없습니다.";

    public WorkRecordNotFoundException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return HttpStatus.NOT_FOUND.value();
    }
}
