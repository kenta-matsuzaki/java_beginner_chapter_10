public class Main {
  public static void main(String[] args){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h = new Hero();
    h.setName("健太");
    h.sword = s;

    
    // Hero h1 = new Hero();
    // h1.setName("健太");
    // h1.sword = s;

    // Hero h2 = new Hero();
    // h2.setName("松崎");

    // Hero h3 = new Hero();
    // h3.setName("");

    // Wizard w = new Wizard();
    // w.name = "スガワラ";
    // w.hp = 88;

    // Cleric c = new Cleric("美穂子", 35, 80);
    // c.selfAid();
    
    // w.heal(h1);
    // w.heal(h2);
    // w.heal(h2);

    // Hero.setRandomMoney();
    // System.out.println(Hero.money);
    // System.out.println(h1.money);
  }
}