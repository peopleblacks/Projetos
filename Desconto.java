import java.util.Scanner;

public class Desconto {
 
public static void main (String[] args){


    Scanner ent = new Scanner (System.in);

    System.out.println("Qual o valor da compra?");
    double a = ent.nextDouble();

    if (a >= 500){

 double x = a * 0.8;

 System.out.printf("O valor da compra com desconto é: %.2f\n ", x);

    } else if (a >= 200 && a <= 499.99){

double y = a * 0.9;

System.out.printf("O valor da compra com desconto é: %.2f\n", y);


    } else {

System.out.printf("Sua compra não possui desconto, portanto o valor é: ", a);

    }
ent.close();
}

}
