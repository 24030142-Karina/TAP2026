import java.util.*;
void main() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingresa la altura: ");
        int alt=scan.nextInt();
        System.out.println("Ingresa la ancho: ");
        int anch=scan.nextInt();

        for (int i=0; i<alt; i++) {
            for (int j = 0; j < anch; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Numero de lados: ");
        int lados=scan.nextInt();

        for (int k=0; k<lados; k++) {
            for (int r = 0; r < lados; r++) {
                System.out.print("*");
                lados=lados+2;

            }
        System.out.println();
    }


    }

