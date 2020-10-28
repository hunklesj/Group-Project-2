import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int houses;
    System.out.println("How many Houses");
    houses = s.nextInt();
    Pillowcase pillowcase1 = new Pillowcase();
    while(houses>0){
       pillowcase1.getCandy();
       houses = houses --;
  }
  pillowcase1.printNumCandies();
  }
}

class Candy {
  private String candy;

Candy(){
  candy = "";
}

Candy(String aName) {
  candy = aName;
}
String getName(){
  return candy;
}
void setCandy(String theCandy){
  candy = theCandy;
} 

void print(String candyName){
System.out.println(candyName);
}

}
class Pillowcase{
  private ArrayList<Candy>candies;
  private int numberofhouses;

  Pillowcase(){
    numberofhouses = 0;
    ArrayList<Candy>candies = new ArrayList<Candy>();
  }
  int get(){
    return numberofhouses;
  }
  void getCandy(){
    String candyName = "";
    System.out.println("Trick or Treat!");
    Random r = new Random();
    int x;
    int candyReceived = 0;
    int randomInt = r.nextInt(100) + 1;
    x = randomInt;
if( x < 8){
  candyName = "Kit Kat";
}
else if(x<16){
  candyName = "Milky Way";
}
else if(x<26){
  candyName = "M&M's";
}
else if (x<51){
  candyName = "Reese's";
}
else if (x<68){
  candyName = "Hershey's Bar";
}
else if (x<88){
  candyName = "Pink Starburst";
}
else if (x<101){
  candyName = "Twix";
    }
Candy candy1 = new Candy(candyName);
candies.add(candy1);
candyReceived = candyReceived +1;
}

void printNumCandies(){
    int typeofcandy[] = new int [7];
if(candies.get(4).getName().equals("Kit Kat"));
  typeofcandy[0] = typeofcandy[0] +1;
}
}