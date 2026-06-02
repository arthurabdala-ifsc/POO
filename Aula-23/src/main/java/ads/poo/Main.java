package ads.poo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

//        Caixa<String> c = new Caixa<>("Olá mundo");
//        Caixa<Pessoa> d =  new Caixa<>(new Pessoa("João"));
//
//        String s = c.getConteudo();
//
//        String errado = d.getConteudo().getNome();
//
//        ArrayList<String> a;
//
//        HashMap<String,String> b;
//
//
//
//        IO.println(errado);

        Scanner ler = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Entre com o número: ");
            a = ler.nextInt();
            System.out.println("Entre com o número: ");
            b = ler.nextInt();

            int res = a / b;

            System.out.println(a + " divido por " + b + " = " + res);
        }catch (InputMismatchException e){
            System.err.println("Só é permitido números inteiros");
            ler.nextLine();
        }catch (ArithmeticException e){
            System.err.println("Informe apenas números divisiveis");
            ler.nextLine();
        }catch (Exception e){
            System.err.println(e.getMessage());
            ler.nextLine();
        }



        System.out.println("Fim do programa");

    }
}
