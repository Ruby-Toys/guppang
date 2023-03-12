package ruby.guppang.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import ruby.guppang.worker.Worker;
import ruby.guppang.worker.WorkerMapper;
import ruby.guppang.worker.exception.WorkerNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final WorkerMapper workerMapper;

    @Override
    public UserDetails loadUserByUsername(String email) {
        Worker worker =  workerMapper.findByEmail(email);

        if (worker == null) {
            throw new WorkerNotFoundException();
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + worker.getRole()));

        return new WorkerDetails(worker, authorities);
    }
}
