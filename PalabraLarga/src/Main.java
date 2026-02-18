import java.util.Scanner;

/*

 */
class main {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        Scanner read = new Scanner(System.in);
        int resp;
        do {
            System.out.print("Palabra 1:");
            palabra1 = read.nextLine();
            System.out.print("Palabra 2:");
            palabra2 = read.nextLine();

            int dif;
            if (palabra1.length() > palabra2.length()) {
                dif = palabra1.length() - palabra2.length();
                System.out.println("La palabra " + palabra1 + " tiene " + dif + " letras mas que " + palabra2);

            }
            if (palabra2.length() > palabra1.length()) {
                dif = palabra2.length() - palabra1.length();
                System.out.println("La palabra " + palabra2 + " tiene " + dif + " letras mas que " + palabra1);

            }
            if (palabra1.equals(palabra2)) {
                System.out.println("Las dos palabras son iguales");
            }
            System.out.println("Quieres repetir el programa? Si:1 No:0");
            resp = read.nextInt();

        } while (resp == 1);
    }
}
