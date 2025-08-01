package com.eduardafbz.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardafbz.exceptions.ResourceNotFoundException;
import com.eduardafbz.model.Tool;
import com.eduardafbz.repository.ToolRepository;

@Service
public class ToolService implements Serializable {
    
    @Autowired
    private ToolRepository toolRepository;

    public Tool add(Tool tool) {
        return toolRepository.save(tool);
    }

    public List<Tool> findAll() {
        return toolRepository.findAll();
    }

    public Tool findByName(String name) {
        return toolRepository.findByName(name)
        .orElseThrow(() -> new RuntimeException("Tool not found with name: " + name));
    }

    public Tool findByTag(String tag) {
        return toolRepository.findByTag(tag)
        .orElseThrow(() -> new RuntimeException("Tool not found with tag: " + tag));
    }

    public Tool update(Long id, String newName, String newLink, String newDescription, String newTag) {
        Tool tool = toolRepository.findById(id).orElseThrow(() -> new RuntimeException("Id " + id + " not found!"));
        tool.setName(newName);
        tool.setLink(newLink);
        tool.setDescription(newDescription);
        tool.setTags(newTag);
        return toolRepository.save(tool);
    }

    public void delete(Long id) {
        if (!toolRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        else {
            toolRepository.deleteById(id);
        }
    }
}
