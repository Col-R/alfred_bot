public class AlfredTest {
    public static void main(String[] args){
        // one instance to access all its methods
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        String testDateAnnoucement = alfredBot.dateAnnoucement();

        String alexisTest = alfredBot.respondBeforeAlexis(
            "Alexis! Play some lo-fi beats."
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is"
        );
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );

        System.out.println(testGreeting);
        
    }
}

