package com.EXAM_T2.EXAM_T2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EXAM_T2.EXAM_T2.Model.Orden;
import com.EXAM_T2.EXAM_T2.Repository.OrdenRepository;


@Service
public class OrdenService {
	
	 @Autowired
	    private OrdenRepository ordenRepository;

	    public List<Orden> getAllOrden() {
	        return ordenRepository.findAll();
	    }

	    public Orden getOrdenById(Long id) {
	        return ordenRepository.findById(id).orElse(null);
	    }

	    public Orden saveOrden(Orden orden) {
	        return ordenRepository.save(orden);
	    }

	    public void deleteOrden(Long id) {
	        ordenRepository.deleteById(id);
	    }

}
