package com.portfoliosNicolas.portfoliosNicolas.Security.Repository;

import com.portfoliosNicolas.portfoliosNicolas.Security.Entity.Rol;
import com.portfoliosNicolas.portfoliosNicolas.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
