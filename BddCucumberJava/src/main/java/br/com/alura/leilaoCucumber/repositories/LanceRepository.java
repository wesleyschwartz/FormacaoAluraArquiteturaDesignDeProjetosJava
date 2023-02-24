package br.com.alura.leilaoCucumber.repositories;

import br.com.alura.leilaoCucumber.model.Lance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Long> {

}
