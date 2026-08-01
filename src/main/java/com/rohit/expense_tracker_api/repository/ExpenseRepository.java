package com.rohit.expense_tracker_api.repository;

import com.rohit.expense_tracker_api.model.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ExpenseRepository {
   private final List<Expense> expenses = new ArrayList<>();

   public Expense save(Expense expense){
      expenses.add(expense);
      return expense;
   }

   public List<Expense> findAll(){
      return expenses;
   }

   public Optional<Expense> findById(Long id){
      for (Expense expense : expenses){
         if (expense.getId().equals(id)) {
            return Optional.of(expense);
         }
      }
      return Optional.empty();
   }

   public void delete(Expense expense){
      expenses.remove(expense);
   }

}
