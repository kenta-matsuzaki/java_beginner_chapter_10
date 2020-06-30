public class Hero {
  private int hp;
  private String name;
  static int money;

  Hero(String name){
    this.hp = 100;
    this.name = name;
  }

  Hero(){
    this("ダミー");
  }

  void bye(){
    System.out.println("勇者は別れを告げた");
  }

  private void die(){
    System.out.println(this.name + "は死んでしまった！");
  }

  public void attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの攻撃を受けた！");
    this.hp -= 2;
    if(this.hp <= 0){
      this.die();
    }
  }

  void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }

  Sword sword;
  void attack(){
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージを与えた！");
  }

  static void setRandomMoney(){
    Hero.money = (int)(Math.random() * 1000);
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    if(name == null){
      throw new IllegalArgumentException("名前がnullである。処理を中断。");
    }
    if(name.length() <= 1){
      throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
    }
    if(name.length() >= 8){
      throw new IllegalArgumentException("名前が長すぎる。処理を中断");
    }
    this.name = name;
  }

}