import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringsEdatas {
  public static void main (String[] args){
    String nome = "Josué";
    //Para escrever tudo em letra minuscula
    System.out.println(nome.toLowerCase());
    //Para escrever tudo em letra maiuscula
    System.out.println(nome.toUpperCase());
    //Tamanho da minha variável
    System.out.println(nome.length());
    //Verificar se duas váriaveis são identicas
    String segundoNome = "josué";
    System.out.println(nome.equals(segundoNome));
    //Caso queira que ignore as condições de maiusculo e minusculo
    System.out.println(nome.equalsIgnoreCase(segundoNome));
    //Para representar a data atual
    // LocalDate data = LocalDate.now();

    // Locale brasil = new LocaleBuilder().setLanguage;
    
    // System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.FULL, ));


  }
}
