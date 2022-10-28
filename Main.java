import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float tutar,kdvliTutar,kdvTutari;
        Scanner input = new Scanner(System.in);

        System.out.println("Ürünün tutarını giriniz: ");
        tutar = input.nextFloat();

        if( tutar <= 1000){
            kdvTutari =0.18f;
            kdvliTutar = ((kdvTutari) * tutar)+tutar;

            System.out.println("KDV'siz tutar:  "+tutar);
            System.out.println("KDV 'li tutar: "+kdvliTutar);
            System.out.println("KDV tutarı: "+kdvTutari);


        }
        else if ( tutar> 1000){
            kdvTutari = 0.08f;
            kdvliTutar = (kdvTutari * tutar)+tutar;
            System.out.println("KDV'siz tutar:  "+tutar);
            System.out.println("KDV 'li tutar: "+kdvliTutar);
            System.out.println("KDV tutarı: "+kdvTutari);

        }

    }
}
