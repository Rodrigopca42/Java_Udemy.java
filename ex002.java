import java.util.Scanner;

public class ex002 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double salario1, salario2;
        String nome1, nome2;
        int idade;
        char sexo;

        System.out.println("Nome da Primeira Pessoa :");
        nome1 = sc.nextLine();
        System.out.println("Salario da Primeira Pessoa : R$ ");
        salario1 = sc.nextDouble();

        System.out.println("Nome da Segunda Pessoa: ");
        sc.nextLine(); // ---------------------limpeza de buffer
        nome2 = sc.nextLine();
        System.out.println("Salario de Segunda Pessoa: R$ ");
        salario2 = sc.nextDouble();
        
        System.out.println("Qual é o sexo (F) ou (M) ? ");
        sexo = sc.next().charAt(0);
        System.out.println("Qual é a idade? ");
        idade = sc.nextInt();

        System.out.println("Nome 1 = " + nome1);
        System.out.println("O funcionario(a) " + nome1 + ", ganha R$ " + salario1);
        System.out.println("Nome 2 = "+ nome2);
        System.out.println("O funcionario(a) "+nome2+ ", ganha R$ "+ salario2);
        System.out.println("O sexo é :"+ sexo);
        System.out.println("A idade é :"+ idade);

        sc.close();


    }
}
