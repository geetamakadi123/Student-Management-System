package com.student.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepo extends JpaRepository<CourseRepo, Integer> {

}
