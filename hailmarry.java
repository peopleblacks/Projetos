import java.util.Scanner;
import java.util.Random; // eu acho que vou deixr vidas infinitas por enquanto

public class hailmarry{

public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

int vidas = 3;
int vidas_att = 0;


System.out.println(" Esse jogo é simples, você chuta um número e o computador vai decidir se ele é suficiente pra salvar o Grace no espaço ou não" );

Random num = new java.util.Random();

int num_par = num.nextInt(11);

int grace_num = entrada.nextInt();

do {

System.out.println("O resultdo foi: " + grace_num);

if ( grace_num < num_par){

System.out.println("O número é baixo ainda, tente denovo");

grace_num = entrada.nextInt();


} else {

System.out.println(" O número é alto demais, tente denovo");

grace_num = entrada.nextInt();

}

vidas_att++;
} while ( grace_num != num_par && vidas_att <= vidas );


    if ( num_par == grace_num){

        System.out.println("Grace foi salvo, parabens amigos");

    }

entrada.close();

}
    
}