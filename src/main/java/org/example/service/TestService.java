package org.example.service;

import com.zeta.Auditable;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Auditable
    public String testHello1() {
        return "testHello1 " + System.currentTimeMillis();
    }
    @Auditable(group="SOAP")
    public String testHello2() {
        return "testHello2 " + System.currentTimeMillis();
    }
}
