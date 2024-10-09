package com.EXAM_T2.EXAM_T2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EXAM_T2.EXAM_T2.Model.Libro;

@Repository
public interface LibroRepository  extends JpaRepository<Libro, Long>{

}
