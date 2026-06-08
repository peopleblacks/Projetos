import java.util.Scanner;
import java.util.Random;

public class jogo_num{

    public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

System.out.println("++++++ o jogo é o seguinte, geraremos um número aleatório entre 0 e 100 e você pequeno gafanhoto deve acertar++++++");

Random rng = new java.util.Random();

int random1 = rng.nextInt(101);

System.out.println("Qual o número????????????");

int resposta = entrada.nextInt();

do{

    if ( resposta < random1){

        System.out.println("HHHHHHHHMMMMMMMMMMMMMM ta abaixo");

        resposta = entrada.nextInt();


    } else if (resposta > random1){

        System.out.println("HHHHHHHHMMMMMMMMM passou");

        resposta = entrada.nextInt();

    }
} while ( resposta != random1);

if ( resposta == random1) {

System.out.println("Uau, parabéns!!!!");

}

    }

}