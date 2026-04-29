import java.util.Scanner;

public class tempo_registros{

public static void main(String[] args){

Scanner entrada = new Scanner(System.in);


double maior = Double.NEGATIVE_INFINITY;
double menor = Double.POSITIVE_INFINITY;
double soma = 0.0;

System.out.println("Qual a quantia de registros?");

int registros = entrada.nextInt();

for (int i = 0; i < registros; i++){

System.out.println("Qual o tempo do registro (em minutos) "+ (i +1) +"?");

double tempo = entrada.nextDouble();

soma += tempo;

if (tempo > maior) {
maior = tempo;
} 
if (tempo < menor){menor = tempo;}

while(tempo <1 || tempo >60){

System.out.println("Tempo invalido");

tempo = entrada.nextInt();
}



}



double media = soma / registros;

System.out.printf("Soma: %.2f ",soma );

System.out.printf("Media: %.2f",media);

System.out.printf("Maior: %.2f", maior);

System.out.printf("Menor: %.2f", menor);
entrada.close();
}
}

