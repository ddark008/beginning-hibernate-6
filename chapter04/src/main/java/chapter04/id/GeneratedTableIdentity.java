package chapter04.id;

import jakarta.persistence.*;

@Entity
public class GeneratedTableIdentity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;
    @Column
    String value;

    public GeneratedTableIdentity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
