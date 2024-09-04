/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Game {

    private Scanner sc = new Scanner(System.in);//sadece bu classda kullanacağım için private tanımladım
    Player player;
    Location location;

    public void start() {
        System.out.println("Macera oyununa hoşgeldiniz!");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = sc.nextLine();
        //player sınıfından bir oyuncu nesnesi üretmeliyim
        Player player = new Player(playerName);
        System.out.println(player.getName() + " bu karanlık ve sisli adaya hoşgeldin...Burada yaşananların hepsi gerçek...");
        System.out.println("*******************************************************************");
        player.SelectCharacter();

        //bulunamk istediği konumu sorgulamalıyım
        while (true) {
            player.printPlayerInformation();
            System.out.println("*******************************************************************");
            System.out.println("Bölgeler:\nID:1 Güvenli ev---->Burada düşman yoktur ve canınız yenilenir");
            System.out.println("ID:2 Mağaza--->Buradan zırh ve silah satın alabilirsiniz");
            System.out.println("ID:3 Orman---->Ormanda  odun bulabilirisin.Ama ormanda vampir yaşıyor .Dikkatli ol");
            System.out.println("ID:4 Mağara--->Mağarada yemek bulabilirisin.Ama mağarada zombi yaşıyor .Dikkatli ol");
            System.out.println("ID:5 Nehir---->Nehirde su bulabilirisin.Ama nehirde ayı yaşıyor .Dikkatli ol");
            System.out.println("ID:6 Oyunu sonlandır");

            System.out.println("Lütfen gitmek istediğiniz bölgenin ID değerini giriniz");
            int selectLoc = sc.nextInt();
           
            while (selectLoc == 3 && player.getInventory().getEarnedAward().contains("Odun") == true) {//yanı ormana gitmissem ve odul ed almıssam  yeniden gidememeliyim
                System.out.println("Ormandaki tüm düşmanlarla savaştınız ve odun kazandınız."
                        + "Tekrar ormana gidemezsiniz.Lütfen yeni bir bölge giriniz.");
                selectLoc = sc.nextInt();
            }
            while (selectLoc == 4 &&  player.getInventory().getEarnedAward().contains("Yemek") == true) {//yanı ormana gitmissem ve odul ed almıssam  yeniden gidememeliyim
                System.out.println("Mağaradaki tüm düşmanlarla savaştınız ve yemek kazandınız."
                        + "Tekrar mağaraya gidemezsiniz.Lütfen yeni bir bölge giriniz.");
                selectLoc = sc.nextInt();
            }
            while (selectLoc == 5 &&  player.getInventory().getEarnedAward().contains("Su") == true) {//yanı ormana gitmissem ve odul ed almıssam  yeniden gidememeliyim
                System.out.println("Nehirdeki tüm düşmanlarla savaştınız ve su kazandınız."
                        + "Tekrar nehire gidemezsiniz.Lütfen yeni bir bölge giriniz.");
                selectLoc = sc.nextInt();
            }
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new Cave(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = null;
                    break;

                default:
                    System.out.println("Geçersiz bir bölge girdiniz.Şimdilik güvenli eve gönderildin");
                    location=new SafeHouse(player);
                    break;

            }
            //asağıdakı 2 if den birine girdiği anda while döngüsünden çıkılacak ve oyun son bulmuş olacak.
            //bu yuzden cıkısı sectiğinde location a null deger atayıp if ile onu bulup döngüden cıkmaya calıstık
            if (location == null) {
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin.");
                break;
            }
            if (location.onLocation() == false)//ise demmeki karakter olmüş
            {
                System.out.println("GAME OVER");
                break;
            }
            if(selectLoc==1&& player.getInventory().getEarnedAward().contains("Odun")&& player.getInventory().getEarnedAward().contains("Yemek") && player.getInventory().getEarnedAward().contains("Su")){
                //eğer tüm ödülleri toplamıs ve guvenli eve donmussem oyunu kazandım ve bitttii;
                System.out.println("\n\n"
                        + "****************************************************\n"
                        + "     ****************** WİN ****************\n"
                        + "****************************************************");
                System.out.println("Tüm canavarlarala savaşıp ödülleri toplayıp güvenli eve ulaşmayı başardın ve oyunu kazandın");
                System.out.println("TEBRİKLER  "+player.getName()+" :)))))))");
                break;
            }
        }

    }
}