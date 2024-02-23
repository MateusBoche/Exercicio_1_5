import java.util.Scanner;

public class Exercico02 {
    public static void main(String[] args) {
        Exercico02 app = new Exercico02();
        app.start();
    }

    private void start() {
        double soma = 0;
        int contador = 0;

        while (true) {
            double valor = obterValor();
            if (valor == -1) {
                break;
            }
            soma += valor;
            contador++;
        }
        if (contador >= 4) {
            double media = calcularMedia(soma, contador);
            System.out.println("A média dos valores é: " + media);
        } else {
            System.out.println("Insira pelo menos 4 valores.");
        }


    }

    public float obterValor() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor ou -1 para sair: ");
        float valor = s.nextFloat();
        return valor;
    }



    public float calcularMedia(double soma, int contador){
        float media = (float) (soma /contador);
        return media;


    }




}
