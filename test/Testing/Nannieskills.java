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
public class Nannieskills {
    public static void main(String[] args) {
        
        GenericDao<Nanny> dao=new GenericDao<>(Nanny.class);
    
          Nanny n =dao.findById("17");
          
        GenericDao<Skill> sdao= new GenericDao<>(Skill.class);
        
        Skill s = sdao.findById("S01");
        n.registerSkill(s);
        
        dao.update(n);
    }
    
   
   
    
}
