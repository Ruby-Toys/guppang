package ruby.guppang.worker.exception;

import org.springframework.http.HttpStatus;
import ruby.guppang.common.exception.CustomRuntimeException;

public class WorkerNotFoundException extends CustomRuntimeException {

    public static final String MESSAGE = "근무자 정보를 찾을 수 없습니다.";

    public WorkerNotFoundException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return HttpStatus.NOT_FOUND.value();
    }
}
