\# Barber Scheduler - Arquitetura



\## Entidades iniciais



\### Cliente

* id
* nome
* telefone
* email



\### Barbeiro

* id
* nome
* telefone
* ativo



\### Serviço

* id
* nome
* duraçãoEmMinutos
* preço



\### Agendamento

* id
* cliente
* barbeiro
* serviço
* dataHora
* status



\### StatusAgendamento

* AGENDADO
* CANCELADO
* CONCLUÍDO



\## Relacionamentos



Cliente e Barbeiro se conectam através de Agendamento.



```text



Cliente  ┐

&#x20;        ├── Agendamento

Barbeiro ┘



\## Camadas da Aplicação



Controller

&#x20;  ↓

Service

&#x20;  ↓

Repository

&#x20;  ↓

PostgreSQL



\## Regras de Negócio Iniciais

1. Um barbeiro não pode possuir agendamentos sobrepostos.
2. Não é possível criar agendamentos para datas passadas.
3. Não é possível criar agendamentos para barbeiros inativos.
4. Um agendamento deve possuir um status válido.
5. A duração do atendimento é determinada pelo serviço escolhido.







