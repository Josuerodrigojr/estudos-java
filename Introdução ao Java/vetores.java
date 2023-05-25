import java.lang.reflect.Array;

public class vetores {
  public static void main (String[] args){
    int[] numero = new int[10];
    for (int i = 0; i< numero.length; i++){
      numero[i] = 10 +i;
      System.out.println(numero[i]);
    }
    System.out.println(Array.getInt(numero,9));
  }

}
