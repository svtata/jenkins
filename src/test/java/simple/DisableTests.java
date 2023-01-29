package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class DisableTests {
    @Test
    @Disabled
    void test1() {
        assertTrue(false);
    }

    @Test
    @Disabled("Any text here")
    void test2() {
        assertTrue(false);
    }
}
