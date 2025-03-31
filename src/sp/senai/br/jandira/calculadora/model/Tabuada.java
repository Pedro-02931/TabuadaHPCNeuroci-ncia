package sp.senai.br.jandira.calculadora.model;

import java.util.stream.IntStream;

/**
 * 🧠 Implementação da tabuada com paralelismo e otimização HPC.
 *
 * 🔥 Inspiração: Arquitetura \textbf{SIMD (Single Instruction, Multiple Data)} no cérebro
 * - O córtex parietal utiliza o paralelismo, aplicando a mesma operação a múltiplos dados.
 * - Modelado com \texttt{IntStream.parallel()}, que explora o \textbf{multi-threading} da JVM.
 *
 * Representação simplificada da função de ativação neural:
 * \[
 * f(i) = multiplicando \times i
 * \]
 * Onde \(i\) representa cada elemento do fluxo paralelo de multiplicadores.
 */
public class Tabuada implements ITabuada {
    private double multiplicando;  // 🔹 Valor principal da tabuada
    private double minimoMultiplicador;  // 🔹 Multiplicador inicial
    private double maximoMultiplicador;  // 🔹 Multiplicador final

    @Override
    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;  // 📌 "Gravação" na memória de trabalho
    }

    @Override
    public void setMultiplicadores(double min, double max) {
        if (min > max) throw new IllegalArgumentException("Erro: O multiplicador mínimo deve ser menor ou igual ao máximo!");
        this.minimoMultiplicador = min;
        this.maximoMultiplicador = max;
    }

    @Override
    public void calcular() {
        System.out.println("\n=== Tabuada de " + multiplicando + " ===");

        // 🚀 Processamento paralelo – Simulação de múltiplos neurônios operando juntos
        IntStream.rangeClosed((int) minimoMultiplicador, (int) maximoMultiplicador)
                .parallel()  // 🚀 Execução em múltiplas threads
                .forEach(i -> System.out.println(multiplicando + " x " + i + " = " + (multiplicando * i)));
    }
}