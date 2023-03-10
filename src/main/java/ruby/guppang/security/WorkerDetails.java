package ruby.guppang.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import ruby.guppang.worker.Worker;

import java.util.List;

@Getter
public class WorkerDetails extends User {
    private final Worker worker;

    public WorkerDetails(Worker worker, List<GrantedAuthority> authorities) {
        super(worker.getEmail(), worker.getPassword(), authorities);
        this.worker = worker;
    }
}
