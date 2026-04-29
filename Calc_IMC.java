import java.util.Locale;
import java.util.Scanner;
public class Calc_IMC {
    public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

System.out.print("Qual o seu peso? em kg");
double x = entrada.nextDouble();

entrada.useLocale(new Locale("pt","Br"));

System.out.print("Qual a sua altura? em cm");
double y = entrada.nextDouble();

entrada.useLocale(new Locale("pt","Br"));

double w = y / 100;

double z = x / (w * w);

double imc = Math.round (z * 10)/10;

System.out.println("seu indice IMC é:" + imc);

if (y >= 190 && imc >= 10) {
    System.out.println("Ta obeso!");

} else if (y >= 190 && imc <= 9.99){
    System.out.println(" estás magrelito");

} else {
    System.out.println("AINDA VOU FAZER PARA MENORES DE 190");
}


entrada.close();

   }
}
// coloar sistema de mediddas na massa e na altura para melhorar o calculo, por string para nome e delimitar indices ideais (na medida, acima do peso ou abaixo do peso) junto a uma delimitação por altura e modular os calculos