package chapter04.id;

import jakarta.persistence.*;

@Entity
public class GeneratedAutoIdentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    String value;

    public GeneratedAutoIdentity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
