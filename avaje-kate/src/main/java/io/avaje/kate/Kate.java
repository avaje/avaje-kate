package io.avaje.kate;

import io.avaje.jex.BootJex;

/**
 * Start Kate.
 * <p>
 * This will start the Jex server with the {@code @Controller} endpoints.
 */
public class Kate {

    public static void start() {
        BootJex.start();
    }

    public static void main(String[] args) {
        start();
    }
}
