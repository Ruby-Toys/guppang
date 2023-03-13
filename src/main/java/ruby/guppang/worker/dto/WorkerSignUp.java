package ruby.guppang.worker.dto;

import ruby.guppang.common.valid.EmailPattern;
import ruby.guppang.common.valid.PasswordPattern;
import ruby.guppang.common.valid.UsernamePattern;

public record WorkerSignUp(
        @EmailPattern String email,
        @UsernamePattern String name,
        @PasswordPattern String password
) { }
