package br.com.diegojlima.hexagonal.adapters.configuration;

import br.com.diegojlima.hexagonal.adapters.persistence.BankAccountRepository;
import br.com.diegojlima.hexagonal.HexagonalApplication;
import br.com.diegojlima.hexagonal.application.services.BankAccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class BeanConfiguration {

    @Bean
    BankAccountService bankAccountService(BankAccountRepository repository) {
        return new BankAccountService(repository, repository);
    }
}
