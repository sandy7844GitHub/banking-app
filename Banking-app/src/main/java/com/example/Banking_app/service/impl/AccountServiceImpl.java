package com.example.Banking_app.service.impl;

import com.example.Banking_app.dto.AccountDto;
import com.example.Banking_app.entiity.Account;
import com.example.Banking_app.mapper.AccountMapper;
import com.example.Banking_app.repository.AccountRepository;
import com.example.Banking_app.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public  AccountDto createAccount(AccountDto accountDto){
        Account account= AccountMapper.mapToAccount(accountDto);
        Account savedAccount=accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
