import java.util.Scanner;
public class calculadora {

    Integer caso;
    double n1;
    double n2;

    public static String msg;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    new calculadora();
    }

    public static String escrever(String msg){
        System.out.println(msg);
        return msg;
    }

    public calculadora(){
        Integer caso;
        double n1;
        double n2;

        escrever("Qual das seguintes acoes voce quer realizar:");
        escrever("0 - sair");
        escrever("1 - adicao");
        escrever("2 - subtracao");
        escrever("3 - divisao");
        escrever("4 - multiplicacao");
        caso = sc.nextInt();

        if (caso == 0){
            escrever("Saindo do programa");
            return;
        }

        escrever("Digite o primeiro numero");
        n1 = sc.nextDouble();
        escrever("Digite o segundo numero");
        n2 = sc.nextDouble();

        switch (caso){
            case 1:
                double i = n1+n2;
                escrever("O resultado da soma e de: "+i);
                break;
            case 2:
                double j = n1-n2;
                escrever("O resultado da soma e de: "+j);
                break;
            case 3:
                double k = n1/n2;
                escrever("O resultado da soma e de: "+k);
                break;
            case 4:
                double l = n1*n2;
                escrever("O resultado da soma e de: "+l);
                break;
        }
    }
}
