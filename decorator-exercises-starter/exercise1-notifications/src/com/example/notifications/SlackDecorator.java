package com.example.notifications;

/**
 * Slack decorator that adds Slack notification functionality to any existing notifier.
 * Sends a Slack message and then delegates to the wrapped notifier.
 */
public class SlackDecorator extends NotifierDecorator {
    private final String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        // Add Slack functionality
        System.out.println("[SLACK -> #" + channel + "]: " + text);
        
        // Delegate to the wrapped notifier
        super.notify(text);
    }
}
