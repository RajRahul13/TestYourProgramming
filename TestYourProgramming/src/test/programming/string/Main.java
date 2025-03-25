package test.programming.string;


class EncapsulationExample {
   private String name;
   public void setName(String name) {
       this.name = name;
   }
   public String getName() {
       return name;
   }
}
public class Main {
   public static void main(String[] args) {
       EncapsulationExample obj = new EncapsulationExample();
       obj.setName("John");
       System.out.println(obj.getName());
   }
}