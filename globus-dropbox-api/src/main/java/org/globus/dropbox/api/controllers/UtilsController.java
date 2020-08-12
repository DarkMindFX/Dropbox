package org.globus.dropbox.api.controllers;

import org.globus.dropbox.api.dto.EchoRequest;
import org.globus.dropbox.api.dto.EchoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UtilsController {

    @GetMapping("/echo/{msg}")
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
