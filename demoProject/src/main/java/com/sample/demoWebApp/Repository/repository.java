package com.sample.demoWebApp.Repository;

import com.sample.demoWebApp.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends MongoRepository<Student, String> {
}
