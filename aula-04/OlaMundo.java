public class OlaMundo {

    void main() {
        // IO.println("Ola, mundo!");
        
        int i = 2;
        String s = "";

        switch (i) {
            case 1:
                s = "Um";
                break;
            default:
                s = "Outro";
                break;
        }

        IO.println(s);


    }
}