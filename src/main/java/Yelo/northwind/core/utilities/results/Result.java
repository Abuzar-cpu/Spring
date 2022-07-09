package Yelo.northwind.core.utilities.results;

public class Result {
    private final boolean success;
    private String message = "No message provided";

    public Result(boolean success, String message) {
        this(success);
        this.message = message;
    }

    public Result(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
