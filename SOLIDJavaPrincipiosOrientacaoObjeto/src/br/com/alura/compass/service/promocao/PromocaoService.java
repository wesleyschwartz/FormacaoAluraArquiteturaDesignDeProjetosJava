package br.com.alura.compass.service.promocao;

import br.com.alura.compass.ValidacaoException;
import br.com.alura.compass.model.Cargo;
import br.com.alura.compass.model.Funcionario;

public class PromocaoService {
    void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerentes nao podem ser promovidos");
        }
        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario nao bateu a meta");
        }
    }
}
