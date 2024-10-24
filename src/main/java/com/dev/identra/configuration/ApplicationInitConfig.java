package com.dev.identra.configuration;

import com.dev.identra.entity.User;
import com.dev.identra.enums.Role;
import com.dev.identra.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;

@Configuration
public class ApplicationInitConfig {

    // khoi chay moi khi app duoc start
    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository) {
        return args -> {
            if (userRepository.findByUsername("admin").isEmpty()) {
                var roles = new HashSet<>();
                roles.add(Role.ADMIN.name());
                User user = User.builder()
                        .username("admin")
                        .password()
                        .roles(roles)
                        .build();
            }
        };
    }
}
