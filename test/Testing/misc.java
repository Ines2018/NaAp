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
 * @author X
 */
public class misc {
    public static void main(String[] args) {
        String email = "asifiwemanzi@gmail.com";
        String password = "pass1";
        
        GenericDao<Nanny> ndao = new GenericDao<>(Nanny.class);
        
        
        try {
            
            Nanny nanny = ndao.findById(email);
            if (nanny != null && nanny.getPassword().equals(password)){
                System.out.println("Success");
            } else {
                System.out.println("Failed");
            }
        }
        catch(Exception e){
            System.out.println("Failed");
        }
    }
}
