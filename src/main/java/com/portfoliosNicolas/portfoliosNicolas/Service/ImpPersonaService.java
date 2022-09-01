package com.portfoliosNicolas.portfoliosNicolas.Service;

import com.portfoliosNicolas.portfoliosNicolas.Entity.Persona;
import com.portfoliosNicolas.portfoliosNicolas.Interface.IPersonaService;
import com.portfoliosNicolas.portfoliosNicolas.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    
    @Autowired IPersonaRepository ipersonaRepositorio;
    

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepositorio.findAll();
        return persona;
    }
    
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    }
    
}
