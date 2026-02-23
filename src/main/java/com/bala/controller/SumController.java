package com.bala.controller;

import com.bala.dto.SumRequest;
import com.bala.dto.SumResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SumController {
    public static int[] numbers = {1, 2, 3};

    @PostMapping("/sum")
    public SumResponse calculateSum(@RequestBody SumRequest request) {
        final double result = request.getNumber1() + request.getNumber2();
        return new SumResponse(result);
    }


    private int getLength(String input) {
        if (input == null) {
            System.out.println("Input is null");
        }
        // SpotBugs will flag possible NullPointerException
        return input.length();
    }


}
