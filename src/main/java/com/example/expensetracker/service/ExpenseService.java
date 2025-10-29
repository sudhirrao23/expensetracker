package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    // 🔹 Get all expenses
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // 🔹 Get a single expense by ID
    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    // 🔹 Add a new expense
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // 🔹 Update an existing expense
    public Expense updateExpense(Long id, Expense expenseDetails) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));

        expense.setTitle(expenseDetails.getTitle());
        expense.setCategory(expenseDetails.getCategory());
        expense.setAmount(expenseDetails.getAmount());
        expense.setDate(expenseDetails.getDate());

        return expenseRepository.save(expense);
    }

    // 🔹 Delete an expense
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
