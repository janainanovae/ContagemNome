import java.util.Scanner;

public class ContagemNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Informe um número positivo: ");
        int n = scanner.nextInt();

        // Contagem crescente: de 0 até n
        System.out.println();
        System.out.println("Contagem crescente:");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // Contagem decrescente: de n até 0
        System.out.println();
        System.out.println("Contagem decrescente:");
        int contador = n;
        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        // Exibição do nome: n vezes se tiver mais de 6 letras, senão apenas 1 vez
        System.out.println();
        if (nome.length() > 6) {
            for (int i = 0; i < n; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println(nome);
        }

        scanner.close();
    }
}
