/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import dao.EquipoDao;
import org.junit.Test;
import pojo.Equipo;

/**
 *
 * @author rafaelm
 */
public class TestingEquipoDao {
    @Test
    public void hello(){
        
        EquipoDao equipoDao = new EquipoDao();
        
        equipoDao.saveEquipo("Alemania", "Europa");
        
        System.out.println(equipoDao.getEquipoById(3).getNombre());
        Equipo equipito = new Equipo();
        equipito.setNombre("Portugal");
        equipito.setContinente("Europeos");
        boolean si =equipoDao.updatebyId(2, equipito);
        System.out.println(si);
    }
}
