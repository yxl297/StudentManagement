package org.dxc.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.dxc.StudentManagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}
