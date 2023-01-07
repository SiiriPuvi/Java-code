public class Person {
    public int height;
    public int age;
    public int weight;
    public String name;
    public Person(int height, int age, int weight, String name){
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.name = name;

    }
   public void introduceMyself() {
       System.out.println("Hi my name is " + this.name + " and I am " + this.age + "" +
               " A bit out of shape i weight " + this.weight + " kilos. " +
               "But i will lose this weight, no worries :)" +
               " My height is " + this.height + " So i have to lose 10-20 kg");
   }
}
