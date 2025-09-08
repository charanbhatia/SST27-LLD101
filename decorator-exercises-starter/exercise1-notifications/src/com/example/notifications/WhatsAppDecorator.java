package com.example.notifications;

/**
 * WhatsApp decorator that adds WhatsApp notification functionality to any existing notifier.
 * Sends a WhatsApp message and then delegates to the wrapped notifier.
 */
public class WhatsAppDecorator extends NotifierDecorator {
    private final String userId;

    public WhatsAppDecorator(Notifier notifier, String userId) {
        super(notifier);
        this.userId = userId;
    }

    @Override
    public void notify(String text) {
        // Add WhatsApp functionality
        System.out.println("[WHATSAPP -> " + userId + "]: " + text);
        
        // Delegate to the wrapped notifier
        super.notify(text);
    }
}
