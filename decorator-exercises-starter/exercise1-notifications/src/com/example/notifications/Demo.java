package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        System.out.println("=== Baseline Email Only ===");
        base.notify("Baseline email only.");

        System.out.println("\n=== Email + SMS ===");
        Notifier emailAndSms = new SmsDecorator(base, "+91-99999-11111");
        emailAndSms.notify("Build green ✅");

        System.out.println("\n=== Email + WhatsApp ===");
        Notifier emailAndWhatsApp = new WhatsAppDecorator(base, "user_wa");
        emailAndWhatsApp.notify("Feature deployed successfully!");

        System.out.println("\n=== Email + Slack ===");
        Notifier emailAndSlack = new SlackDecorator(base, "deployments");
        emailAndSlack.notify("System maintenance scheduled.");

        System.out.println("\n=== Email + WhatsApp + Slack ===");
        Notifier emailWhatsAppAndSlack = new SlackDecorator(
            new WhatsAppDecorator(base, "user_wa"), 
            "deployments"
        );
        emailWhatsAppAndSlack.notify("Deployment completed 🚀");

        System.out.println("\n=== Complex Chain: Email + SMS + WhatsApp + Slack ===");
        Notifier fullChain = new SlackDecorator(
            new WhatsAppDecorator(
                new SmsDecorator(base, "+91-99999-11111"), 
                "user_wa"
            ), 
            "alerts"
        );
        fullChain.notify("Critical alert: Server down!");
    }
}
