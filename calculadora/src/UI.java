import java.util.*;

public class UI {
    static Scanner ler = new Scanner(System.in);

    public void exibirResposta(int opcao, double n1, double n2, double resp) {
        System.out.println("###################");
        if (opcao == 1)
            System.out.printf("%.1f + %.1f = %.1f\n", n1, n2, resp);
        else if (opcao == 2)
            System.out.printf("%.1f - %.1f = %.1f\n", n1, n2, resp);
        else if (opcao == 3)
            System.out.printf("%.1f * %.1f = %.1f\n", n1, n2, resp);
        else if (opcao == 4)
            System.out.printf("%.1f / %.1f = %.1f\n", n1, n2, resp);
        else
            System.out.println("0,0");
        System.out.println("###################\n");
    }


    public double pedirNumero(String msg) {
        System.out.println(msg);
        double valor = ler.nextDouble();
        return valor;
    }


    public int menu() {
        System.out.println("---\nEscolha uma operacao:");
        System.out.println("1. Adicao");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.println("0. Sair");
        int opcao = ler.nextInt();
        return opcao;
    }

    public static void pularLinha() {
        System.out.println();
    }

}