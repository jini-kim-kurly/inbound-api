package com.kulry.inbound;

import com.kurly.inbound.HelloInboundReceiving;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloInboundApi {

    @GetMapping("/hello-rec")
    public String callRec() {
        HelloInboundReceiving r = new HelloInboundReceiving();
        return r.getMessageFromExternal();
    }


}
