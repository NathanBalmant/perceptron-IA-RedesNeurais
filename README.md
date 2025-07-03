
# 🧠 Perceptron Simples em Java

Este projeto implementa um **Perceptron de camada única (single-layer Perceptron)** em Java.

## 📌 Objetivo

Treinar um Perceptron simples para aprender 4 bases de dados clássicas:
1. Porta lógica **AND**
2. Porta lógica **OR**
3. Porta lógica **XOR** que nao deve funcionar por nao ser linearmente separavel.
4. **Movimentação de robô** com sensores à esquerda, frente e direita

---

## 📁 Estrutura

- `Perceptron.java`: Implementa o modelo de Perceptron com pesos iniciais aleatórios e regra de aprendizado baseada no erro.
- `PerceptronRunner.java`: Arquivo de execução principal onde as bases de dados são testadas e o erro por época é exibido.

---

## 🗃️ Bases de Dados

As bases estão implementadas diretamente no `PerceptronRunner.java`:

### ✅ Porta AND
| x0 | x1 | y |
|----|----|---|
| 0  | 0  | 0 |
| 0  | 1  | 0 |
| 1  | 0  | 0 |
| 1  | 1  | 1 |

### ✅ Porta OR
| x0 | x1 | y |
|----|----|---|
| 0  | 0  | 0 |
| 0  | 1  | 1 |
| 1  | 0  | 1 |
| 1  | 1  | 1 |

### ❌ Porta XOR (não linearmente separável)
| x0 | x1 | y |
|----|----|---|
| 0  | 0  | 0 |
| 0  | 1  | 1 |
| 1  | 0  | 1 |
| 1  | 1  | 0 |

> O Perceptron de uma camada **não é capaz** de aprender a função XOR, como previsto teoricamente.

### 🤖 Robô com sensores
| Esq | Frt | Dir | y0 (ir) | y1 (parar) |
|-----|-----|-----|---------|------------|
|  0  |  0  |  0  |    1    |     1      |
|  0  |  0  |  1  |    0    |     1      |
|  0  |  1  |  0  |    1    |     0      |
|  0  |  1  |  1  |    0    |     1      |
|  1  |  0  |  0  |    1    |     0      |
|  1  |  0  |  1  |    1    |     0      |
|  1  |  1  |  0  |    1    |     0      |
|  1  |  1  |  1  |    1    |     0      |

---

## ⚙️ Como usar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/perceptron-java.git
cd perceptron-java
```

2. Compile os arquivos:

```bash
javac br/cefet/ia/perceptron/*.java
```

3. Execute o `PerceptronRunner`:

```bash
java br.cefet.ia.perceptron.PerceptronRunner
```

4. Para testar outras bases:
   - Altere o vetor `portaAnd` para `portaOR`, `portaXOR` ou `robo`
   - Ajuste a quantidade de entradas e saídas no construtor do `Perceptron`

---

## 🧠 Fórmulas usadas

- **Erro da amostra**:  
  \( E_a = \sum_{j=1}^{k} |y_{aj} - o_{aj}| \)

- **Erro da época**:  
  \( E_e = \sum_{a=1}^{n} E_a \)

---

## 👨‍💻 Autor

- **Nathan Balmant De Paula Souza**  
Graduando em Engenharia de Computação  
CEFET-MG 
[LinkedIn](https://www.linkedin.com/in/nathanbalmant) | [GitHub](https://github.com/NathanBalmant)

---

## 🧾 Licença

Projeto acadêmico sem fins lucrativos. Uso livre para fins educacionais.
