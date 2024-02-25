package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entity.BorrowerEntity;
import org.example.service.BorrowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/borrower")
@RequiredArgsConstructor
public class BorrowerController {

    final BorrowerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }

    @GetMapping("/get")
    public List<BorrowerEntity> getBorrowers(){
        return service.getBorrowers();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return (service.deleteBorrower(id)) ?
                ResponseEntity.ok("Borrower Deleted Successfully...") :
                ResponseEntity.notFound().build();
    }

    @GetMapping("search/{id}")
    public Borrower getBorrowerById(@PathVariable Long id){
        return service.getBorrowerById(id);
    }

}
