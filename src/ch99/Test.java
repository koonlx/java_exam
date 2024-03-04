package ch99;

class Buyer {
  private int myMoney;
  private int appleCnt;

  Buyer(int money, int count) {
    this.myMoney = money;
    this.appleCnt = count;
  }

  public void payment(Seller seller, int money) {
    this.myMoney -= money;
    int cnt = seller.receive(money);
    this.appleCnt+=cnt;
  }

  public void showInfo() {
    System.out.println("보유 금액 : "+this.myMoney);
    System.out.println("사과 개수 : " + this.appleCnt);
  }

  // getter setter
  // public void setMyMoney(int money) {
  // this.myMoney = money;
  // }
  // public void setappleCnt(int count) {
  // this.appleCnt = count;
  // }
  // public void setPrice(int price) {
  // this.price = price;
  // }
  // public int getMyMoney() {
  // return this.myMoney;
  // }
  // public int getappleCnt() {
  // return this.appleCnt;
  // }
  // public int getPrice() {
  // return this.price;
  // }
}

class Seller {
  private int myMoney;
  private int appleCnt;
  public int price;

  Seller(int money, int count, int price) {
    this.myMoney = money;
    this.appleCnt = count;
    this.price = price;
  }

  public int receive(int money) {
    this.myMoney += money;
    int cnt = money / this.price;
    this.appleCnt-=cnt;
    return cnt;
  }

  public void showInfo() {
    System.out.println("보유금액 : "+this.myMoney);
    System.out.println("사과개수 : " + this.appleCnt);
    System.out.println("개당가격 : " + this.price);
  }

  // getter setter
  // public void setMyMoney(int money) {
  // this.myMoney = money;
  // }
  // public void setappleCnt(int count) {
  // this.appleCnt = count;
  // }
  // public int getMyMoney() {
  // return this.myMoney;
  // }
  // public int getappleCnt() {
  // return this.appleCnt;
  // }
}

public class Test {
  public static void main(String[] args) {
    Seller seller = new Seller(100000, 100, 1000);
    Buyer buyer01 = new Buyer(10000, 0);
    Buyer buyer02 = new Buyer(20000, 0);
    Buyer buyer03 = new Buyer(30000, 0);
    buyer01.payment(seller, 2000);;
    buyer02.payment(seller, 5000);
    buyer03.payment(seller, 3000);
    System.out.println("---판매자 정보---");
    seller.showInfo();
    System.out.println("---구매자 정보---");
    System.out.println("-buyer01-");
    buyer01.showInfo();
    System.out.println("-buyer02-");
    buyer02.showInfo();
    System.out.println("-buyer03-");
    buyer03.showInfo();
  }
}
