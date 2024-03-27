package org.dhanush.spring_security_test.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author Dhanush
 * Created At 3/27/2024 07:31
 */
@Repository
public class UserDao {
    private final static List<UserDetails> USER_DETAILS = Arrays.asList(
            new User(
                    "sh777@gm.com",
                    "password",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))
            ),
            new User(
                    "admin777@gm.com",
                    "password",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"))
            )

    );
    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        return
                USER_DETAILS
                        .stream()
                        .filter(u -> u.getUsername().equals(email))
                        .findFirst()
                        .orElseThrow(() -> new UsernameNotFoundException("User Not Found"))
                ;
    }
}
