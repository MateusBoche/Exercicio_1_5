import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Exercicio04 app = new Exercicio04();
        app.start();
    }

    private void start() {
        System.out.println("Digite a string para ser convertida: ");
        String numeroString  = coletarString();
        int n = converterString(numeroString);
        System.out.println("você digitou uma string : "+ numeroString);
        System.out.println("A conversao para int ficou: " + n );

    }


    public String coletarString(){
        Scanner scanner = new Scanner(System.in);
        String numeroString = scanner.nextLine();
        return numeroString;
    }

    public int converterString(String numeroString){
        return Integer.parseInt(numeroString);


    }
}
