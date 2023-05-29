public class POO{
public static void main(String[] args) {
    Cachorro cachorro1;
    cachorro1 = new Cachorro("Clarencio", "Amarelo", 0.90, 22.00, 0.5);
    Cachorro cachorro2 = new Cachorro();
    Cachorro cachorro3 = new Cachorro("null", "null", 0, 0, 0);
    Passaro passaro = new Passaro("Steven", "Rosa", 0.90, 22.00, "Feliz");
    Petshop petshop = new Petshop();
    // cachorro1.setNome("Clarencio");
    // cachorro1.cor = "Amarelo";
    // cachorro1.altura = 0.90;
    // cachorro1.peso = 22.00;
    // cachorro1.tamanhoDoRabo = 0.5;
    System.out.println(cachorro2.altura);
    cachorro1.soar();
    System.out.println( cachorro1.pegar());
    System.out.println( cachorro3.interagir("carinho"));
    System.out.println(cachorro1.getNome());
    System.out.println("Número de cachorros: " + Cachorro.getNumeroDeCachorro());
    System.out.println("Testando a herança: " + passaro.cor);
    petshop.darBanho(passaro);
    System.out.println(passaro.getEstadoDeEspirito());
  }
}