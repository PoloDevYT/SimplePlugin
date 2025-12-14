# SimplePlugin

Plugin simples de Minecraft usando a API do Paper. O plugin adiciona o comando `/saudacao`, que envia uma mensagem personalizada para quem o executa.

## Requisitos
- Java 17 ou superior
- Servidor Paper 1.20.4
- Maven 3.9+

## Como compilar
```bash
mvn clean package
```
O arquivo gerado estará em `target/simpleplugin-1.0.0.jar`. Copie-o para a pasta `plugins` do seu servidor Paper.

## Uso
- Inicie o servidor com o plugin instalado.
- Execute `/saudacao` no chat ou no console para receber a mensagem de boas-vindas.
