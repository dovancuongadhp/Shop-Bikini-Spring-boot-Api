package com.unicoin.java6.Controller;

import com.unicoin.java6.Entity.ColorsEntity;
import com.unicoin.java6.Service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api-v1/colors")
public class ColorController {
    @Autowired
    ColorService colorService;

    @GetMapping
    public ResponseEntity<List<ColorsEntity>> getListColors(){
        return ResponseEntity.ok(colorService.getListColors());
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<ColorsEntity>> getColorById(@PathVariable Integer id){
        return ResponseEntity.ok(colorService.getColorById(id));
    }
}
