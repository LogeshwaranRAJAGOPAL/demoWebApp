package com.sample.demoWebApp.Repository;

import com.sample.demoWebApp.Model.Student;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface repository extends JpaRepository<Student, String> {
}
