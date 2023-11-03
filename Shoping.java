import java.util.*;
class Shop {
  private String name;
  private double price;
  public Shop(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
}


class Operation
  { 
   ArrayList<Shop> a = new ArrayList<>();
    public void add(Shop s) 
    {
    a.add(s);
    System.out.println("added sucessfully");
     }
    public void details()
    {
    for(Shop p:a)
    {
    System.out.println("Nmae:"+p.getName());
    System.out.println("price:"+p.getPrice());
    }
    }
    public void remove(){
    System.out.println("enter the item to remove");
    Scanner sc = new Scanner(System.in);
     String name1=sc.nextLine();
    a.remove(name1);
    System.out.println("removed sucessfully");
    }

 

  }

 

public class Shoping
  {
  public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      Operation s = new Operation();
      while(true)
        {
          System.out.println("Choose the operation");
          System.out.println("1.add\n2.Display\n3.Remove");
         int num =  sc.nextInt();
          switch(num)
            {
              case 1 :System.out.println("enter the details");
                      System.out.println("=================");
                      System.out.print("name = ");
                      sc.nextLine();
                      String name = sc.nextLine();
                      System.out.print("Price = ");
                      double price = sc.nextDouble();
                      Shop s1 = new Shop(name,price);
                      s.add(s1);
                      break;
              case 2:
                      s.details();
                      break;
              case 3 : s.remove();
                      break;
            }
        }
    }
}