# Cálculo da hipoteca (Mousavi) 
## Exercício:
- Passo-a-passo com classes de equivalência 
- Automatizar os casos de teste projetados em JUnit 
- Implementar a função desejada (usando TDD)

## Requisitos:
- R1- O sistema deve receber três valores como entrada: gênero (true → feminino e false → masculino), idade ([18, 55]) e salário ([0-10000]). Como saída, o sistema deve calcular o valor máximo da hipoteca para essa pessoa.
- R2- O valor máximo da hipoteca é calculado pela multiplicação do valor do salário com um fator (tabela no R3).
- R3- O fator para calcular a hipoteca (R2) é definido pela tabela a seguir:

## Fator de Cálculo
|Categoria|Homem|Fator|Mulher|Fator|
|---------|-----|-----|------|-----|
|Jovem|18-35|75|18-30|70|
Médio|36-45|55|31-40|50|
Idoso|46-55|30|41-50|35|