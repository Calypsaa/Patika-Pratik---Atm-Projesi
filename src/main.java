import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı girin: ");
            userName = scanner.nextLine();
            System.out.print("Şifernizi girin: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme giriş yaptınız");

                do {
                    System.out.println("1- Para Yatırma \n" +
                            "2-Para Çekme \n" +
                            "3-Bakiye Sorgulama \n" +
                            "4-Çıkış yap");
                    System.out.print("Lutfen yapmnak istediğiniz işlemi seçiniz :");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Çekeceginiz miktarı girin: ");
                            int amount = scanner.nextInt();
                            if (amount > balance) {
                                System.out.println("Bu kadar parayı çekemezsiniz");
                            } else {
                                balance -= amount;
                            }
                            break;

                        case 3:
                            System.out.println("Kalan bakiyeniz :" + balance);
                            break;
                        default:
                            System.out.println("Yanlış bir işlem değeri girdiniz");
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere..");
                break;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                System.out.println("Giriş Hakkınız : " + --right);
            }


        }
    }
}
