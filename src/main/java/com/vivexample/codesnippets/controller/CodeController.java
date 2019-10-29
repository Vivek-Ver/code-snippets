package com.vivexample.codesnippets.controller;

import com.vivexample.codesnippets.exception.ResourceNotFoundException;
import com.vivexample.codesnippets.model.Code;
import com.vivexample.codesnippets.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by vivekverma on 2019-10-27.
 */
@RestController
@RequestMapping("/api")
public class CodeController {

    @Autowired
    CodeRepository codeRepository;

    @GetMapping("/codesnippets")
    public List<Code> getAllCodes() {
        return codeRepository.findAll();
    }

    @PostMapping("/codesnippets")
    public Code createNote(@Valid @RequestBody Code code) {
        return codeRepository.save(code);
    }

    @GetMapping("/codesnippets/{id}")
    public Code getCodeById(@PathVariable(value = "id") Long codeId) {
        return codeRepository.findById(codeId)
                .orElseThrow(() -> new ResourceNotFoundException("Code", "id", codeId));
    }

    @PutMapping("/codesnippets/{id}")
    public Code updateCode(@PathVariable(value = "id") Long codeId,
                                           @Valid @RequestBody Code noteDetails) {

        Code code = codeRepository.findById(codeId)
                .orElseThrow(() -> new ResourceNotFoundException("Code", "id", codeId));

        code.setTitle(noteDetails.getTitle());
        code.setContent(noteDetails.getContent());

        Code updatedCode = codeRepository.save(code);
        return updatedCode;
    }

    @DeleteMapping("/codesnippets/{id}")
    public ResponseEntity<?> deleteCode(@PathVariable(value = "id") Long codeId) {
        Code code = codeRepository.findById(codeId)
                .orElseThrow(() -> new ResourceNotFoundException("Code", "id", codeId));

        codeRepository.delete(code);

        return ResponseEntity.ok().build();
    }
}
