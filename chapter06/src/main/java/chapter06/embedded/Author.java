package chapter06.embedded;

import jakarta.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class Author {
  String name;
  LocalDate dateOfBirth;
}
