package pl.coderslab;

public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        System.out.println("create hello world");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }
}
