public class Test {
    public static void main(String[] args) {
int a=50;
a-=40;
        System.out.println(a);{
        int b=10;
        b*=10;
        System.out.println(b);
    }
        int c=100;
        c/=50;
        System.out.println(c);

        boolean boolValue1 = true;
        boolean boolValue2 = false;
        System.out.print(boolValue1 && boolValue2);

        double n = 99.9989;
        int m = (int) n;
        System.out.println(m);

        double x = 99.9989;
        int i = (int) Math.round(x);
        System.out.println(m);

            float temperature = 36.6f;
            if (temperature > 36.6f) {
                System.out.print("You have a fever!");
            } else{
                System.out.print("You are healthy!");
            }
        String text = "Hahahah! Funny joke!";
        System.out.print(text.replaceAll("a", "o"));

}}
