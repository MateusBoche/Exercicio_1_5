import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Exercicio05 app = new Exercicio05();
        app.start();
    }

    private void start() {

        String teste = obterPalavra();

        try {
            if (teste.length()>1){
                System.out.println(teste);

                String[] palavraSeparada = separarString(teste);
                System.out.println(palavraSeparada[palavraSeparada.length -2]);
                if (palavraSeparada.length>=4){
                    System.out.println("Texto muito longo");
                }

            }else {
                System.out.println("nada foi escrito");

            }

        }catch (RuntimeException exception){
            System.out.println("Precisa digitar uma frase");
        }

//        if (teste.length()>1){
//            System.out.println(teste);
//
//            String[] palavraSeparada = separarString(teste);
//            System.out.println(palavraSeparada[palavraSeparada.length -2]);
//            if (palavraSeparada.length>=4){
//                System.out.println("Palavra muito grande");
//            }
//
//        }else {
//            System.out.println("nada foi escrito");
//
//        }

    }

    public String[] separarString(@org.jetbrains.annotations.NotNull String frase){
        String[] fraseSeparada = frase.split(" ");
        return fraseSeparada;



    }


    public String obterPalavra(){
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        return frase;
    }
}
