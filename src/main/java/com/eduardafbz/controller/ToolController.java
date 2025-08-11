package com.eduardafbz.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.eduardafbz.model.Tool;
import com.eduardafbz.service.ToolService;

@RestController
@RequestMapping("tools")
public class ToolController implements Serializable {
    
    @Autowired
    private ToolService toolService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Tool tool) {
        Tool toolCreated = toolService.add(tool);
        return ResponseEntity.ok().body(toolCreated);
    }

    @GetMapping
    public ResponseEntity<List<Tool>> findAll() {
        List<Tool> tools = toolService.findAll();
        return ResponseEntity.ok().body(tools);
    } 

    @GetMapping("/name")
    public ResponseEntity<?> findByName(@RequestParam String name) { //geralmente não tem corpo, por isso usamos o RequestParam
        Tool tool = toolService.findByName(name);
        return ResponseEntity.ok().body(tool);
    }

    @GetMapping("/tag")
    public ResponseEntity<?> findByTag(@RequestParam String tag) {
        List<Tool> tool = toolService.findByTag(tag);
        return ResponseEntity.ok().body(tool);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Tool updatedTool) { //o RequestBody só aceita um parâmetro
        Tool tool = toolService.update(id, updatedTool);
        return ResponseEntity.ok().body(tool);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        toolService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
