package com.guiporttwo.gui.Repository;

import com.guiporttwo.gui.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
