/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Controller.GenericDao;
import Model.Nanny;
import Model.Parent;
import org.testng.annotations.Test;

/**
 *
 * @author Ineza
 */
@Test
public class ParentTester {

    public static void main(String[] args) {
        GenericDao dao = new GenericDao<>(Parent.class);
        Parent p =new Parent();
       
        
          p.setName("mamann");
          p.setPhone("078888888888");
          p.setEmail("in.com");
          p.setLocation("KK 221ST");
          p.setPassword("password");
          dao.create(p);
          
          
////          p.setpId("1");
////          p.setName("papa ntuza");
////          p.setPhone("078888888888");
////          p.setEmail("in.com");
////          p.setLocation("KK 221ST");
////          p.setPassword("password");
////          dao.update(p);
//
//            p.setpId("1");
//            dao.delete(p);

    
    }

}
