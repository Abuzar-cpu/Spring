package Yelo.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{
    private T data;

    public SuccessDataResult(String message, T data) {
        super(data, true, message);
        this.data = data;
    }

    public SuccessDataResult(T data) {
        super(data, true, "No message Provided");
    }
}
