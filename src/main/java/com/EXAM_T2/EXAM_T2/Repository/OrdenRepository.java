package com.EXAM_T2.EXAM_T2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EXAM_T2.EXAM_T2.Model.Orden;



@Repository
public interface OrdenRepository   extends JpaRepository<Orden, Long> {

}
