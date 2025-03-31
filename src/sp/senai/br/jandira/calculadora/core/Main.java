package sp.senai.br.jandira.calculadora.core;

import sp.senai.br.jandira.calculadora.model.*;
import sp.senai.br.jandira.calculadora.model.ITabuada;
import sp.senai.br.jandira.calculadora.ui.*;

/*
# Orquestração do Fluxo de Dados

+ Simula o comportamento cognitivo em etapas:
```mermaid
graph TD
    A[Entrada Sensorial] --> |Captura os dados do usuário (multiplicando, minimo, maximo) através da interface ITabuadaIO.| B[Processamento Paralelizado]
    B --> |O cortex parietal (simulado pela classe Tabuada) recebe os dados e realiza em paralelo.| C[Exibição]
    C --> |O resultado é enviado para a saída padrão (simulado pela classe ConsoleTabuadaIO) que exibe o resultado no console.| D[Console Output]
```
*/

public class Main {
    public static void main(String[] args) {
        ITabuada io = new ConsoleTabuadaIO(); // Cria uma instância da interface de E/S do console, Error: `Type mismatch: cannot convert from ConsoleTabuadaIO to ITabuada`
        ITabuada tabuada = new Tabuada(); // Cria uma instância da classe Tabuada

        // Entrada do usuário - Captura os dados e converte em valores numéricos
        double multiplicando = io.capturarNumero("Digite o numero base da tabuada: "); 
        double minimo = io.capturarNumero("Digite o multiplicador mínimo: "); // Error: `The method capturarNumero(String) is undefined for the type ITabuada`
        double maximo = io.capturarNumero("Digite o multiplicador máximo: "); // Error: `The method capturarNumero(String) is undefined for the type ITabuada`

        // Armazena os valores na memória de trabalho
        tabuada.setMultiplicando(multiplicando); 
        tabuada.setMultiplicadores(minimo, maximo); 

        tabuada.calcular(); 
    }
}