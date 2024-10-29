
package com.mycompany.login.persistencias;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        
     List<Usuario> ListaUsuario = usuJpa.findUsuarioEntities();
    return ListaUsuario;
    //SELECT * FROM USUARIOS 
    
    }

    public List<Rol> traerRoles() {
    return rolJpa.findRolEntities();
    //SELECT * FROM ROLES
    
    }

    public void crearUsuario(Usuario usu) {
    usuJpa.create(usu);
    }
    
    
}
