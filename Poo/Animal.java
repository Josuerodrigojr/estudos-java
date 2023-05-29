public class Animal {
  protected String nome;
  protected String cor;
  protected double altura;
  protected double peso;
  protected String estadoDeEspirito;

  Animal(String nome, String cor, double altura, double peso, String estadoDeEspirito){
    this.nome = nome;
    this.cor= cor;
    this.altura = altura;
    this.peso = peso;
    this.estadoDeEspirito = estadoDeEspirito;
    
  
  }
  public void setEstadoDeEspirito(String estadoDeEspirito){
    this.estadoDeEspirito = estadoDeEspirito;
  }

  public String getEstadoDeEspirito(){
    return estadoDeEspirito;
  }
  protected void comer(){

  };
  protected void dormir(){

  };

  protected void soar(){
    System.out.println("");
  }

}
