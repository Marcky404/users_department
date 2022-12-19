package br.com.userdept.entities;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "tb_users")
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String email;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public User(){}

    public User(Long id, String name, String email, Department department ) {
        Id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
