package org.dhanush.spring_security_test.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author Dhanush
 * Created At 3/26/2024 21:32
 */
@Data
@NoArgsConstructor
public class AuthenticationRequest {
    private String email;
    private String password;
}
