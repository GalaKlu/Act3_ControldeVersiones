import java.util.Scanner;
public class KlubkovaGalinaFRASE {
    public static void main(String[] args) {
        String frase;
        String reverso = "";
        String redact;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase para comprobar si es una frase palíndroma.");
        frase = entrada.nextLine();
        redact = frase.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(",", "")
                .replace(" ", "");
        for (int i = redact.length() - 1; i >= 0; i--) {
            reverso = reverso + redact.charAt(i);
        }
        if (redact.equals(reverso)) {
            System.out.println("La frase introducida es " + redact);
            System.out.println("Esta frase a la inversa es " + reverso);
            System.out.println(frase + " es un palíndromo");
        } else {
            System.out.println("La frase introducida es " + redact);
            System.out.println("Esta frase a la inversa es " + reverso);
            System.out.println(frase + " no es un palíndromo");

        }

    }

}
