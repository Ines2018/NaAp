/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Controller.GenericDao;
import Model.Nanny;
import Model.Skill;

import org.testng.annotations.Test;

/**
 *
 * @author Ineza
 */
@Test
public class test {
    public static void main(String[] args) {
        GenericDao dao= new GenericDao<Nanny>(Nanny.class);
        GenericDao sdao = new GenericDao<Skill>(Skill.class);
        Nanny n= new Nanny();
        
        n.setnId(Long.parseLong("125"));
        n.setName("mukamana");
        n.setPhone("250787098766");
        n.setEmail("iiii.som");
        
        Skill s =(Skill) sdao.findById("S01");
        n.registerSkill(s);
        
        dao.create(n);
        
        
        
        
//        Nanny na= new Nanny();
//        
//        na.setnId("12");
//        na.setName("mukamisha");
//        na.setPhone("250787098766");
//        na.setEmail("oooooo");
//        dao.update(na);
//        
////        Nanny nu= new Nanny();
////        
////        nu.setnId("17");
////        dao.delete(nu);
//    
    
    }
}
