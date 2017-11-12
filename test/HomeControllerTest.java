import controllers.HomeController;
import org.junit.Test;
import play.mvc.Result;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;

public class HomeControllerTest {

    @Test
    public void testAppSummary() {
        Result result = new HomeController().appSummary();
        assertEquals(OK, result.status());
        assertEquals("application/json", result.contentType().get());
    }
}
