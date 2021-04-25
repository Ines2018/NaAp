/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
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
public class Nanny {
    
    private String name;
    private String gender;
    private Date dob;
    private String phone;
    @Id
    private String email;
    private String location;
    private Double price;
    private String password;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Skill> skills = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
            @JoinTable (name="Bookings")
    List<Parent> parents = new ArrayList();

    public Nanny() {
    }

    public Nanny(String name, String gender, Date dob, String phone, String email, String location, Double price, String password) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.location = location;
        this.price = price;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Skill> getSkill() {
        return skills;
    }

    public void setSkill(List<Skill> skills) {
        this.skills = skills;
    }

      public void registerSkill(Skill skill){
        skills.add(skill);
    }
    public void removeSkill(Skill skill){
        skills.remove(skill);
    }
    
    public boolean ExistingSkill(String code){
        boolean error=false;
        for (Skill s : skills) {
            if(s.getCode().equals(code))
                error = true;
        }
        return error;
    }
    
    public void addParent(Parent parent){
        parents.add(parent);
    }
    
    public void removeParent(Parent parent) {
        parents.remove(parent);
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final Nanny other = (Nanny) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
   

    
}
