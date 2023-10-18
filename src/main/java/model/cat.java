package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class cat {
    private Integer id;
    private String name;
    private Date dob;
    private Boolean sex;

    public cat (){

    }
    public cat(Integer id, String name, Date dob, Boolean sex) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.sex = sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Id //primary key
    @GeneratedValue  //auto generate
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Boolean getSex() {
        return sex;
    }
}
