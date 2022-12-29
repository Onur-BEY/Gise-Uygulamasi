import java.util.Random;
import java.util.Scanner;

public class algoritma {

    public static void Menu()
    {
        Gise gise=new Gise();
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int siraNo;

        System.out.println("GISE UYGULAMASINA HOSGELDINIZ");
        System.out.println();
        System.out.print("Lutfen TC kimlik numaranizi giriniz: ");

        String tckn=s.nextLine();
        gise.setTC(tckn);

        if (gise.isKontrol())
        {
            siraNo=r.nextInt(100)+1;
            System.out.println("Sira numaraniz: "+siraNo);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int tus;

        do {
            Menu();
            System.out.print("Devam etmek icin 0'i cikis yapmak icin 1'i tuslayiniz: ");
            tus = s.nextInt();
            System.out.println();
            switch (tus) {
                case 1:
                    System.out.println("Cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Hatali tuslama tekrar deneyiniz!");
                    System.out.print("Devam etmek icin 0'i cikis yapmak icin 1'i tuslayiniz: ");
                    tus = s.nextInt();
                   while (tus!=0 && tus!=1)
                    {
                        System.out.println("Hatali tuslama tekrar deneyiniz!");
                        System.out.print("Devam etmek icin 0'i cikis yapmak icin 1'i tuslayiniz: ");
                        tus = s.nextInt();
                    }
            }
        } while (tus != 1);
    }
}
