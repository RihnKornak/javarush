import com.javarush.test.level14.lesson06.home01.Country;
import com.javarush.test.level14.lesson06.home01.Hen;
import com.javarush.test.level14.lesson06.home01.Solution;

/**
 * Created by Maxxx on 06.07.2016.
 */
public class RussianHen extends Hen
{
    int N = 9999;
    String Sssss = Country.BELARUS;
    public int getCountOfEggsPerMonth(){return 500;}
    public String getDescription(){
        String s =  super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return s;}
}