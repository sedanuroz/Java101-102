/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Random;

/**
 *
 * @author seda
 */
public class BattleLocation extends Location{//canavarlarla savasılacak yerler
   private Monster monster;
   private String award;
   private int maxmonsterAmount;//bir yerde birden fazla canavar bulunabilir bu değişken de canavar sayısını tutuyor
    
    public BattleLocation(Player player,String name,Monster monster,int maxMonster,String award){
        super(player, name);
        this.monster=monster;
        this.maxmonsterAmount=maxMonster;
        this.award=award;
    }
    
    
    @Override//tum battle locationlar için onLocationlar aynı olacak
    public  boolean onLocation()
    {
        int amount =RandomMonsterAmount();
        this.maxmonsterAmount=amount;
        System.out.print("Şu an " + this.getName() + "dasınız. ");
        System.out.println("Karşınıza " + amount + " tane " + this.getMonster().getName() + " çıkabilir. Dikkatli olun!!!");
        System.out.println("Şimdi ne yapmak istersin? Savaş yada Kaç......");
        System.out.println("Savaşmak istiyorsan---->S" + "\nKaçmak istiyorsan------>K");
        System.out.println("Seç birini......");
        String selectCase = sc.nextLine();
        selectCase = selectCase.toUpperCase();//kullanıcı büyük harfte girebilir küçük harfde bu karışıklığı onlemek için otomatık olarak buyuk harfe cevirdim
        if (selectCase.equals("S")) {//demek ki savaşmayı seçti
            System.out.println("Dikkatli ol her an savaş başlayabilir.");
            if (combat(amount) == true) {//true donmesı ıcın tum canavarla savasmıs ve olmemıs olmam gerekıyor
                System.out.println(this.getName() + " daki tüm düşmanları yendiniz");
                return true;
            }
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz :(((((");
            return false;
        }

        return true;
    }
    
    public boolean combat(int monsterAmount){//savas metodum
        //Kaç canavar ile karsilasıyorssm canavar sayısı kadar donguye girmeli
        for (int i = 1; i <= monsterAmount; i++) {
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());//her seferinde bunu degiştiriyorum ki yeni canavar geldiğinde canı da yenilensin diye
            PlayerStatus();
            MonsterStatus(i);
            //vurma sırasında random belirleme 
            Random rn=new Random();
            int randomHitOrder=rn.nextInt(2);
            
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {//birbirleine kaç kez vuracaklar belli değil biri olene kadar dongu devam etmeli belirsiz bu yuzden while kullandık
                if (randomHitOrder == 0) {//ilk oyuncu hamle yapacak
                    System.out.println("\nVur yada Kaç");
                    System.out.println("Vur--->V\nKaç---->K");
                    String select = sc.nextLine().toUpperCase();
                    if (select.equals("V")) {
                        System.out.println("\nSiz vurdunuz");
                        monster.setHealth(this.getMonster().getHealth() - this.getPlayer().getDamage());
                        AfterHit();
                        if (this.getMonster().getHealth() > 0) {//eger canavar olmemisse bu seefer canavar oyuncuya vurmalı
                            System.out.println("\n" + i + ". " + this.getMonster().getName() + " size vurdu ");
                            int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().avoid;//eger zırhım varsa engelleme gerceklestırmeli
                            monsterDamage = monsterDamage < 0 ? 0 : monsterDamage;//eger zırh tum damage i engellemısse hasar 0 olmalı

                            this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                            AfterHit();
                        }
                    } else {//kacmayı secti demekki
                        return false;
                    }

                } else {
                    //önce canavar vuracak
                    System.out.println("\n" + i + ". " + this.getMonster().getName() + " size vurdu ");
                    int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().avoid;//eger zırhım varsa engelleme gerceklestırmeli
                    monsterDamage = monsterDamage < 0 ? 0 : monsterDamage;//eger zırh tum damage i engellemısse hasar 0 olmalı

                    this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                    AfterHit();
                    //sıra oyuncuda
                    if (this.getPlayer().getHealth() > 0) {//eger oyuncu olmemısse
                        System.out.println("\nVur yada Kaç");
                        System.out.println("Vur--->V\nKaç---->K");
                        String select = sc.nextLine().toUpperCase();
                        if (select.equals("V")) {
                            System.out.println("\nSiz vurdunuz");
                            monster.setHealth(this.getMonster().getHealth() - this.getPlayer().getDamage());
                            AfterHit();
                        } else {//kacmayı secti demekki
                            return false;
                        }
                    }

                }

            }

            if(this.getMonster().getHealth()<this.getPlayer().getHealth()){//demekki savası oyuncu kazanmıs
                System.out.println("************"+i+". "+this.getMonster().getName()+" öldü***************");
                System.out.println(this.getMonster().getAward()+" para kazandınız");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getAward());//oyuncunun kazandıgı para eklendı
                System.out.println("Güncel paranız:"+this.getPlayer().getMoney());
                
            }else{//eger olduysem
                return false;
            }
            
            
             if(i==monsterAmount && this.getMonster().getHealth()==0 && this.getPlayer().getHealth()>0){//demekki savası oyuncu kazanmıs
                System.out.println("\n\n********************************Tüm düşmanları yendiniz*********************************************");
                 System.out.println(this.getAward()+" kazandınız.");
                 this.getPlayer().getInventory().setEarnedAward(this.getAward());
        }
            
        }
       
        return true;//eger olmedıyse oyuncu varsayılan olrak true deger donmeli
    }
    
    public void AfterHit(){
        System.out.println("Canınız:"+this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() +" Canı:"+this.getMonster().getHealth());
    }
    public void PlayerStatus() {
        System.out.println("************************Oyuncu değerleri*****************");
        System.out.println("Sağlık:" + this.getPlayer().getHealth());
        System.out.println("Silah:" + this.getPlayer().getInventory().getWeapon().name);
        System.out.println("Hasar:" + this.getPlayer().getTotalDamage());
        System.out.println("Zırh:" + this.getPlayer().getInventory().getArmor().name);
        System.out.println("Engelleme:" + this.getPlayer().getInventory().getArmor().avoid);
        System.out.println("Para:" + this.getPlayer().getMoney());
        

    }
    public void MonsterStatus(int i){
        System.out.println("***********************"+i+"."+this.getMonster().getName()+"*****************");
        System.out.println("Sağlık:" + this.getMonster().getHealth());
        System.out.println("Hasar:" + this.getMonster().getDamage());
        System.out.println("Ödül:" + this.getMonster().getAward());
        System.out.println("*********************************************");
    }

    public int RandomMonsterAmount(){
        Random rn=new Random();
        return rn.nextInt(this.getMaxMonsterAmount())+1;//+1 ekleyerek 1 den max+1 arasındakı sayıları secebilir
    }
    public void setMonster(Monster monster){
        this.monster=monster;
    }
    public Monster getMonster(){
        return this.monster;
    }
    
    public String getAward(){
        return this.award;
    }
    public void setAward(String award){
        this.award=award;
    }
    public int getMaxMonsterAmount(){
        return this.maxmonsterAmount;
    }
    public void setMaxMonsterAmount(int max){
        this.maxmonsterAmount=max;
    }
}