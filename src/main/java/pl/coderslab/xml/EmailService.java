package pl.coderslab.xml;

public class EmailService implements MessageService{
    @Override
    public void send() {
        System.out.println("sending email");
    }

    @Override
    public void send(String message) {
        System.out.println("sending email " + message);
    }
}
