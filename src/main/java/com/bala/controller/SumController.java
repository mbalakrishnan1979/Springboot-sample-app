package com.bala.controller;

import com.bala.dto.SumRequest;
import com.bala.dto.SumResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SumController {

    @PostMapping("/sum")
    public SumResponse calculateSum(@RequestBody SumRequest request) {
        double result = request.getNumber1() + request.getNumber2();
        return new SumResponse(result);
    }

    private void method() {}
}
