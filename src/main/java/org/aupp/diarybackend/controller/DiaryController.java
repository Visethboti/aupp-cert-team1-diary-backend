package org.aupp.diarybackend.controller;

import org.aupp.diarybackend.entity.Diary;
import org.aupp.diarybackend.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastJpaDependencyAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/diaries")
public class DiaryController {
    @Autowired
    DiaryService diaryService;

    @GetMapping("")
    public ResponseEntity get(){
        return ResponseEntity.status(HttpStatus.OK).body(diaryService.getDiaries());
    }

    @GetMapping("/{diaryID}")
    public ResponseEntity getDiary(@PathVariable int diaryID){
        return ResponseEntity.status(HttpStatus.OK).body(diaryService.getDiary(diaryID));
    }

    @PostMapping("")
    public ResponseEntity saveDiary(@RequestBody Diary diary){
        return ResponseEntity.status(HttpStatus.OK).body(diaryService.saveDiary(diary));
    }

    @DeleteMapping("/{diaryID}")
    public ResponseEntity deleteDiary(@PathVariable int diaryID) {
        try {
            diaryService.deleteDiary(diaryID);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting diary");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Diary Deleted");
    }
}
