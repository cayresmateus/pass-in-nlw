# API para Gestão de Eventos e Participantes

Esta API foi desenvolvida para facilitar a gestão de eventos e participantes. Ela oferece funcionalidades específicas para criar eventos, adicionar participantes, fazer check-in e obter informações sobre eventos e participantes.

## Funcionalidades Principais

### Participantes
- **Credencial de Participante (GET):** Quando um participante se registra para um evento, recebe uma credencial única para esse evento em **"/attendees/attendeeId/badge"**
- **Check-in de Participante (POST):** Os participantes podem fazer check-in em um evento uma única vez usando sua credencial. Isso confirma sua presença no evento em **"/attendees/attendeeId/check-in"**
- 



### Eventos

- **Criar Evento (POST):** Permite que organizadores criem novos eventos, definindo detalhes e limite de participantes em **"/events"**
- **Buscar Evento por ID (GET):** Permite que os usuários encontrem informações detalhadas sobre um evento específico usando seu ID único em **"/events/eventId"**
- **Criar Participante (POST):** Permite criar um novo participante fornecendo nome e email em **"/events/eventId/attendees"**


## Tecnologias Utilizadas

- **Linguagem de Programação:** JAVA
- **Framework Web:** Spring
- **Banco de Dados:** HyperSql


## Contribuição

Contribuições para este projeto são bem-vindas. Os interessados podem contribuir de várias maneiras, como implementando novos recursos, corrigindo problemas, melhorando a documentação, etc. Basta abrir uma issue para discutir as alterações propostas ou enviar um pull request diretamente.

