package Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C01_StreamFilterForEach {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>(Arrays.asList(5, 6, 8,  3, 8, 7, 1, 2, 4));

        ciftElemanlarıYazdırStream1( liste);//6 8 8 2 4
        System.out.println("  \n*******    ");
        kareAl1(liste);//25 36 64 9 64 49 1 4 16
        System.out.println("  \n*******    ");
        tekSayiKaresi(liste);//25 9 49 1
        System.out.println("  \n*******    ");

    }
    private static void ciftElemanlarıYazdırStream1(List<Integer> liste){
        liste.//kaynak
                stream().//akis
                filter(t->t%2==0).//filtre akis icindeki cift sayilar
                forEach(t ->System.out.print(t+ " "));//print etme
    }
    private static void kareAl1(List<Integer> liste){
        liste.//kaynak
                stream().//akis
                map(t->t*t).//akis icindeki elemanlarin karesi alindi
                forEach(t -> System.out.print(t+" "));//pirint edildi
    }
    //Task 3 Bir listeyi parametre olarak alan ve listedeki her tek sayının karesini
    //aralarında bir boşluk bırakarak konsola yazdıran metodu yazınız
    public static void tekSayiKaresi(List<Integer> liste){
        liste.//kaynak
                stream().//akis
                filter(t->t%2==1).//akis ocindeki tek sayilar fitrelendi
                map(t->t*t).//fitrelenen elemanlarin karasi alindi
                forEach(t->System.out.print(t+" "));//print




    }




}
