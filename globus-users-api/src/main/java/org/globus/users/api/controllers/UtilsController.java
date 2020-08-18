package org.globus.users.api.controllers;


import org.globus.users.api.dto.EchoResponse;
import org.globus.users.api.dto.EchoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UtilsController {

    @GetMapping("/echo/{msg}")
    public ResponseEntity<EchoResponse> echoGet(@PathVariable String msg)
    {
        EchoResponse resp = new EchoResponse(msg);
        return ResponseEntity.ok(resp);
    }

    @PostMapping("/echo")
    public ResponseEntity<EchoResponse> echoPost(@RequestBody EchoRequest msg) {
        EchoResponse resp = new EchoResponse(msg.getRequest());
        return ResponseEntity.ok(resp);
    }
}
