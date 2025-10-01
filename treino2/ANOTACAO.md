# Anotações de Java:

> - POO (linguagem orientada a objetos, paradigma orientado a objetos): a liguagem gira em torno de classes e objetos e as interações entre eles.

> - `Fortemente tipada: todas as variaveis tem que atribuir o tipo , e ele não pode ser alterado após ser definido`.

> - Independente de plataforma(pode ser executado em diferentes sistemas operacionais e arquiteturas).

> - JVM (Java Virtual Machine) : é o ambiente de execução que vai interpretar o bytecode do  Java.
    Codigo Java  -> transforma em bytecode -> JVM (Java é compilado e executado) -> Codigo de maquina.

> - Pré-requisito : jdk(java develop kit) `24` ou 25 , e IDE (intellij community edition, eclipse , vs code)

---

## Sintaxe

> - `Java project` : criar nova pasta -> new project -> new class

- Todo arquivo java tem que ter uma classe, e o nome da classe tem que ser igual ao nome do arquivo (pode ter mais de uma classe por arquivo, mas tem que ter ao menos 1 com o nome do arquivo e está é a classe principal, a classe que for ser a principal do arquivo tem que ser public)

---

##### Variáveis:

###### Declaração:
        int meuDinheiro = 2000;

        var minhaDivida = 5000;

    obs: o var vai inferir qual é o tipo da variável (porém após ele definir pela primeira vez qual é o tipo da variável, esse tipo não poderá ser alterado)

###### Tipos primitivos:
    Números Inteiros:
- byte => 8 bits => -128 a 127
- short => 16 bits => -32.768 a 32.767
- `int` => 32 bits => -2.147.483.648 a 2.147.483.647
- `long` => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        Números Decimais / Reais:
- float => 32 bits => precisão simples
- double => 64 bits => precisão dupla

            Texto
- String => representar palavras e frases (obs String não é tipo primitivo é uma classe)
- char => representar um unico caractere

                Verdadeiro ou Falso
- boolean => true ou false

---

byte b = 100;

short s = 10000;

int i = 100000;

long l = 100000L;

float f = 10.5f;

double d = 20.5;

char c = 'A';

String str = "Caricchio";

booolean bool = true;

---

###### Comentarios: 

`/*`   
Comentario de mais de uma linha
 `*/`     


`//` Comentario de uma linha

###### Condicionais:

