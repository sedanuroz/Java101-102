/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author seda
 */
public class ToolStore extends NormalLocation{
    public ToolStore(Player p){
        super(p, "Mağaza");
    }
     @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz..");
        boolean showMenu=true;
        while (showMenu) {
            System.out.println("ID:1  Silahlar\nID:2 Zırhlar \nID:3 Çıkış");
            int select = sc.nextInt();
            while (select < 1 || select > 3) {
                System.out.println("Yanlış bir değer girdiniz .Lütfen istediğiniz seçeneğın ID değerini tekrar giriniz:");
                select = sc.nextInt();
            }

            switch (select) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                  
                    System.out.println("Bir daha bekleriz :)");
                    showMenu=false;//olldugu zaman menu gösterme döngüsünden çıkacak
                    break;
            }
        }
        return true;  
    }

      public void printWeapon() {//varolan sılahları ekrana yazdırır
        System.out.println("*****************SİLAHLAR************************");
        for (Weapon w : Weapon.weapon()) {//bu sekilde ekrana sılhları yazdırabiliriz
            System.out.println("ID:" + w.ıd + "\tİsim:" + w.name + "\tHasar:" + w.damage + "\tPara:" + w.price);
        }
          System.out.println("ID:"+(Weapon.weapon().length+1)+"\tÇıkış");

    }
       
      public void buyWeapon(){//satın alma işlemini yapar
              System.out.println("Seçmek istediğiniz silahın Id değerini giriniz.");
            int select=sc.nextInt();
        while(select<1 || select>Weapon.weapon().length+1){//+1 dememizin sebebi 3 silah secenegi var +1 de cikiş seçeneği eklediğimiz için 4 oldu
            System.out.println("Yanlış bir değer girdiniz .Lütfen istediğiniz seçeneğın ID değerini tekrar giriniz.");
            select=sc.nextInt();
        }
        if(select !=Weapon.weapon().length+1){//demekki bir satın alma işlemi yapılacak
            Weapon selectWeapon=Weapon.GetWeaponObjectById(select);
        if(Weapon.GetWeaponObjectById(select)!=null){//eger bir silah secmıssem
            if(selectWeapon.price>this.getPlayer().getMoney()){//ve param silahı almaya yetmediyse
                System.out.println("Yeterli paranız bulunmamaktadır");
            }else if(this.getPlayer().getMoney()>=selectWeapon.price){//param yettiyse
                System.out.println(selectWeapon.name+ " satın alındı.");
                this.getPlayer().setMoney(this.getPlayer().getMoney()-selectWeapon.price);//silahı aldıktan sonra kalan paramızın değerini hesapladık ve değerini değiştirdik
                     System.out.println("Kalan paranız :"+this.getPlayer().getMoney());   
                     
                     System.out.println("Önceki silahınız:"+this.getPlayer().getInventory().getWeapon().name);
                      this.getPlayer().getInventory().setWeapon(selectWeapon);//player ımın sahip olduğu silahı da değiştirmiş oldum
                     System.out.println("Yeni silahınız:"+this.getPlayer().getInventory().getWeapon().name);//ismini ekrana yazdırdık
            }
             
        }
        }
        
        
      
      }
       public void printArmor(){
          System.out.println("*****************ZIRHLAR************************");
        for (Armor a : Armor.armor()) {//bu sekilde ekrana zırhları yazdırabiliriz
            System.out.println("ID:" + a.ıd + "\tİsim:" + a.name + "\tEngelleme:" + a.avoid + "\tPara:" + a.price);
        }
          System.out.println("ID:"+(Armor.armor().length+1)+"\tÇıkış");
       }
       
        public void buyArmor(){//zırh satın alma işlemini yapar
              System.out.println("Seçmek istediğiniz zırhın  Id değerini giriniz.");
            int select=sc.nextInt();
        while(select<1 || select>Armor.armor().length+1){
            System.out.println("Yanlış bir değer girdiniz .Lütfen istediğiniz seçeneğın ID değerini tekrar giriniz.");
            select=sc.nextInt();
        }
        
        if(select!=Armor.armor().length+1){//yanı cıkıs secenegını secmedıysek
            Armor selectArmor=Armor.GetArmorObjectById(select);
        if(Armor.GetArmorObjectById(select)!=null){//eger bir zırh secmıssem
            if(selectArmor.price>this.getPlayer().getMoney()){//ve param zırh almaya yetmediyse
                System.out.println("Yeterli paranız bulunmamaktadır");
            } else if (this.getPlayer().getMoney() >= selectArmor.price) {//param yettiyse
                System.out.println(selectArmor.name + " zırh satın alındı.");
                this.getPlayer().setMoney(this.getPlayer().getMoney() - selectArmor.price);//zırhı aldıktan sonra kalan paramızın değerini hesapladık ve değerini değiştirdik
                System.out.println("Kalan paranız :" + this.getPlayer().getMoney());
                System.out.println("Önceki zırhınız:" + this.getPlayer().getInventory().getArmor().name);
                this.getPlayer().getInventory().setArmor(selectArmor);//player ımın sahip olduğu zırhı da değiştirmiş oldum
                System.out.println("Yeni zırhınız:" + this.getPlayer().getInventory().getArmor().name);//ismini ekrana yazdırdık
            }

        }
        }
        

    }
}

