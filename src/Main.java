import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1 den başlayarak birer birer artan kaç elemanlı bir dizi oluşturmak istersiniz ? : ");
        int n = sc.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 1;
            System.out.print(dizi[i]+" ");
        }

        double harmonicSum = 0.0;

        for (int i = 0; i < dizi.length; i++) {
            harmonicSum += 1.0 / dizi[i];
        }

        System.out.println("Harmonik toplam : " + harmonicSum);
        System.out.println("Harmonik ortalama : "+harmonicSum/dizi.length);

    }
}
