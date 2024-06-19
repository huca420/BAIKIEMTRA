package com.example.ThongTinNV.Repository;

import com.example.ThongTinNV.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
