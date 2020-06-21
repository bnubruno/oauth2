
# Projeto de Autenticação com Spring

Projeto criado para testar a utilização do Oauth2 com Spring Framework.

## Bibliotecas utilizadas

- spring-security-oauth2-autoconfigure (link)
- spring-boot-starter-security (link)
- spring-boot-starter-data-jpa (link)
- spring-boot-starter-web (link)
- lombok (link)

## Features

- Fluxos OAuth2 implementados: 
    - Password
    - Authorization Code
- Armazendamento de Token: 
    - JDBC
- Clients OAuth2
    - JDBC
- Swagger (Login com fluxo de autorização)
- Roles/Authorities

## Usuários


|Usuário| Senha | Roles |
|--|--|--|
| admin | 123456 | ROLE_USER, ROLE_ADMIN |
| user | 123456 | ROLE_USER |

## Clients

|Client ID| Client Secret | scope | grant_type |
|--|--|--|--|
| frontend | 123456 | read,write | authorization_code, password |