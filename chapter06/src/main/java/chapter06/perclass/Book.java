package chapter06.perclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name="PerClassBook")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Book {
  // contents common to all Books go here
  @Id
  Long bookId;
  String title;
  // imagine many more
}
