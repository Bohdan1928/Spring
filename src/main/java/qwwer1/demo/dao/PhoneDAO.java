package qwwer1.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import qwwer1.demo.models.Phone;

public interface PhoneDAO extends JpaRepository<Phone, Integer> {
}
