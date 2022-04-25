# Guia de desenvolvimento

Desafio em Java, código que consiga aprovar as propostas de financiamento baseado em uma lista de dados de usuário.

## A fazer:

- [x] Declarar funções para tratar tipos de mensagem diferentes
- [x] Desestruturar as mensagens em dados separados
- [x] Armazenar os dados em variaveis(utilizado uma matriz para acessar os dados)
- [ ] Desenvolver as funções declaradas
- [ ] Desenvolver condicionais para aprovação das propostas
- [ ] Estruturar dados para resposta
- [ ] Passar nos teste xD

## Regras do evento

- O valor do empréstimo deve estar entre R$ 30.000,00 e R$ 3.000.000,00
- O empréstimo deve ser pago em no mínimo 2 anos e no máximo 15 anos
- Deve haver no mínimo 2 proponentes por proposta
- Deve haver exatamente 1 proponente principal por proposta
- Todos os proponentes devem ser maiores de 18 anos
- Dever haver no mínimo 1 garantia de imóvel por proposta
- A soma do valor das garantias deve ser maior ou igual ao dobro do valor do empréstimo
- As garantias de imóvel dos estados PR, SC e RS não são aceitas
- A renda do proponente principal deve ser pelo menos:
  - 4 vezes o valor da parcela do empréstimo, se a idade dele for entre 18 e 24 anos
  - 3 vezes o valor da parcela do empréstimo, se a idade dele for entre 24 e 50 anos
  - 2 vezes o valor da parcela do empréstimo, se a idade dele for acima de 50 anos
- Em caso de eventos repetidos, considere o primeiro evento
  - Por exemplo, ao receber o evento ID 1 e novamente o mesmo evento, descarte o segundo evento
- Em caso de eventos atrasados, considere sempre o evento mais novo
  - Por exemplo, ao receber dois eventos de atualização com IDs diferentes, porém o último evento tem um timestamp mais antigo do que o primeiro, descarte o evento mais antigo

## Estrutura dos dados

- Lista recebida:

  "72ff1d14-756a-4549-9185-e60e326baf1b,proposal,created,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,1141424.0,240",

  "af745f6d-d5c0-41e9-b04f-ee524befa425,warranty,added,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,31c1dd83-8fb7-44ff-8cb7-947e604f6293,3245356.0,DF",

  "450951ee-a38d-475c-ac21-f22b4566fb29,warranty,added,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,c8753500-1982-4003-8287-3b46c75d4803,3413113.45,DF",

  "66882b68-baa4-47b1-9cc7-7db9c2d8f823,proponent,added,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,3f52890a-7e9a-4447-a19b-bb5008a09672,Ismael Streich Jr.,42,62615.64,true"

- Mensagem de cada elemento da lista:

Mensagem do evento:
"72ff1d14-756a-4549-9185-e60e326baf1b,proposal,created,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,1141424.0,240",

- event_id: 72ff1d14-756a-4549-9185-e60e326baf1b,
- event_schema: proposal
- event_action: created
- event_timestamp: created,2019-11-11T14:28:01Z
- proposal_id: 80921e5f-4307-4623-9ddb-5bf826a31dd7,
- proposal_loan_value: 1141424.0
- proposal_number_of_munthlyinstallments: 240
