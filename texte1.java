import java.util.Scanner;

public class texte1 {
    
public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

int contador = 0;
double soma = 0;
double tempo = 0;
do{

System.out.println("Digite os tempos dos turnos. Digite -1 para sair");

tempo = entrada.nextDouble();

if ( tempo == -1){}

else if (tempo < 0 && tempo != -1) {
    
System.out.println("Perdão, tempo inválido");

} else { 
    contador++;

soma += tempo;} 

}while( tempo != -1);


double media = soma/contador;

System.out.println("A media é " + media);
System.out.println("O contador é " + contador);
System.out.println("A soma é " + soma);
entrada.close();}
}
