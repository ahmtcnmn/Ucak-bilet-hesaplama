import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int yas, tip, km, indirim;
        double tutar;
        String ad;
        out.print("Lüften adınızı ve soyadınızı giriniz : ");
        ad = input.nextLine();
        out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        out.print("Yolculuk mesafesini belirtiniz(km cinsinden) : ");
        km = input.nextInt();
        out.print("Yolculuk tipinizi seçini ;" +
                "\n1:Gidiş\n2:Gidiş ve geliş\n  Seçiniz : ");
        tip = input.nextInt();
        if (tip == 1 || tip == 2) ;
        else {
            out.print("Hatalı giriş yaptınız. Tekrar deneyiniz.");
            out.print("Yolculuk tipinizi seçini ;" +
                    "\n1:Gidiş\n2:Gidiş ve geliş\n  Seçiniz : ");
            tip = input.nextInt();

        }

        switch (tip) {
            case 1:
                if (yas < 12) {
                    tutar = (km * 0.10) * 0.50;
                    out.println("Yolculuk bilgileriniz; ");
                    out.println("Yolcu Ad ve Soyad: " + ad);
                    out.println("Yolcu Yaş: " + yas);
                    out.println("Yolculuk mesafesi: " + km+"km");
                    out.printf("Yolculuk tutarı: " + tutar+"TL");
                    break;
                }
                if ((yas > 12) && (yas < 25)) {
                    tutar = (km * 0.10) * 0.90;
                    out.println("Yolculuk bilgileriniz; ");
                    out.println("Yolcu Ad ve Soyad: " + ad);
                    out.println("Yolcu Yaş: " + yas);
                    out.println("Yolculuk mesafesi: " + km+"km");
                    out.printf("Yolculuk tutarı: " + tutar+"TL");
                    break;
                }
                if (yas > 65) {
                    tutar = (km * 0.10) * 0.70;
                    out.println("Yolculuk bilgileriniz; ");
                    out.println("Yolcu Ad ve Soyad: " + ad);
                    out.println("Yolcu Yaş: " + yas);
                    out.println("Yolculuk mesafesi: " + km+"km");
                    out.printf("Yolculuk tutarı: " + tutar+"TL");
                    break;
                }
            case 2:
                if (yas < 12) {
                    tutar = ((km * 0.10) * 0.50) * 0.80;
                    out.println("Yolculuk bilgileriniz; ");
                    out.println("Yolcu Ad ve Soyad: " + ad);
                    out.println("Yolcu Yaş: " + yas);
                    out.println("Yolculuk mesafesi: " + km+"km");
                    out.printf("Yolculuk tutarı: " + tutar+"TL");
                    break;
                }
                if ((yas > 12) && (yas < 25)) {
                    tutar = ((km * 0.10) * 0.90) * 0.80;
                    out.println("Yolculuk bilgileriniz; ");
                    out.println("Yolcu Ad ve Soyad: " + ad);
                    out.println("Yolcu Yaş: " + yas);
                    out.println("Yolculuk mesafesi: " + km+"km");
                    out.printf("Yolculuk tutarı: " + tutar+"TL");
                    break;
                }
                if (yas > 65) {
                    tutar = ((km * 0.10) * 0.70) * 0.80;
                    out.println("Yolculuk bilgileriniz; ");
                    out.println("Yolcu Ad ve Soyad: " + ad);
                    out.println("Yolcu Yaş: " + yas);
                    out.println("Yolculuk mesafesi: " + km+"km");
                    out.printf("Yolculuk tutarı: " + tutar+"TL");
                    break;
                }
        }

    }
}