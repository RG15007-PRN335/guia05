/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335_2017.datos.acceso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

/**
 *
 * @author cesarlinares
 */
@Stateless
public class TipoSeccionFacade extends AbstractFacade<TipoSeccion> implements TipoSeccionFacadeLocal {

    @PersistenceContext(unitName = "ues.edu.sv.ingenieria.prn335.2017_guia5.1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoSeccionFacade() {
        super(TipoSeccion.class);
    }
    
}
