package ruby.guppang.worker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberSignUp {

    private String email;
    private String name;
    private String password;
}
