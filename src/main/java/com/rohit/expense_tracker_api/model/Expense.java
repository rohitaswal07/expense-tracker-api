package com.rohit.expense_tracker_api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expense {

   private Long id;

   @NotBlank (message = "title cannot be blank")
   private String title;

   @NotNull (message = "amount cannot be null")
   @Positive (message = "amount must be greater than zero")
   private BigDecimal amount;

   @NotBlank (message = "category cannot be blank")
   private String category;

   @NotNull (message = "date cannot be null")
   private LocalDate date;

   public Expense(Long id, String title, BigDecimal amount, String category, LocalDate date) {
      this.id = id;
      this.title = title;
      this.amount = amount;
      this.category = category;
      this.date = date;
   }

   public Expense() {
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public BigDecimal getAmount() {
      return amount;
   }

   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }





}
