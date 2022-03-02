# shopping
API da loja do Grupo Oscar - Challenge


## REST API

Desenvolvida usando spring-boot e PostgreSQL.

Foi usado o `flyway db` é uma ferramenta que se permite garantir a ordem e organização para os scripts SQL que são executados na base de dados, garantindo o controle de versão dos mesmos.

Foram registados alguns dados no banco de dados em entidades como `Calcado`, `Categoria`, `Cor`, e `Marca` para testes.

## Como executar?

- Criar um banco de dados com nome postgree shopping com { username : postgres, password : 1234 } ou mudar os dados para o seu banco de dados local no ficheiro `src/main/resources/application.yml`
- `cd shopping`
- `mvnw clean install -DskipTests`
- `java -jar target/shopping 0.0.1-SNAPSHOT.jar`

A partir deste momento, seguindo corretamente os passos terá a api correndo no endereço `http://localhost:8081/api/v1/`

NB:
Poderá encontrar uma documentação mais interativa da API no endereço `http://localhost:8081/swagger-ui/`


## Front End

- Segue o link de uma pequena implementacao de algumas funcionalidades da API 
- 




