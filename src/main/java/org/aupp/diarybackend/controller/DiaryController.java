package org.aupp.diarybackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diaries")
public class DiaryController {

    @GetMapping("")
    public String get(){
        return "HELLO THERE!";
    }

    @PostMapping("")
    public ResponseEntity saveDiary(){
        return ResponseEntity.status(HttpStatus.OK).body("Hi");
    }

    @DeleteMapping("")
    public ResponseEntity deleteDiary() {
        return ResponseEntity.status(HttpStatus.OK).body("Hi");
    }
}
