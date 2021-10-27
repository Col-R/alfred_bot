import java.util.Date;
public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting (String name, String dayPeriod){
        //TODO
        return (String.format("Good %s, %s. Lovely to see you", name, dayPeriod));
    }
    public String dateAnnoucement(){
        
        public static void main(String[] args){
            AlfredQuotes id = new AlfredQuotes();
            String dateAnnoucement = id.getCurrentDate();
            System.out.println(dateAnnoucement);
        }
        Date date = new Date();
        return "Current date is " + date;
    }
    public String respondBeforeAlexis(String conversation) {
        return "placeholder for snarky response return string";
    }
}