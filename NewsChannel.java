import java.util.List;
// Concrete observer class
class NewsChannel implements Observer {
    private String name;
    private List<String> topics;

    public NewsChannel(String name, List<String> topics) {
        this.name = name;
        this.topics = topics;
    }

    @Override
    public void update(String topic, String news) {
        System.out.println(name + " received news on topic: " + topic);
        System.out.println("News: " + news);
    }

    @Override
    public void updateRegistration(List<String> topics) {
        System.out.println(name + " registered for topics: " + topics);
    }

    @Override
    public List<String> getTopics() {
        return topics;
    }
}