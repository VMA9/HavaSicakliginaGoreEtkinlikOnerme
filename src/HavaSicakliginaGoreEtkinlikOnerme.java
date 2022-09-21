import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz. ");
        } else if (heat >= 10 && heat <= 25) {
            System.out.println("Pikniğe Gidebilirsiniz. ");
        }
            if (heat >= 5 && heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz. ");
            }
            if (heat >= 25){
                System.out.println("Yüzme Gidebilirsiniz. ");
            }

        }
    }