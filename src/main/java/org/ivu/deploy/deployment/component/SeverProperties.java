package org.ivu.deploy.deployment.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SeverProperties {

    @Value("${web1}")
    private String web1;

    @Value("${web2}")
    private String web2;

    @Value("${web3}")
    private String web3;

    @Value("${web4}")
    private String web4;

    @Value("${event1}")
    private String event1;

    @Value("${event2}")
    private String event2;

    @Value("user")
    private String user;

    @Value("pwd")
    private String password;

    public String getWeb1() {
        return web1;
    }

    public String getWeb2() {
        return web2;
    }

    public String getWeb3() {
        return web3;
    }

    public String getWeb4() {
        return web4;
    }

    public String getEvent1() {
        return event1;
    }

    public String getEvent2() {
        return event2;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
