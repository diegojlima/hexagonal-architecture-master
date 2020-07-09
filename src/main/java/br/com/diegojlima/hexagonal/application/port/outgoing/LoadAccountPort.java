package br.com.diegojlima.hexagonal.application.port.outgoing;

import br.com.diegojlima.hexagonal.application.domain.BankAccount;

import java.util.Optional;

public interface LoadAccountPort {
    Optional<BankAccount> load(Long id);
}