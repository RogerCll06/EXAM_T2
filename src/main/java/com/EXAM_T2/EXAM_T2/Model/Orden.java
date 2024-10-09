package com.EXAM_T2.EXAM_T2.Model;



	import java.util.Date;
	import org.springframework.format.annotation.DateTimeFormat;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "Orden")
	public class Orden {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long ordenId;

	    private Long clienteId;

	    @ManyToOne
		@JoinColumn(name = "libro_id")
		private Libro libro;
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date fechaDeOrden;

	   
}
