package com.example.api.hirademyassistantapi.controller;

import com.example.api.hirademyassistantapi.Assistant;
import com.example.api.hirademyassistantapi.service.assistantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    private final assistantService AssistantService;

    public AssistantController(assistantService AssistantService) {
        this.AssistantService = AssistantService;
    }

    //POST /assistant: Creates a new record in the database and returns the id of the assistant.
    @PostMapping
    public ResponseEntity<Integer> createAssistant(@RequestBody Assistant assistant) {
        Integer assistantId = assistantService.createAssistant(assistant);
        return new ResponseEntity<>(assistantId, HttpStatus.CREATED);
    }

    //GET /assistant/<assistant_id>: Retrieves the details of the assistant with the specified id.
    @GetMapping("/{assistantId}")
    public ResponseEntity<Assistant> getAssistantById(@PathVariable Long assistantId) {
        Assistant assistant = assistantService.getAssistantById(assistantId);
        return new ResponseEntity<>(assistant, HttpStatus.OK);
    }

    //PUT /assistant/<assistant_id>: Updates the details of the assistant with the specified id.
    @PutMapping("/{assistantId}")
    public ResponseEntity<Void> updateAssistant(@PathVariable Long assistantId, @RequestBody Assistant updatedAssistant) {
        assistantService.updateAssistant(assistantId, updatedAssistant);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //DELETE /assistant/<assistant_id>: Deletes the record of the assistant with the specified id.
    @DeleteMapping("/{assistantId}")
    public ResponseEntity<Void> deleteAssistantById(@PathVariable Long assistantId) {
        assistantService.deleteAssistantById(assistantId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public assistantService getAssistantService() {
        return AssistantService;
    }
}
