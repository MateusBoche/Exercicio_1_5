import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Exercicio03 app = new Exercicio03();
        app.start();
    }

    private void start() {
        System.out.println("Digite a palavra para ser invertida");
        Scanner s = new Scanner(System.in);
        String palavra = s.nextLine();
        int i =0;
        int j = palavra.length() -1;
        String palavraInvertida = "";
        String x = "";

        while (j>=i){
            x = String.valueOf(palavra.charAt(j));
            palavraInvertida += x;

            j-=1;

        }
        System.out.println("A palavra invertida é: "+ palavraInvertida);

    }

}
