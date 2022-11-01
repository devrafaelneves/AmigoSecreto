import java.util.Scanner;
import java.util.Random;

public class Aula{
    public static void main (String[]args){

        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        boolean cadastro = true;

        String[] nomes = new String [4];
        String[] tirados = new String [4];

        int nomesCadastrados = 0;
        int nomesSorteados = 0;
        //quando nome "sortear" ele para o loop
        
        while (true) { // enquanto os nomes sorteados forem < 3(começa com zero)
            //cadastra as pessoas
            if (cadastro) {
                System.out.println("Digite os nomes: ");
            String nome = scan.nextLine();
            nomes[nomesCadastrados] = nome;
            nomesCadastrados++;

            if (nomesCadastrados>3) {
                cadastro = false;
            }
            //adiciona em nomes[]
        }
        else{
            //começa o sorteio
            //Cadastro FALSE

            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();

            int numeroSorteado = rdm.nextLine(3);

            
            
            //nome [tal] = nome SE SIM volta pro random
            if (nome == nomes[numeroSorteado]){
                //sortear de novo
            }
            // j = random.nextInt(4);
            //numero random  - nomes.lenght
            //Se nao System.out.println("Seu amigo secreto é " + cadastro[tal]);
            else{
                int nSorteados = 0;
                //sortear de novo
                boolean jaSorteado = false;
                //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
            for (int i = 0; i < 4; i++) {
                jaSorteado = (nomes[numeroSorteado] == sorteados[i]);
                System.out.println(random.nextInt(4));
                if (jaSorteado){
                    break;
                }
                else{
                    //dizer quem ele tirou no amigo secreto e ARMAZENAR em outra lista, que no caso funciona como contador
                    System.out.println("Você tirou o " + nomes[numeroSorteado]); 
                    sorteados[nSorteados] = nomes [numeroSorteado];
                    nSorteados++;
                }
            } 
            }
            //remove esse cadastro dos nomes 
        }
        
    }
    scan.close();
}


        

//ARRAY/LISTA, vamos fazer
// public class Aula{
//     public static void main (String[]args){
        
//         System.out.println("HelloW0rld");
//     }

// }