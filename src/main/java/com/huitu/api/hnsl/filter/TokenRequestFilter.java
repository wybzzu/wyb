package com.huitu.api.hnsl.filter;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import java.io.IOException;

/**
 * Created by zhw on 2015/8/27.
 */
public class TokenRequestFilter implements ContainerRequestFilter {
    @Context
    private HttpServletRequest request;
    public void filter(ContainerRequestContext requestContext) throws IOException {
        //为请求设置属性
        /*String [] groups = new String[3];
        groups[0] = "1";
        groups[1] = "2";
        groups[2] = "5";

        User user = new User("210423109231000","1","admin",groups);
        requestContext.setProperty("user",user);*/

//        String json =  JsonHelper.toString(user);
//
//        requestContext.setProperty("user", json);
        String user = (String)request.getAttribute("security_user");
        System.out.println("远程用户"+user);
//        String user = "{\"addvcd\":\"210423109231000\",\"userid\":\"1\",\"nickname\":\"admin\",\"groups\":[\"1\",\"2\",\"5\"]}";
//        requestContext.setProperty("user", user);

        request.setAttribute("user", user);
    }
}
