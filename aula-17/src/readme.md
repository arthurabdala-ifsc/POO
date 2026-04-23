# Diagrama de classes - Sistema Para Gestão de Agenda Telefônica

```mermaid
    classDiagram
        class App{
            - Agenda agenda
            + main()
            + menu()
        }
        class AgendaTelefonica
        class Contato
        class ColecaoTelefone{
            - HashMap<String><String> dados
            + add(String rotulo, String valor) boolean
            + remove(String rotulo) boolean
            + update(String rotulo, String valor) boolean
            + toString() String
        }
        class ColecaoEmail{
            - HashMap<String><String> dados
            + add(String rotulo, String valor) boolean
            + remove(String rotulo) boolean
            + update(String rotulo, String valor) boolean
            + toString() String
        }
        
        App "1" *-- "1" AgendaTelefonica
        AgendaTelefonica "1" *-- "0..*" Contato
        Contato "1" *-- "0..*" ColecaoTelefone
        Contato "1" *-- "0..*" ColecaoEmail
```