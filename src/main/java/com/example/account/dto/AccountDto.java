package com.example.account.dto;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {
    private Long userId;
    private String accountNumber;
    private Long balance;


    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;



    public static AccountDto formEntity(Account account) { //formEntity를 사용한다.
        return AccountDto.builder()
                .userId(account.getAccountUser().getId())
                .accountNumber(account.getAccountNumber())
                .balance(account.getBalance())
                .registeredAt(account.getRegisterAt())
                .unRegisteredAt(account.getUnRegisterAt())
                .build();
    }
}
