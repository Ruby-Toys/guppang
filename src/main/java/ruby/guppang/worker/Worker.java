package ruby.guppang.worker;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Worker {
    private Long id;
    private final String email;
    private final String name;
    private final String password;
    private final String role;

    @Builder
    public Worker(String email, String name, String password, String role) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }
}
