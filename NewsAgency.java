import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Concrete subject class
class NewsAgency implements Subject {
    private Map<String, List<Observer>> observersMap;

    public NewsAgency() {
        observersMap = new HashMap<>();
    }

    @Override
    public void register(Observer observer) {
        List<String> topics = observer.getTopics();

        for (String topic : topics) {
            if (!observersMap.containsKey(topic)) {
                observersMap.put(topic, new ArrayList<>());
            }
            observersMap.get(topic).add(observer);
        }

        // Notify the newly registered observer
        observer.updateRegistration(topics);
    }

    @Override
    public void unregister(Observer observer) {
        List<String> topics = observer.getTopics();

        for (String topic : topics) {
            if (observersMap.containsKey(topic)) {
                observersMap.get(topic).remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers(String topic, String news) {
        if (observersMap.containsKey(topic)) {
            List<Observer> observers = observersMap.get(topic);
            for (Observer observer : observers) {
                observer.update(topic, news);
            }
        }
    }

    public void postNews(String topic, String news) {
        System.out.println("Posting news: " + news);
        notifyObservers(topic, news);
    }
}