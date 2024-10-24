package com.dev.identra.repository;

import com.dev.identra.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}


/* JPA Spring sẽ tự động gen 1 câu query kiểm tra sự tồn tại của filed username này với value: username mà chúng ta truyền vào
khi mà ta khai báo hàm existsByUsername
* */