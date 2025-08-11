CREATE TABLE tools (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    link VARCHAR(255),
    description TEXT,
    tags TEXT
);

/* o flyway permite: controlar versionamento dos scripts SQL do banco, ter scripts de criação e alteração explícitos, manter 
histórico e aplicar migrações de forma segura e auditável. 

Nome do arquivo (padronizado):
V - Indica que é uma versão/migration
<Versão> - Número sequencial
__ - Dois underscores separando a versão da descrição
<Descrição>
.sql
*/

