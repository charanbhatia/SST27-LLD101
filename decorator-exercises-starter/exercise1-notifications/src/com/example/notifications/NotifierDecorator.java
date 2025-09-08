package com.example.notifications;

/**
 * Base decorator class that implements Notifier and wraps another Notifier.
 * Concrete decorators will extend this class and add their own behavior
 * before or after delegating to the wrapped notifier.
 */
public abstract class NotifierDecorator implements Notifier {
    protected final Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(String text) {
        // Default behavior is to delegate to the wrapped notifier
        notifier.notify(text);
    }
}
