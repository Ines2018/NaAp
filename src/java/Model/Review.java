/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ineza
 */
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String rId;
    @ManyToOne
    @JoinColumn (name= "parent_email")
    private Parent parent;
    @ManyToOne
    @JoinColumn (name= "nanny_email")
    private Nanny nanny;
    private String revDetails;

    public Review() {
    }

    public Review(String rId, Parent parent, Nanny nanny, String revDetails) {
        this.rId = rId;
        this.parent = parent;
        this.nanny = nanny;
        this.revDetails = revDetails;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Nanny getNanny() {
        return nanny;
    }

    public void setNanny(Nanny nanny) {
        this.nanny = nanny;
    }

    public String getRevDetails() {
        return revDetails;
    }

    public void setRevDetails(String revDetails) {
        this.revDetails = revDetails;
    }

    

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.rId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Review other = (Review) obj;
        if (!Objects.equals(this.rId, other.rId)) {
            return false;
        }
        return true;
    }
    
    
    
}
