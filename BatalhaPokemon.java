// criar sistema de segurança pros valores, criar o resto das batalhas e passar a organizar os golpes por pokemon com array de array
// além de criar o crítico e o super efetivo ( pra isso a tipagem)
// 5 curar por btalha e fazer o sistema de protect turno sim turno não


import java.util.Random;
import java.util.Scanner;
import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;


public class BatalhaPokemon {
    
public static void main (String[] args){

    Scanner entrada = new Scanner(System.in);
    Random rng = new Random();




int dano = 20;
boolean podecurar = true;
boolean curouturnoanterior = false;

ArrayList<String> nome_pokemons = new ArrayList<>();
ArrayList<Double> vida_pokemons = new ArrayList<>();

                System.out.println("Qual o primeiro pokemon da batalha?");

                String pokemon1 = entrada.nextLine();

                nome_pokemons.add(pokemon1);


                System.out.println("Qual o segundo pokemon da batalha?");

                String pokemon2 = entrada.nextLine();

                nome_pokemons.add(pokemon2);

System.out.println("Qual a vida do seu " + pokemon1  + " ? ");

double vida_poke1 = entrada.nextInt();

while ( vida_poke1 > 100 || vida_poke1 < 0){

System.out.println("HP alto ( ou baixo) demais");

vida_poke1 = entrada.nextInt();

}
System.out.println("Qual a vida do " + pokemon2  + " ? ");

double vida_poke2 = entrada.nextInt();

while ( vida_poke2 > 100 || vida_poke2 < 0){

System.out.println("HP alto ( ou baixo) demais");

vida_poke2 = entrada.nextInt();

}


vida_pokemons.add(vida_poke1);
vida_pokemons.add(vida_poke2);


System.out.println("===== Agora é hora da batalha =====");
System.out.println("Você pode realizar 4 ações durante a partida e o seu objetivo e reduzir  vida do seu oponente para 0");
System.out.println("PRIMERIA AÇÃO --- BATER ----> Você causará um total de 20 de dano ao pokemon oponente e vice versa");
System.out.println("SEGUNDA AÇÃO --- CURAR ----> Você curará um total de 10 de vida ao seu pokemon ");
System.out.println("TERCEIRA AÇÃO --- PROTEGER ----> Você ANULA todo o dano cusado ao seu pokemon pokemon naquele turno, ms só pode ser usado turno sim e turno não");
System.out.println("QUARTA AÇÃO --- FUGIR ----> Você foge da batalha igual a um covarde, não ganha nem perde");

System.out.println("_________ QUE COMEÇE A BATALHA________");

do{
System.out.println("Qual ação você vai realizar primeiro? ");
System.out.println("BATER? (1)");
System.out.println("CURAR? (2)");
System.out.println("PROTEGER? (3)");
System.out.println("FUGIR? (0)");


int opcao_batalha = entrada.nextInt();

switch (opcao_batalha) {
    case 1:
        
        vida_poke2-=dano;

        break;

    case 2:

    vida_poke1 += 10;

      break;

    case 3:

    if (podecurar == true){

        podecurar = false;
        curouturnoanterior = true;

        vida_poke1 -=0;}


       break;
    case 4:

    break;
    default:
        break;
    
    }

 System.out.println("Agora é o turno do oponente, qual opção ele vai escolher?");

 int num_aleatorio = rng.nextInt(3) +1;

 System.out.println("O seu oponente utilizou " + num_aleatorio);

 if (num_aleatorio == 1){

    vida_poke1-=dano;


 } else if (num_aleatorio == 2){


    vida_poke2 += 10;


 } else if ( num_aleatorio == 3){

if (podecurar = true){

        podecurar = false;
        curouturnoanterior = true;

        vida_poke2 -=0;}

 } 




} while ( vida_poke1 !=0 || vida_poke2 != 0);


entrada.close();
}
}
