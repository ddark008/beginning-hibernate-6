package chapter07.validated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@NoQuadrantIII
public class Coordinate {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;
  @NotNull
  Integer x;
  @NotNull
  Integer y;
}
