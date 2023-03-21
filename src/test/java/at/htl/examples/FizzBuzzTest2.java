package at.htl.examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    final String testString = "Hello, World!\n";

    @BeforeEach
    public void setupOutput() {

    }

    @AfterEach
    public void restoreSystemInputOutput() {

    }

    @Test
    public void test001() {
        assertThat(false).isEqualTo(true);
    }

}
