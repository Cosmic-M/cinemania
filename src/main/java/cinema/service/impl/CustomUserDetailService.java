package cinema.service.impl;

import cinema.model.User;
import cinema.service.UserService;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String name) {
        User user = userService.getByEmail(name);
        UserBuilder builder = org
                .springframework.security.core.userdetails.User.withUsername(name);
        builder.password(user.getPassword());
        builder.authorities(user.getRoles().stream()
                .map(i -> i.getRoleName().toString())
                .toArray(String[]::new));
        return builder.build();
    }
}
