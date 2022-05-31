package chapter06.compoundpk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CPKBook {
  @Id
  ISBN id;
  @Column
  String name;

  public CPKBook() {
  }

  public ISBN getId() {
    return id;
  }

  public void setId(ISBN id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String title) {
    this.name = title;
  }
}
