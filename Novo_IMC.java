import java.util.Scanner;  // melhorar a proteção contra dados errados e colocar um Sout pra cada estado de peso

public class Novo_IMC{

public static void main (String[] args){

    Scanner entrada = new Scanner(System.in);

System.out.println("Qual o peso do paciente? Use vírgula para casas decimais.");

double peso = entrada.nextDouble();

do{

System.out.println("Dado inválido, digite um valor válido");

peso = entrada.nextDouble();

} while (peso <= 0);


System.out.println("Qual a altura do paciente? Use vírgula para casas decimais e dê altura em centímetros.");

double altura = entrada.nextDouble();

do{

System.out.println("Dado inválido, digite um valor válido");

altura = entrada.nextDouble();

} while (altura <= 0);


System.out.printf("O índice IMC do paciênte é : %.2f", calculo_imc(peso , altura) );

if ( calculo_imc(peso, altura) > 50){

System.out.println("Acim do ideal, se maior de 57 está com tendência a obesidade");

} else if (calculo_imc(peso, altura) < 50 && calculo_imc(peso, altura) >20){

System.out.println("Na faixa peso ideal, acima de 40 considere no sobrepeso");

} else if (calculo_imc(peso, altura) < 20){

System.out.println("Abaixo da faixa de peso ideal, risco severo de inanição");

}


}


public static double calculo_imc(double peso, double altura){

  return peso/(altura * altura);

}

}
