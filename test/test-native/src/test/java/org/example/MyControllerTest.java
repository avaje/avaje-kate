package org.example;

import io.avaje.inject.test.InjectTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static org.assertj.core.api.Assertions.assertThat;

@InjectTest
class MyControllerTest {

    @Inject MyControllerTestAPI client;

    @Test
    void hello() {
        HttpResponse<String> res = client.hello();
        assertThat(res.statusCode()).isEqualTo(200);
        assertThat(res.body()).isEqualTo("Hello World");
    }
}