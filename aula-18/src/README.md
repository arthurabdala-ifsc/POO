# Questão 2 - Prova 2

```mermaid
    classDiagram App{
        - chaveConta HashMap<String,Conta>
        + cadastrarChave(): boolean
        + excluirChave(): boolean
 }
    classDiagram Conta{
        - numero
 }
```