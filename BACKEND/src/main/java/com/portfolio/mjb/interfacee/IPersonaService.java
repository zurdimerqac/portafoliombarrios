package com.portfolio.mjb.interfacee;

import com.portfolio.mjb.entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> GetPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto de tipo persona
    
    public void deletePersona(Long id);
    
    //buscar un objeto de tipo persona
    
    public Persona findPersona(Long id);
}
