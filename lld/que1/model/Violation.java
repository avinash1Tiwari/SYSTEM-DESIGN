package que1.model;

public class Violation {

    private String errorName;
    private String message;

    public Violation(String errorName)
    {
        this.errorName = errorName;
    }

    public String getErrorName()
    {
        return this.errorName;

    }

    public String getMessage()
    {
        return this.message;

    }
}
