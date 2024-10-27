package com.example.Banking_app.repository;

import com.example.Banking_app.entiity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
