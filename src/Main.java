import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    //Cree un def avec un mot et def

    public static void main(String[] args) {
        String word;
        int choice = 0;
        Map<String, String> dictionnaire = new HashMap<>();
        dictionnaire.put("chien", "animal qui fait wouf");
        dictionnaire.put("chat", "animal qui fait miaou");

        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Quelle définition voulez-vous parmis la liste suivante? : \n");
            System.out.println("Les mots disponibles sont : " + dictionnaire.keySet());

            word = sc.next();
            if(dictionnaire.get(word) == null){
                System.out.println("Le mot n'existe pas");
            }else{
                System.out.println("La définition est : " + dictionnaire.get(word) + "\n");

            };
            System.out.println("Que voulez-vous faire? ");
            System.out.println("1 - Avoir une autre définition ");
            System.out.println("2 - Quitter le programme");

            choice = sc.nextInt();


        }while(choice != 2);



    }
}