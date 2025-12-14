# SimplePlugin

Plugin simples de Minecraft usando a API do Spigot. O plugin adiciona o comando `/saudacao`, que envia uma mensagem personalizada para quem o executa.

## Requisitos
- Java 8 ou superior
- Servidor Spigot 1.8.8
- Maven 3.9+

## Como compilar
```bash
mvn clean package
```
O arquivo gerado estará em `target/simpleplugin-1.0.0.jar`. Copie-o para a pasta `plugins` do seu servidor Spigot.

### Erros de download (HTTP 403)
Caso o Maven esteja bloqueado para acessar o Maven Central (ex.: retornando 403), crie um `settings.xml` local apontando para um espelho liberado ou para o proxy da sua rede. Um modelo está disponível em `settings.xml.example` e aceita a variável de ambiente `MVN_MIRROR_URL` para definir o espelho.

Exemplo usando o arquivo exemplo:
```bash
MVN_MIRROR_URL=https://seu-mirror.exemplo.com/maven2 \
mvn --settings settings.xml.example clean package
```

## Uso
- Inicie o servidor com o plugin instalado.
- Execute `/saudacao` no chat ou no console para receber a mensagem de boas-vindas.
