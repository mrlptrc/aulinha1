import java.util.Scanner;

public class versaoProfessor {
    public static void main(String[] args) {
        int opcao = 0;
        double n1 = 0, n2 = 0, resp = 0;

        calc calc = new calc();
        UI ui = new UI();


        do {
            opcao = ui.menu();

            n1 = ui.pedirNumero("Informe um numero:");
            n2 = ui.pedirNumero("Informe outro numero:");
            ui.pularLinha();

            if (opcao == 1)
                resp = calc.somar(n1, n2);
            else if (opcao == 2)
                resp = calc.subtrair(n1, n2);
            else if (opcao == 3)
                resp = calc.multiplicar(n1, n2);
            else if (opcao == 4)
                resp = calc.dividir(n1, n2);

            ui.exibirResposta(opcao, n1, n2, resp);

        } while (opcao != 0);
    }




}
