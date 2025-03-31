package sp.senai.br.jandira.calculadora.model;

package sp.senai.br.jandira.calculadora.model;

/*
# Interface que define o contrato de uma tabuada.

Simula o processamento matemático cerebral:
graph TD
    A[Memória de Trabalho] --> |Entrada e armazenamento de variáveis (x, min, max)| --> B
    [Processamento Paralelo]
    B --> |Cálculo eficiente e simultâneo dos resultados com o uso de multhreads| --> C[Resultado]
*/

public interface ITabuada {
    void setMultiplicando(double multiplicando);  // 🔹 Armazena o número base ($x$)
    void setMultiplicadores(double min, double max);  // 🔹 Define intervalo de cálculo ($min \le i \le max$)
    void calcular();  // 🚀 Executa a tabuada em paralelo ($x \times i$)
}