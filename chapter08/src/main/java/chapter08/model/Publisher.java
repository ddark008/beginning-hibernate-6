package chapter08.model;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
public class Publisher {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String name;
}
