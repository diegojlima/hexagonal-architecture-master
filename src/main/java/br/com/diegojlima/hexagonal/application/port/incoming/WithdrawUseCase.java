package br.com.diegojlima.hexagonal.application.port.incoming;

import java.math.BigDecimal;

public interface WithdrawUseCase {
    boolean withdraw(Long id, BigDecimal amount);
}