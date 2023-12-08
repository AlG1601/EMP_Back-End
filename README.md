# Scripts do Banco de Dados MySQL
## Pasta Banco-de-dados-EMP-main
Esta pasta contém os scripts necessários para criar o banco de dados MySQL de login e cadastro completo. Execute os scripts no servidor MySQL para criar o esquema necessário.

## spring-project
Esta pasta contém o código-fonte e os recursos relacionados à API de login e cadastro. Para configurar a API, siga as etapas abaixo.

### Database (Dentro da pasta spring-project)
Esta pasta contém os scripts necessários para configurar o banco de dados MySQL. Execute os scripts no seu servidor MySQL para criar o esquema necessário.

#### Configuração do Banco de Dados
Usuário de acesso: root <br>
Senha do banco: root <br>
URL do banco: jdbc:mysql://localhost:3306/emp

### API de Login e Cadastro
Esta pasta contém o código-fonte e os recursos relacionados à API de login e cadastro. Para configurar a API, siga as etapas abaixo.

### Configuração do Application Properties
No arquivo application.properties localizado na pasta src/main/resources, ajuste as seguintes configurações conforme necessário:

### Usuário de acesso ao banco de dados
spring.datasource.username=root

### Senha do banco de dados
spring.datasource.password=root

### URL do banco de dados
spring.datasource.url=jdbc:mysql://localhost:3306/emp

### Rodando a API
Certifique-se de ter o ambiente de desenvolvimento configurado.
Execute o aplicativo Spring Boot.
Acesse a API em http://localhost:8091 (ou a porta configurada).
