package net.studentmanagement.sms.repository;

import net.studentmanagement.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
