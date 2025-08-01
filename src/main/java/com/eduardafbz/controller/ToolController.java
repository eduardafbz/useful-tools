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
    public ResponseEntity<?> findByName(@RequestBody String name) {
        Tool tool = toolService.findByName(name);
        return ResponseEntity.ok().body(tool);
    }

    @GetMapping("/tag")
    public ResponseEntity<?> findByTag(@RequestBody String tag) {
        Tool tool = toolService.findByTag(tag);
        return ResponseEntity.ok().body(tool);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody String newName, String newLink, String newDescription, String newTag) {
        Tool updatedTool = toolService.update(id, newName, newLink, newDescription, newTag);
        return ResponseEntity.ok().body(updatedTool);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        toolService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
