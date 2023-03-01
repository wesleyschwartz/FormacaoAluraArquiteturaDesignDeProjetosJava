package br.com.alura.leilaoCucumber.acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"/*, tags = "@leilao"*/)
public class LeilaoCucumberRunner {
}
