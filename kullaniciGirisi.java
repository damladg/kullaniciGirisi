import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        //Kullanıcı isim ve şifre girsin.
        // Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        // ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
        // "Şifre oluşturulamadı,lütfen başka şifre giriniz."
        // sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        String kullaniciAdi, sifre;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        kullaniciAdi = scan.nextLine();
        System.out.print("Şifreninizi giriniz :");
        sifre = scan.nextLine();

        if (kullaniciAdi.equals("damla") && sifre.equals("damla987")) {
            System.out.print("Giriş yaptınız.");
        } else {
            System.out.println("Şifreniz Yanlış!");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz? (E/H)");
            String cevap = scan.nextLine();
            if (cevap.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                String yenisifre = scan.nextLine();

                if (yenisifre.equals(sifre) || yenisifre.equals("damla987")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                } else {
                    System.out.println("Şifre oluşturuldu!");
                }
            } else {
                System.out.println("Şifre Oluşturma İşlemi İptal Edildi!");
                }
            }


        }
    }

