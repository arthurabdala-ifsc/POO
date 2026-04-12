package ads.poo;

public class Main {
    static void main() {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mes: ").toLowerCase();

        IO.println();

        switch (mes){
            case "janeiro", "fevereiro" -> IO.println("Verão");
            case "março" -> IO.println((dia < 21) ? "Verão" : "Outono");
            case "abril", "maio" -> IO.println("Outono");
            case "junho" -> IO.println((dia < 22) ? "Outono" : "Inverno");
            case "julho", "agosto" -> IO.println("Inverno");
            case "setembro" -> IO.println((dia < 23) ? "Inverno" : "Primavera");
            case "outubro", "novembro" -> IO.println("Primavera");
            case "dezembro" -> IO.println((dia < 22) ? "Primavera" : "Verão");
        }
    }
}
