package ispisiparneneparnebrojevearray;

import java.util.Scanner;

public class IspisiParneNeparneBrojeveArray {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj elemenata koje želite u nizu: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Neparni brojevi su: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Parni brojevi su: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

}
