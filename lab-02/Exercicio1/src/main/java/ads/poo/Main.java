package ads.poo;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        IO.print("Entre com o dia: ");
        int dia = scanner.nextInt();

        String mes = IO.readln("Entre com o mês: ");

        switch (mes) {
            case "janeiro", "fevereiro":
                IO.print("Verão");
                break;
            case "março":
                if ((dia > 20)) {
                    IO.print("Primavera");
                } else {
                    IO.print("Verão");
                }
                break;
            case "abril", "maio":
                IO.print("Outono");
                break;
            case "junho":
                if ((dia > 20)) {
                    IO.print("Inverno");
                } else {
                    IO.print("Outono");
                }
            case "julho", "agosto":
                IO.print("Inverno");
                break;
            case "setembro":
                if ((dia > 22)) {
                    IO.print("Primavera");
                } else {
                    IO.print("Inverno");
                }
                break;
            case "outubro", "novembro":
                IO.print("Primavera");
                break;
            case "dezembro":
                if ((dia > 20)) {
                    IO.print("Verão");
                } else {
                    IO.print("Primavera");
                }
                break;
            default:
                IO.print("Valores inválidos!");
                break;
        }

        scanner.close();
    }
}
