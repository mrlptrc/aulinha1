import java.util.Scanner;

public class boletimUI {

    public Scanner sc = new Scanner(System.in);

    public double pedirNota(String msg){
        System.out.println(msg);
        double valor = sc.nextDouble();
        return valor;
    }
    public String escrever(String msg){
        System.out.println(msg);
        return msg;
    }

    public String situacao(double media) {
        String situacao;

        if (media >= 6) {
           situacao = escrever("Parabens, aprovado.");
        } else {
            situacao = escrever("Infelizmente, reprovado");
        }
        return situacao;
    }
}
