package com.wjw.zeDeWilliam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wjw.zeDeWilliam.model.Picole;

public interface Picoles extends JpaRepository<Picole, Long> {
	@Query(nativeQuery=true, value = "select * from picole order by data desc limit 5")
	public List<Picole> listarPicoles();
}
