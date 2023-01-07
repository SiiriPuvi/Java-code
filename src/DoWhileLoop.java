public class DoWhileLoop {
    public static void main(String[] args) {

        int myAge = 45;

       // while (myAge < 50){
        //    System.out.println("I have go to work every day because i am " + myAge + " years old ");
        //  myAge++;

        //}
        //while (true) {
            //System.out.println("I have go to work every day because i am " + myAge + " years old ");
           //if (myAge == 60)
               //break;
            //myAge++;

            int stoppingVal = 10;
            dowhileloop: // example of naming the loop
            do {
                System.out.println("first iteration through the loop; this is the 'do' part");
                int testVar = 7;
                for (int i = 0; i < stoppingVal; i++) {
                    System.out.println("We're in the for-loop part now");
                    System.out.println("The value of i is :" + i);
                    if (i == testVar) break dowhileloop; // break out of the named loop
                }
            }
            while (true);
        }
    }
