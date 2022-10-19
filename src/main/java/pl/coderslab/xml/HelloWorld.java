package pl.coderslab.xml;

public class HelloWorld {
    private String message;

    public HelloWorld() {
        System.out.println("sddddddddddddddddddddddd");
    }

    public HelloWorld(String message) {
        System.out.println("create hello world");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }
}
