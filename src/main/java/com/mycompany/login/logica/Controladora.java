package com.mycompany.login.logica;

import com.mycompany.login.persistencias.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis =new ControladoraPersistencia();

    public boolean validarUsuario(String usuario, String contrasena) {
        //String mensaje = null;
        boolean ok = false;
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios(); 
    
        for (Usuario usu: listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasena)){
                    //mensaje = "Usuario y contraseña correctos, Bienvenido/a";
                    ok = true;
                    return ok;
                  }
                else {
                //mensaje = "Contraseña incorrecta";
                    ok = false;
                    return ok;
                }
                  }
                else{
                //mensaje = "usuario no encontrado";
                //return mensaje;
                
                    ok = false;
                    return ok;
                }
                }
                return ok;
    }

    public String validarRol(String usuario, String contrasenia) {
    
    }
}   
        
        
    
    
  
    
    

