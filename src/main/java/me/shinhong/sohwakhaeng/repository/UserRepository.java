package me.shinhong.sohwakhaeng.repository;

import me.shinhong.sohwakhaeng.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
