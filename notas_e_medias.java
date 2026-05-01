import java.util.Scanner;


public class notas_e_medias {
    public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

double nota = 0;
int contador=0;
double soma = 0;
int i = 0;
System.out.println("Qual o nome do aluno?");

String nome = entrada.nextLine();

do{

System.out.println("Qual a nota de " + nome + " no bimestre " + (i + 1) +" caso queira sair, digite {-1}");

nota = entrada.nextDouble();

soma += nota;
contador++;
i++;
} while (nota >= 0 && nota != -1 && nota <= 10 && i < 4);

if(nota > 10 || nota < 0){

System.out.println("Nota inválida");

}

if (nota >= 0 && nota <= 10){double media = soma/contador;

System.out.println("A media anual de "+ nome +" é " + media);

if (media > 7){ System.out.println(nome + " foi provado");}
else if (media <7 && media >4) {System.out.println(nome +" está de recuperação");}
else {System.out.println(nome + "está automaticamente reprovado");}
 }
 entrada.close();}
}
