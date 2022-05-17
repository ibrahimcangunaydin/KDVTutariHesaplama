import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar,kdvTutar,kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = inp.nextDouble();

        boolean karar = tutar >=0 && tutar<=1000;
        double kdvOran = karar ? 0.18:0.08;

        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("KDV'siz Tütar: "+tutar);
        System.out.println("KDV Orani: "+kdvOran);
        System.out.println("KDV Tutari: "+kdvTutar);
        System.out.println("KDV'li Tutar: "+kdvliTutar);

    }
}
