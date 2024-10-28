package com.mycompany.login.logica;

import com.mycompany.login.persistencias.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis =new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasena) {
        //String mensaje = null;
        Usuario usr=null;
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios(); 
    
        for (Usuario usu: listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasena)){
                    //mensaje = "Usuario y contraseña correctos, Bienvenido/a";
                    usr = usu;
                    return usr;
                  }
                else {
                //mensaje = "Contraseña incorrecta";
                    usr = null;
                    return usr;
                }
                  }
                else{
                //mensaje = "usuario no encontrado";
                //return mensaje;
                
                    usr = null;
                    //return usr;
                }
                }
                return usr;
    }

 
}   
        
        
    
    
  
    
    

