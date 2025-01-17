package chapter07.validated;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class QuadrantIIIValidator
    implements ConstraintValidator<NoQuadrantIII, Coordinate> {
  @Override
  public void initialize(NoQuadrantIII constraintAnnotation) {
  }

  @Override
  public boolean isValid(
      Coordinate value,
      ConstraintValidatorContext context
  ) {
    return !(value.getX() < 0 && value.getY() < 0);
  }
}
