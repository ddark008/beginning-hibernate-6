package chapter06.joined;

import jakarta.persistence.Entity;

@Entity(name="JoinedCBook")
public class ComputerBook extends Book{
  String primaryLanguage;
}
