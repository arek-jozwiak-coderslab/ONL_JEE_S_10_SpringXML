package pl.coderslab.xml;

public class MessageSender {
    private String message;
    private final MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sendMessageFromProperty() {
        messageService.send(this.message);
    }
}
