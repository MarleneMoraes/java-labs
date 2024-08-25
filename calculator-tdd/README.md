# TDD (*Test-Driven Development*) em Java

## Objetivo
Desenvolva uma calculadora usando a metodologia TDD

## Instruções
Para essa atividade os alunos poderão fazer em grupos de 3 até 5 pessoas.  Cada membro do grupo deverá criar um caso de teste. Para isso, o grupo deverá fazer a entrega do repositório do GitHub zipado e o link do repositório no GitHub. O professor verificará através dos commits se cada aluno fez pelo menos um caso de teste usando o TDD. 

### Passo 1: Configurar o Repositório no GitHub
Crie um novo repositório no GitHub e dê um nome apropriado, como "TDD-Java-Example".
Clone o repositório para o seu computador usando o comando: git clone https://github.com/seu-usuario/TDD-Java-Example.gitLinks to an external site.
 

### Passo 2: Configurar o Ambiente de Desenvolvimento
Para começar, você precisará de uma IDE que suporte Java, como o IntelliJ IDEA, VSCODE ou o Eclipse, e a biblioteca de testes JUnit.
Crie um novo projeto Java.
Adicione a biblioteca JUnit ao projetoCrie uma estrutura básica de projeto Java:

TDD-Java-Example/

├── src/

│   └── main/

│       └── java/

└───└── test/

 │       └── java/

2. Abra um terminal na raiz do projeto e inicie o ambiente de desenvolvimento.

### Passo 3: Escrever o Primeiro Teste
No diretório test/java, crie um pacote chamado com.example para os testes.
Crie uma classe chamada CalculatorTest para testar a classe Calculator.
Escreva um teste para verificar se a soma está funcionando corretamente:

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }
}
```

FAÇA O COMMIT

### Passo 4: Escrever o Código da Aplicação
No diretório main/java, crie um pacote chamado com.example para o código da aplicação.
Crie uma classe chamada Calculator para a implementação da calculadora:
 
```java
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
```

### Passo 5: Executar os Testes
No terminal, execute os testes usando o seguinte comando:  `./gradlew test`

O teste deverá falhar, já que ainda não implementamos a funcionalidade de soma.

### Passo 6: Implementar a Funcionalidade
No arquivo Calculator.java, implemente o método sum() corretamente.

### Passo 7: Refatorar e Repetir
Execute os testes novamente usando ./gradlew test para garantir que a implementação esteja correta.
Se os testes passarem, é hora de refatorar o código, melhorando a estrutura e a legibilidade.

### Passo 8: Fazer Commit no GitHub
No terminal, adicione as mudanças e faça um commit: 
```git
git add .
git commit -m "Implement sum method"
```
Envie as mudanças para o repositório no GitHub:  `git push origin main`

### Passo 9: Ciclo de Testes Completo
Você concluiu um ciclo completo de Desenvolvimento Orientado a Testes. Agora você pode continuar adicionando mais funcionalidades, repetindo os passos 3 a 8.

Lembre-se de sempre escrever os testes primeiro, assistir a eles falharem e, em seguida, implementar a funcionalidade para fazê-los passar. Isso garante um código mais confiável e testável.
