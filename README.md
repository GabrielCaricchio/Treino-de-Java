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

    obs: o var vai inferir qual é o tipo da variável
    (porém após ele definir pela primeira vez qual é o tipo da variável, esse tipo não poderá ser alterado)


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

##### Comentarios: 

`/*`   
Comentario de mais de uma linha
 `*/`     


`//` Comentario de uma linha


##### Condicionais:

###### Estrutura:
if(){

} else if (){

}
else {

}

###### Exemplos

Maior
> if(b > 99){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}

Maior ou Igual a
> if(i >= 1000){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}


Menor
> if(l < 99){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}

Menor ou Igual a
> if(d <= 30){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}


Verdadeiro ou Falso
> if(bool){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}


Comparar para ver se é igual a:
> if(str == "Caricchio"){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}


Verificar valor de String
> if(str.equals("Arruda")){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}

Verificar se a String é vazia
> if(str.isBlank()){ 
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso");
}

##### Vetores
Vetor ou `array` é uma estrutura de dados utilizada para armazenar uma coleção de valores do mesmo tipo.

>Estrutura:
int`[]` colecaoDeInteiros = {1,2,3,4,5}; 

obs as posições dentroooo de um array começam a partir da posição(indice) 0

`Para printar uma posição especifica do array:`
System.out.println(volecaoDeInteiros[0]);

- `Obs:` Se você inicilizar um array ele vai estar limitado a quantidade de posições que você definiu.

Para saber o comprimento de um array:
System.out.printls(colecaoDeArray.length);

- Pode criar um array com qualquer tipo primitivo

`Se não quiser inicializar os valores:`
>int meusNumeros = new int [200];

-Obs tem definir o tamanho/comprimento do array quando cria-lo/inicializa-lo.

`Para resolver o problema de não poder aumentar o tamanho dos arrays tem o ArrayList (ArrayList é uma classe)`

> ArrayList<String> nomes = new ArrayList<>();

O ArrayList permite criar uma lista dinamica de elementos, permite remover e adicionar itens de forma dinamica, sem declarar no momento da declaração da variável qual o tamanho que essa ArrayList vai ter .

- Obs tem que importar o ArrayList do java.util:
> import java.util.ArrayList;

###### Comparação entre Array e ArrayList

Array:
> String[] nomesArr = new String[10];
nomesArr[0] = "Gleydson";
nomesArr[1] = "Maria";
System.out.println(nomesArr[0]);

ArrayList:
> ArrayList<String> nomes = new ArrayList<>();
nomes.add("Gabriel");
nomes.add("Chefinho");
nomes.add("Thor");
System.out.println(nomes.get(0));
nomes.remove(index:0):
- Obs  ao remover um item do ArrayList o item posterior a ele irá assumir a posição dele , por exemplo se removesse o index 0 (Gabriel neste caso), o item do index 1 (Chefinho) assumiria sua posição e assim sucessivamente.

- Em um ArrayList é possivel remover tanto por posição , como por objeto também:
> nomes.remove(index: 0);
nomes.remove(o:"Thor");

##### Estruturas de repetição / Loops:
