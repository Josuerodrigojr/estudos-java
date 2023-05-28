
//Criei a classe
public class Cachorro {
  //Definir os objetos
  private String nome;
  public String cor;
  public double altura;
  public double peso;
  public double tamanhoDoRabo;
  public String estadoDeEspirito;
  static int numeroDeCachorro;
  //Para a segurança do usuário, que posso colocar as variáveis como privadas.
  public String getNome(){
    return this.nome;

  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public static int getNumeroDeCachorro(){
    return numeroDeCachorro;
  }

  
//Construtor, o que vai construir nossa classe

Cachorro(){}

Cachorro(String nome, String cor, double altura, double peso, double tamanhoDoRabo){
  this.nome = nome;
  this.altura = altura;
  this.peso = peso;
  this.tamanhoDoRabo = tamanhoDoRabo;
  numeroDeCachorro++;

}


//Criei um método (ação) 
  public void latir(){
    System.out.println("Au au");
  }
  public String pegar(){
    return "Pegou";
  }
  public String interagir(String acao){
    if (acao.equals("carinho")){
      this.estadoDeEspirito = "feliz";
      
    } else{
      this.estadoDeEspirito = "neutro";
    }
    return estadoDeEspirito;
  }
}
