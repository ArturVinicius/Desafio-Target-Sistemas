# Desafio Target Sistemas

### 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código.
[Resposta da Questão 1](https://github.com/ArturVinicius/Desafio-Target-Sistemas/blob/main/Fibonacci/Fibonacci.java)


### 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 
IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código. 
[Resposta da Questão 2](https://github.com/ArturVinicius/Desafio-Target-Sistemas/blob/main/CharA/CharA.java)

### 3) Observe o trecho de código abaixo: 
```
int INDICE = 12, SOMA = 0, K = 1;
enquanto K < INDICE
faça { K = K + 1; SOMA = SOMA + K; }
imprimir(SOMA); 

```
### Ao final do processamento, qual será o valor da variável SOMA? 77
[Resposta da Questão 3 Em Código](https://github.com/ArturVinicius/Desafio-Target-Sistemas/blob/main/Soma/Soma.java)

### 4) Descubra a lógica e complete o próximo elemento: 
a) 1, 3, 5, 7, ___ <strong><code>9</code></strong> <br>
b) 2, 4, 8, 16, 32, 64, ____ <strong><code>128</code></strong> <br>
c) 0, 1, 4, 9, 16, 25, 36, ____ <strong><code>49</code></strong> <br>
d) 4, 16, 36, 64, ____ <strong><code>100</code></strong> <br>
e) 1, 1, 2, 3, 5, 8, ____ <strong><code>13</code></strong> <br>
f) 2,10, 12, 16, 17, 18, 19, ____ <strong><code>20</code></strong> <br>

### 5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

```
No primeiro momento eu aciono um interrupto por aproximadamente 5 minutos, logo após eu desligo ele e aciono outro,
ai então vou até a primeira sala, verifico se a lâmpada está ligada, sei que é o interruptor que eu deixei ligado,
se ela estiver delsigada verifico se a lâmpada está quente, se sim sei que o interruptor é o que eu acionei no primeiro
momento, e se ela estiver desligada e fria sei que o interruptor foi o que eu não acionei em nenhum momento.

Logo após eu volto para a sala dos interruptores agora eliminando um interruptor e uma lâmpada, então aciono outro
interruptor dos que restaram, e vou até a outra sala, se a lâmpada estiver acessa sei que é a do interruptor que eu
acionei, se não sei que é o restante, assim identificando cada um dos interruptores e das lâmpadas.
```

#### Como Executar os códigos

* Clone o Repositório

```
git clone https://github.com/ArturVinicius/Desafio-Target-Sistemas.git

```
* Gere o arquivo .class

```
javac Main.java

```
*Execute o arquivo

```
java Main

```
