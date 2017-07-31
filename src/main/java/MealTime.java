import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class MealTime {

    public static void main(String[] args) {
        whatYouAskFor("breakfast");
        whatYouAskFor("lunch");
        whatYouAskFor("dinner");

    }

    public static void whatYouAskFor(String meal){
        try {
            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What did you eat for your " + meal +"?");
            String yourMeal = bufferedReader.readLine();

            System.out.println("You had " + yourMeal + " for your " + meal);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
