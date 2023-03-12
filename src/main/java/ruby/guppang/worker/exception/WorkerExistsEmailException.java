package ruby.guppang.worker.exception;

import org.springframework.http.HttpStatus;
import ruby.guppang.common.exception.CustomRuntimeException;

public class WorkerExistsEmailException extends CustomRuntimeException {

    public static final String MESSAGE = "해당 이메일로 가입된 계정이 존재합니다.";

    public WorkerExistsEmailException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return HttpStatus.CONFLICT.value();
    }
}
