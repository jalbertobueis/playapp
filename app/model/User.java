package model;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
public class User {

    @Id
    @GeneratedValue
    public Long id;
    public String name;
    public String surname;
    public String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
