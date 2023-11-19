package Array;
//@author Márcio Zica

/* O obejetivo do desafio era deixar o usuário escolher quantos campos o array iria possuir para registrar as notas
 * e usar dois "for" (por isso não fiz tudo em um único "for") um para preecher o array e o outro para percorrer e somar
 * e mostrar a média ao final.
 */ 

import java.util.Scanner;

public class MediaComArray {
   
    public static void main(String[] args) {
        //Código lógico do programa
        
        int numeroNotas;
        String nomeAluno;
        double somaNotas = 0;    
               
        Scanner digitadoNoConsole = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        nomeAluno = digitadoNoConsole.nextLine();
                
        System.out.println("Informe quantas notas tem o ano letivo: ");
        numeroNotas = digitadoNoConsole.nextInt();
        
        double[] notas = new double[numeroNotas];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = digitadoNoConsole.nextDouble();
        }
        
        //a variável nota vai receber os valores que estão dentro do array notas um a um
        for (double nota: notas){
            somaNotas+= nota;
        }
        
        System.out.println("A média do aluno(a) " + nomeAluno + " foi de " + (somaNotas/numeroNotas) + " pontos.");
        
        digitadoNoConsole.close();
    }
    
}
