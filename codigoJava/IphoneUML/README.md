Este projeto simula funcionalidades de um iPhone utilizando Java. Ele permite a criação de um dispositivo iPhone com as seguintes funções principais:

- Reprodutor Musical: Reproduz e pausa músicas.
- Aparelho Telefônico: Realiza ligações, atende chamadas e inicia o correio de voz.
- Navegador de Internet: Exibe páginas web, adiciona abas e atualiza páginas.

### Funcionalidades Principais

#### Reprodutor Musical

- `tocar()`: Reproduz a música selecionada.
- `pausar()`: Pausa a música em reprodução.
- `selecionarMusica(String musica)`: Seleciona a música a ser tocada.

#### Aparelho Telefônico

- `ligar(String numero)`: Faz uma ligação para o número informado.
- `atender()`: Atende uma chamada.
- `iniciarCorreioVoz()`: Inicia o serviço de correio de voz.

#### Navegador de Internet

- `exibirPagina(String url)`: Exibe a página da web da URL fornecida.
- `adicionarNovaAba()`: Adiciona uma nova aba ao navegador.
- `atualizarPagina()`: Atualiza a página atual do navegador.

### Como utilizar o projeto

Para executar o código, basta seguir os passos abaixo:

1. **Clonar o Repositório:** Clone o repositório para o seu ambiente local:

```
git clone https://github.com/seu-usuario/iphone-simulator.git
```

2. **Compilar e Executar o Código:** Navegue até a pasta do projeto e compile os arquivos Java:

```
javac iPhone.java Main.java
```

Após a compilação, execute o projeto:

```
java Main
```

3. **Saída Esperada:** Ao executar, você verá uma saída semelhante a esta:

```
Música selecionada: Imagine - John Lennon
Reproduzindo música...
Música pausada.
Ligando para: 123-456-789
Atendendo chamada...
Iniciando correio de voz...
Exibindo página: www.exemplo.com
Nova aba adicionada.
Página atualizada.
```

### Estrutura do Projeto

```
/iphone-simulator
│
├── iPhone.java        # Classe principal que implementa as funcionalidades
├── Main.java          # Classe contendo o método main() para testar as funcionalidades
└── README.md          # Instruções e detalhes do projeto
```

### Requisitos
- Java 8 ou superior instalado.

### Ferramentas Utilizadas

- Implementação do código Java: Visual Studio Code
- Ferramenta UML para a modelagem do diagrama de classes: draw.io
