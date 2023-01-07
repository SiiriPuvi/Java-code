public class DogMain {
    public static void main(String[] args) {
        DogClass bosca = new DogClass("black", "mixbreed",true, "Mona", "female", "small", "10");

        System.out.println("My dog name is " + bosca.name + "." + " She is " + bosca.breed );
        System.out.println("She is " + bosca.color + " color");
        System.out.println("She is a " + bosca.size + " size dog ");

        bosca.getsAngry();
        bosca.dogIs();



    }
}
