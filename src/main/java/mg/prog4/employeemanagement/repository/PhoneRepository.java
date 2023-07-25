package mg.prog4.employeemanagement.repository;

import java.util.List;
import mg.prog4.employeemanagement.repository.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, String> {
  boolean existsByValue(String value);
  List<Phone> getByEmployeeId(String employeeId);
}
