package org.globus.users.api.controllers;


import org.globus.users.api.dto.EchoRequest;
import org.globus.users.api.dto.EchoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UtilsController {

    @GetMapping("/users/echo/{msg}")
    public ResponseEntity<String> echoGet(@PathVariable String msg)
    {
        return ResponseEntity.ok(msg);
    }

    @PostMapping("/echo")
    public ResponseEntity<EchoResponse> echoPost(@RequestBody EchoRequest msg) {
        EchoResponse resp = new EchoResponse(msg.getRequest());
        return ResponseEntity.ok(resp);
    }
}
