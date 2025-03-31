package sp.senai.br.jandira.calculadora.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 🖥️ Implementação da interface ITabuadaIO via Console.
 *
 * 🔥 Mapeia o processo de recepção de dados do usuário:
 * \begin{itemize}
 * \item \textbf{Entrada do Usuário}: O usuário digita valores no console.
 * \item \textbf{Buffer de Entrada}: A classe \texttt{BufferedReader} armazena temporariamente os dados.
 * \item \textbf{Processamento e Conversão}: A entrada (String) é convertida para \texttt{double}.
 * \item \textbf{Tratamento de Erros}: Exceções (\texttt{IOException}, \texttt{NumberFormatException}) são capturadas para garantir a robustez do sistema.
 * \end{itemize}
 */
public class ConsoleTabuadaIO implements ITabuadaIO {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 🔹 Buffer de entrada

    @Override
    public double capturarNumero(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Double.parseDouble(reader.readLine());  // 🔄 Conversão de String para Double
            } catch (IOException | NumberFormatException e) {
                System.err.println("Erro: Entrada inválida. Digite um número válido.");
            }
        }
    }

    @Override
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);  // 🔹 Exibe a saída na tela
    }
}
