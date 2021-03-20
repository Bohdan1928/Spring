package qwwer1.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import qwwer1.demo.models.Car;

@EnableJpaRepositories
public interface CarDAO extends JpaRepository<Car, Integer> {
}
