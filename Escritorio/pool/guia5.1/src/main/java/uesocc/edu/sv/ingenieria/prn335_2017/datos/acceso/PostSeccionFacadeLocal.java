/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.PostSeccion;

/**
 *
 * @author cesarlinares
 */
@Local
public interface PostSeccionFacadeLocal {

    void create(PostSeccion postSeccion);

    void edit(PostSeccion postSeccion);

    void remove(PostSeccion postSeccion);

    PostSeccion find(Object id);

    List<PostSeccion> findAll();

    List<PostSeccion> findRange(int[] range);

    int count();
    
}
