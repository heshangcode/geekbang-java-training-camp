package ink.heshang.restdemo.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * TODO
 *
 * @Author 微信公众号《和尚的破功之路》
 * @Date 2021/7/21 22:21
 */
@Path("/manager")
public interface ActuatorService {

    @POST
    @Path("/shutdown")
    String shutDown();
}
