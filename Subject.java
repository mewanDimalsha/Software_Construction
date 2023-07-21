// Subject interface
interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(String topic, String news);
}