package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Transaction;
import com.example.demo.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return service.saveTransaction(transaction);
    }

    @GetMapping("/all")
    public List<Transaction> findAllTransactions() {
        return service.getTransactions();
    }

    @GetMapping("/{id_lancamento}")
    public Transaction findTransactionById(@PathVariable Integer id_lancamento) {
        return service.getTransactionById(id_lancamento);
    }

    @PutMapping("/{id_lancamento}")
    public Transaction updateTransaction(@PathVariable("id_lancamento") Integer id, @RequestBody Transaction transaction) {
        return service.updateTransaction(id, transaction);
    }

    @DeleteMapping("/{id_lancamento}")
    public String deleteTransaction(@PathVariable Integer id_lancamento) {
        return service.deleteTransaction(id_lancamento);
    }
}
