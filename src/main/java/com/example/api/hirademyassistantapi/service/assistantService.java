package com.example.api.hirademyassistantapi.service;

import com.example.api.hirademyassistantapi.Assistant;
import com.example.api.hirademyassistantapi.repository.AssistantRepository;
import org.springframework.stereotype.Service;

@Service
public class assistantService {

    private static AssistantRepository assistantRepository = null;

    public assistantService(AssistantRepository assistantRepository) {
        assistantService.assistantRepository = assistantRepository;
    }

    public static Integer createAssistant(Assistant assistant) {
        Assistant savedAssistant = assistantRepository.save(assistant);
        return savedAssistant.getId();
    }

    public static Assistant getAssistantById(Long assistantId) {
        return assistantRepository.findById(assistantId)
                .orElseThrow(() -> new IllegalArgumentException("Assistant not found with id: " + assistantId));
    }

    public static void updateAssistant(Long assistantId, Assistant updatedAssistant) {
        Assistant assistant = getAssistantById(assistantId);
        assistant.setName(updatedAssistant.getName());
        assistant.setMobile(updatedAssistant.getMobile());
        assistant.setEmail(updatedAssistant.getEmail());
        assistant.setSalary(updatedAssistant.getSalary());
        assistant.setCity(updatedAssistant.getCity());
        assistant.setCountry(updatedAssistant.getCountry());
        assistant.setDepartment(updatedAssistant.getDepartment());
        assistant.setRole(updatedAssistant.getRole());
        assistantRepository.save(assistant);
    }

    public static void deleteAssistantById(Long assistantId) {
        assistantRepository.deleteById(assistantId);
    }
}
