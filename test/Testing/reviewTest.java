/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Controller.GenericDao;
import Model.Nanny;
import Model.Parent;
import Model.Review;
import org.testng.annotations.Test;


/**
 *
 * @author Ineza
 */
@Test
public class reviewTest {
      public static void main(String[] args) {
        GenericDao dao = new GenericDao<>(Review.class);
        
        
        Parent p = new Parent();
        p.setpId(Long.parseLong("1"));
        Nanny n = new Nanny();
        n.setnId(Long.parseLong("17"));
       Review r =new Review();
          r.setParent(p);
          r.setNanny(n);
          r.setrId("03");
          r.setRevDetails("Hello you are a gem");
          
          dao.create(r);
    
}
}