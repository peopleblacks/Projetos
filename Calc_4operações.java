import java.util.Scanner;
import java.util.Locale;

public class Calc_4operações {

public static void main(String[] args){

Scanner sc = new Scanner (System.in);

System.out.print("Qual o primeiro número?");

double a = sc.nextDouble();

System.out.print("Qual o segundo número?");

double b = sc.nextDouble();

System.out.print("Agora, qual das 4 operções básicas vai ser realizada? soma, subt, mult, div, pot ou rad?");

String texto = sc.next().trim().toLowerCase();


if (texto.equals ("soma")) {

double x = soma  (a,b);

System.out.printf("O resultado é: %.2f\n ", x);
}
else if (texto.equals ("subt")) {

    double y = subt (a,b);

    System.out.printf("Oresultado é: %.2f\n ", y);

} 
else if (texto.equals ("mult")) {

    double z = multi (a,b);

    System.out.printf(" O resultado é: %.2f\n ", z);

}
else if (texto.equals ("div")) {

    double r = div (a,b);

    System.out.printf("O resultado é: %.2f\n ", r);

} else if (texto.equals ("pot")) {

    double i = pot (a,b);

    System.out.printf("O resultado é: %.2f\n ", i);

}  else if (texto.equals ("rad")) {

    double f = rad (a,b);

    System.out.printf("O resultado é: %.2f\n ", f);
}

else {

    System.out.println("Operção invàlida {caso tenha sido erro ortográfico, você precisa digitar igual ao comando de cima ;)}");

    sc.close();
}
}
public static double soma (double a, double b) {
Locale.setDefault(Locale.US); 

return a + b;

}

public static double subt (double a, double b) {
Locale.setDefault(Locale.US); 

return a - b;

}

public static double multi (double a, double b) {
Locale.setDefault(Locale.US); 

return a * b;

}

public static double div (double a, double b) {

Locale.setDefault(Locale.US);

if (  a == 0 || b == 0){

 return 0;

} else {

return a / b;}

}

public static double pot (double a, double b) {

Locale.setDefault(Locale.US); 

if ( a == b ){

return b * a;

} else { 

return 0;

}

}
public static double rad (double a, double b) {

Locale.setDefault(Locale.US);

if (  a == 0 || b == 0){

 return 0;

} else {

return Math.pow(a, 1.0/b);}

}


}

// adicionar potenciação eradiciação ao projeto junto de juros simples. E adicionar aos textos a possibilidade de serem escritos como pot, potenciação etc etc etc