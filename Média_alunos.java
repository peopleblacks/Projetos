import java.util.Locale;
import java.util.Scanner;

public class Média_alunos {
public static void main (String[] args){

Scanner nv = new Scanner (System.in);

String texto;

System.out.println("Qual o nome do aluno?");

texto = nv.nextLine();

texto = texto.trim().toUpperCase();

System.out.println("Qual a nota do primeiro bimestre");

double a = nv.nextDouble();

System.out.println("Qual a nota do segundo bimestre");

double b = nv.nextDouble();

System.out.println("Qual a nota do terceiro bimestre");

double c = nv.nextDouble();

System.out.println("Qual a nota do quarto bimestre");

double d = nv.nextDouble();

double x = operadorMedia (a,b,c,d);

if ( x >= 1 && x <= 10 ){

System.out.printf("sua média anual é: %.2f\n", operadorMedia(a, b, c, d));

if ( x >= 7){

    System.out.print("Parabéns " + texto + " você foi aprovado");

} else if ( x >3 && x <= 5) 
    {
    System.out.print( texto + " Você está de recuperação");

} else {

    System.out.print ( texto + " Você está automaticamente reprovado");
}

 
 
} else {System.out.println("nota invalida garotão, tenta outra seu bosta");}

    nv.close();
}

public static double operadorMedia (double a, double b, double c, double d) {

Locale.setDefault(Locale.US);

return ( a + b + c + d)/4;

}

}
 // depurar a aproximação de notas e quando aprender banoc de dados por um boolean acerca da frequencia