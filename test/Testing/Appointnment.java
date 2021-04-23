/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Controller.GenericDao;
import Model.Nanny;
import Model.Parent;


/**
 *
 * @author Ineza
 */
public class Appointnment {
    public static void main(String[] args) {
        
        GenericDao<Parent> dao = new GenericDao<>(Parent.class);

        Parent p = dao.findById("1");

        GenericDao<Nanny> sdao = new GenericDao<>(Nanny.class);

        Nanny n = sdao.findById("17");
        p.AddAppointment(n);
        dao.update(p);
    }
    
}
