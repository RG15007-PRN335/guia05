/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335_2017.datos.acceso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.RolCategoria;

/**
 *
 * @author cesarlinares
 */
@Stateless
public class RolCategoriaFacade extends AbstractFacade<RolCategoria> implements RolCategoriaFacadeLocal {

    @PersistenceContext(unitName = "ues.edu.sv.ingenieria.prn335.2017_guia5.1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolCategoriaFacade() {
        super(RolCategoria.class);
    }
    
}
