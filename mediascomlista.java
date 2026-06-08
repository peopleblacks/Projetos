import java.util.Scanner;
import java.util.ArrayList;
// fechar as rebarbas do código no fim de semana

public class mediascomlista {
    
public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

ArrayList<String>alunos = new ArrayList<>();

ArrayList<ArrayList<Double>>notas = new ArrayList<>();

int g = 0 ;



System.out.println("Quantos alunos são?");

int n_alunos = entrada.nextInt();
entrada.nextLine();


for ( int i = 0; i< n_alunos; i++) {

System.out.println("Qual o nome do aluno?");

String nome = entrada.nextLine();

alunos.add(nome);

notas.add(new ArrayList<>());

}


do{

    double soma = 0;

System.out.println("Qual a nota do aluno no primeiro bimestre?");

double n1 = entrada.nextDouble();

System.out.println("Qual a nota do aluno no segundo bimestre?");

double n2 = entrada.nextDouble();

System.out.println("Qual a nota do aluno no terceiro bimestre?");

double n3 = entrada.nextDouble();

System.out.println("Qual a nota do aluno no quarto bimestre?");

double n4 = entrada.nextDouble();

notas.get(g).add(n1);
notas.get(g).add(n2);
notas.get(g).add(n3);
notas.get(g).add(n4);

    for (int j = 0; j < notas.get(g).size(); j++){

        soma += notas.get(g).get(j);

    }


double media = soma/4;

System.out.println("O aluno " + alunos.get(g) + " conseguiu a nota " + media);



g++;

}while(g < n_alunos);



entrada.close();
}
}



