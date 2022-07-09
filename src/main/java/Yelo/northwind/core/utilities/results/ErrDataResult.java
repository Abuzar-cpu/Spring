package Yelo.northwind.core.utilities.results;

public class ErrDataResult<T> extends DataResult<T>{
    private T data;

    public ErrDataResult(String message, T data) {
        super(data, false, message);
    }

    public ErrDataResult(T data) {
        super(data, false, "No message provided");
    }

    public ErrDataResult() {
        super(null, false, "No message Provided");
    }

    public ErrDataResult(String message) {
        super(null, false, message);
    }
}
