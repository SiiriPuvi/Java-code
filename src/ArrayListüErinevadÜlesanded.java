import java.util.Arrays;

public class ArrayListüErinevadÜlesanded {
    //public static void main(String[] args) {

              //  ytleTere();
            //}

            //alamprogramm
            //static void ytleTere(){
                //System.out.println("Tere maailm!");
            //}
    public static void main(String[] args) {
        //String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
        //System.out.println(nimed[5]);
        //int suvArv = (int) Math.floor(Math.random() * 6);
        //System.out.println(nimed[suvArv]);
        //int[] juustePikkused = new int[6];

        //lisame väärtused massiivi
        //juustePikkused[0] = 30;
        //juustePikkused[1] = 45;
        //juustePikkused[2] = 76;
        //juustePikkused[3] = 11;
        //juustePikkused[4] = 4;
        //juustePikkused[5] = 18;

        //trükime välja
        //System.out.println(juustePikkused[3]);

        //String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
        //int nimedKokku = nimed.length;
        //System.out.println("Nimesid kokku: "+nimedKokku);


        String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };//esimene rida nimesid esimene rida ja teine teine rida
        System.out.println(nimed[0][2]);//esimene sulg tähistab [rida] ja teine [veergu].

        int[] numbrid = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1
        };
        int koguarv = numbrid.length;
        System.out.println("väljastab esimese elemendi väärtuse:" +numbrid[1]);
        System.out.println("väljastab viimase elemendi väärtuse:" +numbrid[35]);
        System.out.println("leiab elementide arvu massiivis: "+ koguarv);
        System.out.println("leiab elementide summa massiivis: " + Arrays.stream(numbrid).sum());
        System.out.println("leiab arvude aritmeetilise keskmise: " + Arrays.stream(numbrid).sum()/36);

        }}
