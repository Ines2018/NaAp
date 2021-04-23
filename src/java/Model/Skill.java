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
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Ineza
 */
@Entity
public class Skill {

    @Id
    private String code;
    private String name;
   
    @ManyToMany(mappedBy = "skills", cascade = CascadeType.ALL)
    
    private List<Nanny> nannies = new ArrayList<>();

    public Skill() {
    }

    public Skill(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Nanny> getNannies() {
        return nannies;
    }

    public void setNannies(List<Nanny> nannies) {
        this.nannies = nannies;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.code);
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
        final Skill other = (Skill) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

   

   
}
