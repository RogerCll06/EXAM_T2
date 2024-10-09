package com.EXAM_T2.EXAM_T2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EXAM_T2.EXAM_T2.Model.Libro;
import com.EXAM_T2.EXAM_T2.Repository.LibroRepository;

@Service
public class LibroService {
	
	 @Autowired
	    private LibroRepository libroRepository;

	    public List<Libro> getAllLibros() {
	        return libroRepository.findAll();
	    }

	    public Libro getLibroById(Long id) {
	        return libroRepository.findById(id).orElse(null);
	    }

	    public Libro saveLibro(Libro libro) {
	        return libroRepository.save(libro);
	    }

	    public void deleteLibro(Long id) {
	        libroRepository.deleteById(id);
	    }

}
