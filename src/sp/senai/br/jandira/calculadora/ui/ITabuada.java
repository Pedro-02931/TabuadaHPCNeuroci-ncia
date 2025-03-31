package sp.senai.br.jandira.calculadora.ui;


/**
 * 🖥️ Interface para definir os métodos de entrada/saída.
 *
 * 🚀 Objetivo: Abstrair a forma como os dados interagem com o sistema.
 * Permite flexibilidade na escolha da interface:
 * \begin{itemize}
 * \item Console (\texttt{System.in}, \texttt{System.out})
 * \item Interface Gráfica (GUI)
 * \item Interface de Programação de Aplicações (API)
 * \end{itemize}
 * Essa abstração facilita a adaptabilidade e os testes.
 */
public interface ITabuada {
    double capturarNumero(String mensagem);  // 🔹 Obtém um número do usuário
    void exibirMensagem(String mensagem);  // 🔹 Mostra uma mensagem ao usuário
}