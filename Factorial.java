/**
*         Calcula el valor de un factorial.
*         Cambiado
*/
 
public class Factorial {
 
  public int calcularFactorial(int i) {
    if (i > 0) {
      return i * calcularFactorial(i - 1);
    } else {
      return 1;
    }
  }
}
