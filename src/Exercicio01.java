import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Exercicio01 app = new Exercicio01();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        int valor1 = obterValor();
        int valor2 = obterValor();
        int valor3 = obterValor();
        int valor4 = obterValor();

        int opcao = 0;
        while (true) {
            System.out.println("Digite 1 para procurar o maior valor");
            System.out.println("Digite 2 para procurar o menor valor");
            System.out.println("Digite 3 para ver se o valor é maior que 50");
            System.out.println("Difite 4 para usar a funcao match.max");
            System.out.println("Digite 5 para usar a funcao match.in");
            System.out.println("Digite uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("O maior valor é: " + maiorValor(valor1, valor2, valor3, valor4));
                    break;

                case 2:
                    System.out.println("o menor valor é: " + menorValor(valor1, valor2, valor3, valor4));
                    break;

                case 3:
                    System.out.println(valorAltoBaixo(maiorValor(valor1, valor2, valor3, valor4)));
                    break;

                case 4:
                    int n = Math.max(valor1, valor2);
                    System.out.println("o maior valor entre o valor1 e valor2 é: "+n);
                    break;

                case 5:
                    int m = Math.min(valor3, valor4);
                    System.out.println("o menor valor entre o valor3 e valor4 é: " + m);
                    break;

                default:
                    System.out.println("opcao invalida");
                    break;


            }


        }

    }

    public int obterValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor1 = scanner.nextInt();
        return valor1;


    }



    public int maiorValor(int valor1, int valor2, int valor3, int valor4){
        int maiorValor = 0;

        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4){
            maiorValor = valor1;

        }else if(valor2 > valor1 && valor2 > valor3 && valor2 > valor4){
            maiorValor = valor2;

        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
            maiorValor = valor3;

        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
            maiorValor= valor4;

        }
        return maiorValor;

    }

    public int menorValor(int valor1,int valor2, int valor3, int valor4){
        int menorValor = 0;

        if (valor1 < valor2 && valor1 < valor3 && valor1 < valor4){
            menorValor = valor1;

        }else if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4){
            menorValor = valor2;

        } else if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4) {
            menorValor = valor3;

        } else if (valor4 < valor1 && valor4 < valor2 && valor4 < valor3) {
            menorValor = valor4;

        }
        return menorValor;

    }


    public String valorAltoBaixo(int maiorValor){
        String valor = "";
        if (maiorValor>50){
            valor = "Valor muito alto";
        }else {
            valor = "valor normal";
        }
        return valor;

    }


}
