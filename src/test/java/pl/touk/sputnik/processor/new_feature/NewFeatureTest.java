package pl.touk.sputnik.processor.new_feature;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pl.touk.sputnik.TestEnvironment;

public class NewFeatureTest extends TestEnvironment {

    @Test
    void shouldReturnNewFeature() {
        NewFeature newFeature = new NewFeature();
        String actualString = newFeature.createNewFeature();
        String expectedString = "New feature created";
        assertTrue(actualString.equals(expectedString), "Les deux chaines sont egales");
    }
}
