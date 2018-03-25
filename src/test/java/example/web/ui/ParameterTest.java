package example.web.ui;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParameterTest {

    private static final String DATA_STAGE = "dev-ebiz,dev-crm";
    private static final String DATA_APPLICATION_URL = "ebiz.de,crm.de";

    private final String applicationUrl;
    private final String stage;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 },
                { 1, 1 }
        });
    }

    public ParameterTest(String applicationUrl, String stage){

        this.applicationUrl = applicationUrl;
        this.stage = stage;

    }

    @Test
    public void testParameter(){
        System.out.println("applicationUrl: " + applicationUrl);
        System.out.println("stage: " + stage);
    }
}
