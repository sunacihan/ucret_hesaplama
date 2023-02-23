import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe,yas,y_tipi;
        double toplam_ucret = 0,normal_ucret,indirimli_ucret;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi KM türünden giriniz:");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        yas=input.nextInt();
        System.out.print("Yolculuk tipi:\n1.Tek Yön\n2.Gidiş-Dönüş");
        y_tipi=input.nextInt();

        normal_ucret=mesafe*0.10;

        if((mesafe>0 && yas>0)&&(y_tipi==1 || y_tipi==2) ){
            if (yas<12){
                indirimli_ucret=normal_ucret-(normal_ucret*0.50);
            } else if (yas<=24) {
                indirimli_ucret=normal_ucret-(normal_ucret*0.10);
            }else if(yas>65){
                indirimli_ucret=normal_ucret-(normal_ucret*0.30);
            }else{
                indirimli_ucret=normal_ucret;
            }
            switch (y_tipi) {
                case 1 -> toplam_ucret = indirimli_ucret;
                case 2 -> toplam_ucret = 2 * (indirimli_ucret - (indirimli_ucret * 0.20));
                default -> System.out.println("Yolculuk tipi hatalı.");
            }
            System.out.println("Toplam tutar:"+toplam_ucret);

        }else{
            System.out.println("Hatalı veri girdiniz.");
        }

    }
}