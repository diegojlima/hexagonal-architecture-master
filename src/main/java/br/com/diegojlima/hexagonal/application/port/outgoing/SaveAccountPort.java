package br.com.diegojlima.hexagonal.application.port.outgoing;

import br.com.diegojlima.hexagonal.application.domain.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}