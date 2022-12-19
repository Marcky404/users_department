package br.com.userdept.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "tb_departments")
public class Department implements Serializable {

    private static final Long serialVersionUID = 1L;

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto identação do Id.
    private Long id;
    private String name;


    public Department(){}

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
