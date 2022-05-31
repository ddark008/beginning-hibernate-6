package chapter06.embedded;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class User {
  @Id
  @GeneratedValue
  Long id;
  String name;
  // this is... not wise from a security perspective
  String password;
  @ElementCollection
  List<String> passwordHints;
}
