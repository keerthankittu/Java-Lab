class SuperHero{
  String name;
  String power;
 public SuperHero(String name,String power){
  this.name = name;
  this.power=power;
  }
 public void usePower(){
    System.out.println(name + "users" + power);
   }
}
class IronMan extends SuperHero{ 
 public IronMan(String name) {
  super(name,"Advanced Tec");
  }
 }
class SpiderMan extends SuperHero {
 public SpiderMan(String name){
  super(name,"web shooting spider abilities");
  }
 }
public class Hierarchial {
public static void main(String[] args) {
  IronMan ironman = new IronMan("iron man");
  SpiderMan spiderMan = new SpiderMan("Spider MAn");
  ironman.usePower();
  spiderMan.usePower();
}
}