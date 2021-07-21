package ink.heshang.restdemo;

import ink.heshang.restdemo.rest.ActuatorService;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * TODO
 *
 * @Author 微信公众号《和尚的破功之路》
 * @Date 2021/7/21 22:23
 */
public class ActuatorTest {

    /**
     * Test {@link ActuatorService#shutDown()}
     * @throws URISyntaxException
     */
    @Test
    public void testShutDown() throws URISyntaxException {
        URI uri = new URI("http://127.0.0.1:8080");
        ActuatorService actuatorService = RestClientBuilder.newBuilder().baseUri(uri).build(ActuatorService.class);

        String shutDown = actuatorService.shutDown();
        System.out.println("shutDown result" + shutDown);
    }


}
