import java.util.List;

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Create a news agency
        NewsAgency newsAgency = new NewsAgency();

        // Create news channels
        NewsChannel channel1 = new NewsChannel("Channel 1", List.of("Sports", "Technology"));
        NewsChannel channel2 = new NewsChannel("Channel 2", List.of("Politics"));
        NewsChannel channel3 = new NewsChannel("Channel 3", List.of("Technology","Politics"));

        // Register news channels with the news agency
        newsAgency.register(channel1);
        newsAgency.register(channel2);
        newsAgency.register(channel3);

        // Post news
        newsAgency.postNews("Sports", "New record set in a sports event!");
        System.out.println();
        newsAgency.postNews("Politics", "Election results announced!");
        System.out.println();
 
       newsAgency.postNews("Technology", "New smartphone launched!");

        // Unregister a news channel
        newsAgency.unregister(channel2);

        // Post news again
        System.out.println();
        newsAgency.postNews("Politics", "New policy implemented!");
    }
}
