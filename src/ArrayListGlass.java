import java.util.ArrayList;

public class ArrayListGlass {
    public static void main(String[] args) {
        ArrayList<String> townsList = new ArrayList<String>();
        townsList.add("Tartu");
        townsList.add("Parnu");
        townsList.add("Rakvere");
        townsList.add("Viljandi");
        townsList.add("Narva");
        townsList.add("Haapsalu");
        townsList.add("Valga");
        townsList.add("Keila");
        System.out.println(townsList);
        for (String townAliasVar : townsList){
            if (townAliasVar.length() > 5){
                System.out.println("I have not been to " + townAliasVar + " yet..");
            }
            System.out.println("I love " + townAliasVar);
        }

    }
}