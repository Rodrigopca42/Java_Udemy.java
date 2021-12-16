import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {
        
    

        Scanner sc = new Scanner(System.in);

        int N, i;

        System.out.println("Quantos números você vai digitar? ");

        N = sc.nextInt();

        double [] vet = new double [N];

        for (i = 0; i <N; i++) {
            System.out.println("Digite um número: ");
            vet[i] = sc.nextDouble();
        }
        
        System.out.println("Números digitados: ");
        for (i = 0; i < N; i++){
            System.out.println(String.format("%.1f", vet[1]));
        }
        sc.close();

    }
    
}
