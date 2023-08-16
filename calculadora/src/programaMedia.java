public class programaMedia {
    public static void main(String[] args) {

        double n1,n2,ados,media;

        calculaMedia calcula = new calculaMedia();
        boletimUI UI = new boletimUI();

        n1= UI.pedirNota("Informe a primeira nota: ");
        n2= UI.pedirNota("Informe a segunda nota: ");
        ados= UI.pedirNota("Informe a terceira nota: ");

        media = calcula.calcularMedia(n1,n2,ados);
        UI.escrever("Sua media e de: "+media);
        UI.escrever(UI.situacao(media));
    }
}
