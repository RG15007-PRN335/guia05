
package uesocc.edu.sv.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import uesocc.edu.sv.ingenieria.prn335_2017.datos.acceso.UsuarioFacadeLocal;
import uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.Usuario;

/**
 *
 * @author cesarlinares
 */
@Named(value = "frmUsuario")
@ViewScoped
public class frmUsuario  implements  Serializable{
    
   
    @EJB
    private UsuarioFacadeLocal UsuarioEJB;
    private Usuario U;
    private List<Usuario> usuarios;

    @PostConstruct
    public void init() {
        usuarios = UsuarioEJB.findAll();
        U = new Usuario();
        
        
        U.setIdUsuario(null);
        U.setNombres("");
        U.setApellidos("");  
        U.setFechaNacimiento(U.getFechaNacimiento());
        U.setActivo(false);
    }

    
    
    
    
    /**
     * manda a llamar los datos de la variable
     * @return 
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    /**
     * se le asigna los valores a la variable
     * @param Usuarios
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios= usuarios;
    }

    /**
     * manda a llamar los datos de la variable
     * @return 
     */
    public Usuario getU() {
        return U;
    }

    /**
     * se le asigna los valores a la variable
     * @param U
     */
    public void setU(Usuario U) {
        this.U = U;
    }

    /**
     * metodo sirve para guardar los campos ingresados
     * @return 
     */
    public String guardar() {
        if (U != null) {
            System.out.println("¡¡SI HA INGRESADO DATOS!!");
            UsuarioEJB.create(U);
            usuarios= UsuarioEJB.findAll();
        } else {
            System.out.println("¡¡NO INGRESO DATOS: NULL!!");
        }
        U = new Usuario();
        return "c_guardar";
    }
    
    /**
     * metodo usado para limpiar la interfaz del usuario
     * @return 
     */
    public String limpiar() {
        System.out.println("ENTRO AL LIMPIADOR");
        U= new Usuario(); 
        U.setIdUsuario(null);
        U.setNombres("");
        U.setApellidos("");
        U.setActivo(false);
        U.setFechaNacimiento(U.getFechaNacimiento());
      
        
        return "Ola";
    }


   
    public frmUsuario() {
        
    }
    
}
