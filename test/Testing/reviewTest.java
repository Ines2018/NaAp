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
        GenericDao pdao = new GenericDao<>(Parent.class);
        GenericDao ndao = new GenericDao<>(Nanny.class);

        Parent p = (Parent) pdao.findById("ines@gmail.com");
        Nanny n = (Nanny) ndao.findById("asifiwemanzi@gmail.com");
        Review r = new Review();
        r.setParent(p);
        r.setNanny(n);
        r.setRevDetails("Hello you are a gem");

        dao.create(r);

    }
}
