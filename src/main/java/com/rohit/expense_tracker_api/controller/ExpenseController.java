package com.rohit.expense_tracker_api.controller;

import com.rohit.expense_tracker_api.model.Expense;
import com.rohit.expense_tracker_api.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/expenses")
public class ExpenseController {

private final ExpenseService expenseService;


    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity<Expense> addAnExpense(@Valid @RequestBody Expense expense){
     Expense savedExpense= this.expenseService.addExpense(expense);
     return ResponseEntity.status(HttpStatus.CREATED).body(savedExpense);
    }

    @GetMapping
    public List<Expense> viewAllExpenses(@RequestParam(required = false) String category){
        if (category!=null){
            return this.expenseService.getByCategory(category);
        }
        return this.expenseService.getAllExpenses();
    }


    @GetMapping(value = "/total")
    public BigDecimal calculateTotalExpenses(){
        return this.expenseService.calculateTotal();
    }

    @GetMapping(value = "/total/{category}")
    public BigDecimal calculateTotalExpensesByCategory(@PathVariable String category){
        return this.expenseService.calculateCategoryTotal(category);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteAnExpense(@PathVariable Long id){
        this.expenseService.deleteExpense(id);
        return ResponseEntity.ok("Expense Deleted Successfully");
    }


}
