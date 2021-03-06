/*
 * Copyright (C) 2022 SIA
 * All rights reserved
 **/

package es.sia.css.test.application.depositcash;

import org.springframework.stereotype.Service;

import es.sia.css.test.domain.user.User;
import es.sia.css.test.domain.valueobject.Cash;

@Service
public class DepositCashHandler {

    private final User user;

    public DepositCashHandler(User user) {
        this.user = user;
    }

    public void handle(DepositCashCommand command){
        Cash amount = Cash.of(command.getAmount());

        user.depositCash(amount);
    }
}
