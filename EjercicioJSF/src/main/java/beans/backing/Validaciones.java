
package beans.backing;

import beans.model.Persona;
import beans.model.Usuario;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Validaciones {
        
    @Inject 
    private Persona persona;
    
    @Inject
    private Usuario usuario;
    
    
    
    
}
