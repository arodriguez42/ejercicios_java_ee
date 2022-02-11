package dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Alumno;

public interface AlumnosDao extends JpaRepository<Alumno,String>{
	@Query("select a from Alumno a where a.curso.idCurso=?1")
	List<Alumno> findByCurso(int idCurso);
	@Query("select a from Alumno a where a.curso.fechaInicio=?1")
	List<Alumno> findByFechaCurso(Date fechaInicio);
}
