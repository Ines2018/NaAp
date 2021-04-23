/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Controller.GenericDao;
import Model.Skill;
import org.testng.annotations.Test;

/**
 *
 * @author Ineza
 */
@Test
public class skillsTester {
    
    public static void main(String[] args) {
        GenericDao<Skill> sdao = new GenericDao<>(Skill.class);
        Skill s1 = new Skill("S01", "Driving");
        Skill s2 = new Skill("S02", "Cooking");
        Skill s3 = new Skill("S03", "French");
        Skill s4 = new Skill("S04", "English");
        Skill s5 = new Skill("S05", "Chinese");
        Skill s6 = new Skill("S06", "Singing");
        Skill s7 = new Skill("S07", "Swimming");
        Skill s8 = new Skill("S08", "Dancing");
        Skill s9 = new Skill("S09", "Cleaning");
        
        sdao.create(s1);
        sdao.create(s2);
        sdao.create(s3);
        sdao.create(s4);
        sdao.create(s5);
        sdao.create(s6);
        sdao.create(s7);
        sdao.create(s8);
        sdao.create(s9);
       
       
        
    }
    
    
}
