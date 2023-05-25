public class estruturasCondicionais {
  public static void main (String[] args){
   int nota = 70;
   if (nota>=70){
    System.out.println("O aluno está aprovado");
   } else{
    System.out.println("O aluno está reprovado");
   }

   // Nota do aluno
   if(nota>=80){
    System.out.println("Nota A");

   } else if (nota<80 && nota>=70){
    System.out.println("Nota B");
   } else if(nota<70 && nota>= 60){
    System.out.println("Nota C");
   } else if(nota<60 && nota>0){
    System.out.println("Nota D");
   } else {
    System.out.println("Nota inválida");
   }

  }
}
