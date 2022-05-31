package chapter06.single;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name="SingleBook")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Book {
  // contents common to all Books go here
  @Id
  Long bookId;
  String title;
  // imagine many more
}
