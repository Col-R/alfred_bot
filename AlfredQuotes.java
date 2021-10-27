import java.util.Date;
public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting (String name, String dayPeriod){
        return (String.format("Good %s, %s. Lovely to see you", name, dayPeriod));
    }
    public String dateAnnoucement(){

        return "Current date is ";
    }
    public String respondBeforeAlexis(String conversation) {
        return "placeholder for snarky response return string";
    }
}