import javax.swing.*;

public class DogClass {
    //Data: define our attribute
    //color,breed, isHairy, name,haigLenght,  sex, size
    public String color ;
    public String breed;
    public Boolean isHairy;
    public String name;
    public String sex;
    public String size;
    public String weight;

    public DogClass(String color, String breed, boolean isHairy, String name, String sex, String size, String weight) {
        this.color = color;
        this.breed = breed;
        this.isHairy = isHairy;
        this.name = name;
        this.sex = sex;
        this.size = size;
        this.weight = weight;
    }

        public void getsAngry() {
            System.out.println("If my dog is angry she will bite");
            }
            public void sleep() {
                System.out.println("zzzzzzz");
            }
            public void dogIs(){
                System.out.println("My dog is "+ this.color + " and " + this.weight + " kg ");
            }
            }


