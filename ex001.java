

public class ex001 {

    public static void main (String[] args){

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 20; 
        salario = 5800.5;
        altura = 1.63;
        genero = 'F';
        nome = "Maria da Silva";


        System.out.println("Idade ="+ idade);
        System.out.println("Salario = R$ "+ String.format("%.2f", salario ));
        System.out.println("Altura = "+ String.format("%.2f", altura));
        System.out.println("Sexo = "+ genero);
        System.out.println("Nome = "+ nome);

      


    }
}