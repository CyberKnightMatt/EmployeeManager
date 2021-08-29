package us.stallings.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import us.stallings.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
