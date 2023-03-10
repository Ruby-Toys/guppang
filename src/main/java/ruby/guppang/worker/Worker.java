package ruby.guppang.worker;

import lombok.Builder;
import lombok.Getter;
import ruby.guppang.worker.enums.WorkerRole;

@Getter
public class Worker {
    private String email;
    private String name;
    private String password;
    private WorkerRole role;

    @Builder
    public Worker(String email, String name, String password, WorkerRole role) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }
}
