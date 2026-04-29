import java.util.Scanner;

public class Soma_Média {
  
    public static void main(String[] args){

Scanner entrada = new Scanner(System.in);

System.out.println("Qual o número de hoje? Vale decimal");

double a = entrada.nextDouble();

System.out.print ("Manda outro pra pist. Decimal também é valido aqui");

double b = entrada.nextDouble();
double x = soma_media(a,b);
System.out.print("seus números são: " + a +" e " + b +" e a nossa média ponderada de hoje é: " + x );
 entrada.close();
    }
   
    public static double soma_media(double a, double b){

    return (a+b)/2 ;
}
}