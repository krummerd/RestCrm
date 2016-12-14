import java.util.List;


public class CacheFileEventLogger extends FileEventLogger {

    int cacheSize;
    List<Event> cache;

    public CacheFileEventLogger (String filename, int cacheSize){
        super(filename);
        this.cacheSize = cacheSize;
    }

    public void logEvent(Event event){
        cache.add(event);

        if (cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy() {
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }

    private void writeEventsFromCache() {
        cache.stream().forEach(super::logEvent);
    }

 }
