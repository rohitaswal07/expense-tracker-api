package com.rohit.expense_tracker_api.service;

import com.rohit.expense_tracker_api.exception.ExpenseNotFoundException;
import com.rohit.expense_tracker_api.model.Expense;
import com.rohit.expense_tracker_api.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private Long nextId = 1L;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }


    public Expense addExpense(Expense expense){
        expense.setId(nextId++);
        return this.expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(){
       return this.expenseRepository.findAll();
    }

    public void deleteExpense(Long id){
        Expense expense = this.expenseRepository.findById(id)
                .orElseThrow(() -> new ExpenseNotFoundException("Expense not found with id "+id));
        this.expenseRepository.delete(expense);
    }
    public List<Expense> getByCategory(String category){
        return this.expenseRepository.findAll()
                .stream()     // list to stream
                .filter(expense -> expense.getCategory().equalsIgnoreCase(category))  // keep only matching elements
                .toList();    // stream to list
    }
    public BigDecimal calculateTotal(){
       return this.expenseRepository.findAll()
               .stream()   //list to stream
               .map(Expense::getAmount)  // for every object call getAmount
               .reduce(BigDecimal.ZERO,BigDecimal::add); //combine values into one results
    }
    public BigDecimal calculateCategoryTotal(String category){
        return this.expenseRepository.findAll()
                .stream()
                .filter(expense -> expense.getCategory().equalsIgnoreCase(category))
                .map(Expense::getAmount)
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
