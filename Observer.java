import java.util.List;
// Observer interface
interface Observer {
    void update(String topic, String news);
    void updateRegistration(List<String> topics);
    List<String> getTopics();
}
