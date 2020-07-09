package br.com.diegojlima.hexagonal.adapters.persistence;

import br.com.diegojlima.hexagonal.application.domain.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpringDataBankAccountRepository extends MongoRepository<BankAccount, Long> { }
