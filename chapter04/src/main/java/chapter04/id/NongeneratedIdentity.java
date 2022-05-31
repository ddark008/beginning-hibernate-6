package chapter04.id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NongeneratedIdentity {
    @Id
    Long id;
    @Column
    String value;

    public NongeneratedIdentity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
