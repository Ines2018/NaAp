/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Ineza
 */
@Entity
public class Parent {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private Long pId;
    private String name;
    private String phone;
    private String email;
    private String location;
    private String password;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
            @JoinTable (name="Appointment")
    List<Nanny> nannies = new ArrayList<>();
    public Parent() {
    }

    public Parent(Long pId, String name, String phone, String email, String location, String password) {
        this.pId = pId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.location = location;
        this.password = password;
    }

    

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Nanny> getNannies() {
        return nannies;
    }

    public void setNannies(List<Nanny> nannies) {
        this.nannies = nannies;
    }
    
      public void AddAppointment(Nanny nanny){
        nannies.add(nanny);
    }
    public void removeAppointnment(Nanny nanny){
        nannies.remove(nanny);
    }
    
    public boolean isExist(String nId){
        boolean error=false;
        for (Nanny n : nannies) {
            if(n.getnId().equals(nId))
                error = true;
        }
        return error;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.pId);
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
        final Parent other = (Parent) obj;
        if (!Objects.equals(this.pId, other.pId)) {
            return false;
        }
        return true;
    }

   
    
    
    
}
