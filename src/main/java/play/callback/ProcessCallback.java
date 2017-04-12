package play.callback;

public interface ProcessCallback<T> {
    public abstract T porcess(String command);
}
