# Laboratório 2 - Atividade #2
## ArraySortPoly

Sistema em Java que utiliza o conceito de polimorfismo para classificar arrays de diferentes tipos numéricos (inteiros, ponto flutuante, etc.) em ordem decrescente.

## Descrição

Este projeto implementa um classificador de arrays numéricos que utiliza o conceito de polimorfismo para lidar com diferentes tipos de dados numéricos (int, double, float, byte, short, long) e caracteres (char). O usuário pode criar um array do tipo desejado, inserir os elementos e escolher a ordem de classificação (crescente ou decrescente). O programa então exibe o array original e o array ordenado.

## Como usar

1. **Execute o programa:** Main
2. **Siga as instruções do menu:**
   * Escolha o tipo de arranjo (1 - Inteiro, 2 - Double, etc.)
   * Digite os elementos separados por espaço (ex: `1 5 3 9`)
   * Escolha a ordem de classificação (1 - Crescente, 2 - Decrescente)

## Fluxograma  
O fluxograma abaixo ilustra o fluxo de execução do programa, desde a exibição do menu até a classificação e exibição do array ordenado.

![Fluxograma - ArraySortPoly - Mermaid.png](Fluxograma%20-%20ArraySortPoly%20-%20Mermaid.png)

**Código Mermaid**
```
graph TD
A[Início] --> B[Exibir Menu]
B --> C{Ler Opção}
C --> |Não| N1[Fim]
C --> |Sim| D{Opção = 1?}
D --> |Não| N2
N2 --> B
D --> |Sim| E[Obter Valores do Arranjo]
E --> F{Opção = 8?}
F --> |Sim| G[Exibir Tipos de Arranjo]
G --> H[Ler Tipo do Arranjo]
H --> I[Exibir Ordem]
I --> J[Ler Ordem]
J --> K[Ler Elementos]
K --> L[Criar Arranjo]
L --> M{Arranjo Válido?}
M --> |Não| N3
N3 --> B
M --> |Sim| O[Exibir Lista Original]
O --> P[Classificar Arranjo]
P --> Q[Exibir Lista Ordenada]
Q --> N1
F --> |Não| K
```


### Explicação do fluxograma:

**Início:** O programa inicia sua execução.  
* **Exibir Menu:** O programa apresenta um menu de opções ao usuário.  
* **Ler Opção:** O programa lê a opção escolhida pelo usuário.  
* **Opção = 1?:** O programa verifica se a opção escolhida é a número 1.  
* **Sim:** O fluxo segue para a etapa "Obter Valores do Arranjo".  
* **Não:** O fluxo segue para a verificação "Opção = 0?".  
* **Opção = 0?:** O programa verifica se a opção escolhida é a número 0.  
* **Sim:** O programa termina ("Fim").  
* **Não:** O fluxo retorna para a etapa "Exibir Menu", apresentando o menu novamente ao usuário.  

**Obter Valores do Arranjo:**    
* **Exibir Tipos de Arranjo:** O programa exibe as opções de tipos de dados para o arranjo (ex: inteiro, decimal, etc.).  
* **Ler Tipo do Arranjo:** O programa lê o tipo de arranjo escolhido pelo usuário.  
* **Exibir Ordens:** O programa exibe as opções de ordenação (crescente ou decrescente).  
* **Ler Ordem:** O programa lê a ordem de classificação escolhida pelo usuário.  
* **Ler Elementos:** O programa lê os elementos que o usuário deseja inserir no arranjo.  
* **Criar Arranjo:** O programa cria um arranjo do tipo e tamanho especificados pelo usuário, preenchendo-o com os elementos lidos.    
* **Arranjo Válido?:** O programa verifica se o arranjo foi criado corretamente.  
* **Sim:** O fluxo segue para a etapa "Exibir Lista Original".  
* **Não:** O fluxo retorna para a etapa "Exibir Menu".  

**Exibir Lista Original:** O programa exibe os elementos do arranjo na ordem em que foram inseridos.    
**Classificar Arranjo:** O programa classifica os elementos do arranjo na ordem especificada pelo usuário (crescente ou decrescente).  
**Exibir Lista Ordenada:** O programa exibe os elementos do arranjo após a classificação.  
**O fluxo retorna para a etapa "Exibir Menu", permitindo que o usuário realize outras operações ou escolha sair do programa.**  

## Diagrama de Classes

![Diagrama de Classes - ArraySortPoly - IntelliJ.png](Diagrama%20de%20Classes%20-%20ArraySortPoly%20-%20IntelliJ.png)
Diagrama gerado pelo IntelliJ

![Diagrama de Classes - ArraySortPoly - Mermaid.png](Diagrama%20de%20Classes%20-%20ArraySortPoly%20-%20Mermaid.png)
Diagrama gerado no Mermaid

**Código Mermaid**
```
classDiagram
class Arranjo {
-int tamanho
<<abstract>> void classificar(boolean decrescente)
+int getTamanho()
<<abstract>> void inserir(int indice, T valor)
<<abstract>> T getElemento(int indice)
<<abstract>> void remover(int indice)
<<abstract>> void listar()
}

    class ArranjoByte {
        -byte[] elementos
        +ArranjoByte(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Byte valor)
        +Byte getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class ArranjoChar {
        -char[] elementos
        +ArranjoChar(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Character valor)
        +Character getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class ArranjoDouble {
        -double[] elementos
        +ArranjoDouble(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Double valor)
        +Double getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class ArranjoFloat {
        -float[] elementos
        +ArranjoFloat(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Float valor)
        +Float getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class ArranjoInteiro {
        -int[] elementos
        +ArranjoInteiro(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Integer valor)
        +Integer getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class ArranjoLong {
        -long[] elementos
        +ArranjoLong(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Long valor)
        +Long getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class ArranjoShort {
        -short[] elementos
        +ArranjoShort(int tamanho)
        +void classificar(boolean decrescente)
        +void inserir(int indice, Short valor)
        +Short getElemento(int indice)
        +void remover(int indice)
        +void listar()
    }

    class Main {
        +static void main(String[] args)
        -static Arranjo<?> criarArranjo(TipoArranjo tipo, String elementosStr)
    }

    class TipoArranjo {
        -int valor
        +TipoArranjo(int valor)
        +int getValor()
        +static TipoArranjo fromValor(int valor)
    }

    class Ordem {
        -int valor
        +Ordem(int valor)
        +int getValor()
        +static Ordem fromValor(int valor)
    }

    Arranjo <|-- ArranjoByte
    Arranjo <|-- ArranjoChar
    Arranjo <|-- ArranjoDouble
    Arranjo <|-- ArranjoFloat
    Arranjo <|-- ArranjoInteiro
    Arranjo <|-- ArranjoLong
    Arranjo <|-- ArranjoShort
    Main *-- TipoArranjo
    Main *-- Ordem
```

Esse diagrama de classes representa um sistema de classificação de arrays em Java, onde uma classe abstrata `Arranjo` define a estrutura geral e métodos comuns para diferentes tipos de dados. 
Subclasses como `ArranjoInteiro` e `ArranjoDouble` herdam dessa classe abstrata e implementam métodos específicos para classificar seus respectivos tipos de dados. 
A classe `Main` interage com o usuário e utiliza as classes `TipoArranjo` e `Ordem` (enums) para determinar o tipo de array e a ordem de classificação desejada. 
O polimorfismo permite que o mesmo método `classificar()` seja usado em diferentes tipos de arrays, tornando o sistema flexível e extensível.


## Resultados

| Tipo de Arranjo | Ordem       | Input                    | Output                   |
|-----------------|-------------|--------------------------|--------------------------|
| Inteiro         | Decrescente | 2 1 6 8 3                | 8 6 3 2 1                |
| Double          | Decrescente | 0.2 0.5 1.2 2.5          | 2.5 1.2 0.5 0.2          |
| Inteiro         | Decrescente | 0 1                      | 10                       |
| Char            | Decrescente | n v d a                  | v n d a                  |
| Inteiro         | Crescente   | 5 1 9 3 7                | 1 3 5 7 9                |
| Double          | Crescente   | 3.14 1.59 2.65 0.89 1.78 | 0.89 1.59 1.78 2.65 3.14 |
| Inteiro         | Crescente   | 127 -128 0 50 -10        | -128 -10 0 50 127        |
| Char            | Crescente   | z a t e o                | a e o t z                |

### Imagens dos Resultados
![Resultado - ArraySortPoly - IntelliJ.png](Resultado%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 2 - ArraySortPoly - IntelliJ.png](Resultado%202%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 3 - ArraySortPoly - IntelliJ.png](Resultado%203%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 4 - ArraySortPoly - IntelliJ.png](Resultado%204%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 5 - ArraySortPoly - IntelliJ.png](Resultado%205%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 6 - ArraySortPoly - IntelliJ.png](Resultado%206%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 7 - ArraySortPoly - IntelliJ.png](Resultado%207%20-%20ArraySortPoly%20-%20IntelliJ.png)
![Resultado 8 - ArraySortPoly - IntelliJ.png](Resultado%208%20-%20ArraySortPoly%20-%20IntelliJ.png)

