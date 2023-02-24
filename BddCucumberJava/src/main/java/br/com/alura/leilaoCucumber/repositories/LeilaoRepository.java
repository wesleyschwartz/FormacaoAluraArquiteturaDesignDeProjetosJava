package br.com.alura.leilaoCucumber.repositories;

import br.com.alura.leilaoCucumber.model.Leilao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long>  {


}
