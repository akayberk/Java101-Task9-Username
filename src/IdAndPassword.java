import java.util.Scanner;


public class IdAndPassword {
    public static void main(String[] args) {
        String username,password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanici adi: ");
        username = sc.nextLine();
        System.out.print("Sifre: ");
        password = sc.nextLine();

        if (username.equals("admin") && password.equals("123a123")){
            System.out.println("Basarili bir sekilde giris yaptiniz.");
        }
        else {
            System.out.println("Giris bilgileri hatali goruyor.");
            System.out.print("Sifrenizi degistirmek ister misinz (Y/n)");
            if (sc.nextLine().equals("y")){
                System.out.println("Yeni sifrenizi yaziniz.");
                String newPassword = sc.nextLine();
                if (newPassword.equals(password)){
                    System.out.println("Sifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else
                    password = newPassword;
                System.out.println("Sifreniz basariyla degistirildi.");
            }
            else{
                System.out.println("Keyfin bilir pasam...");
            }

        }

    }


}

