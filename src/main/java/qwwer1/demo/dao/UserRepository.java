package qwwer1.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import qwwer1.demo.models.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {
}
