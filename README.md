# 📦 Sistema de Gestão de Pedidos em Java

Este projeto é um **sistema simples de gerenciamento de pedidos**, desenvolvido em **Java**, com foco em **programação orientada a objetos (POO)**.  
Ele permite cadastrar clientes, criar pedidos, adicionar itens e calcular automaticamente o valor total do pedido.

---

## 📋 Funcionalidades

- Cadastro de **Cliente** (nome, e-mail e data de nascimento).  
- Criação de **Pedido** com status (PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE).  
- Inclusão de **Produtos** e associação deles a um pedido.  
- Registro de **Itens do Pedido** (produto, preço unitário e quantidade).  
- Cálculo automático do **subtotal por item** e do **total geral** do pedido.  
- Geração de um **relatório final formatado** do pedido.

---


### 🔹 Classes principais

- **Cliente** → Armazena informações do cliente.  
- **Produto** → Representa os produtos disponíveis.  
- **ItemPedido** → Relaciona um produto ao pedido (com preço e quantidade).  
- **Pedido** → Contém os itens, cliente, status e calcula o valor total.  
- **StatusPedido (enum)** → Define os estados possíveis de um pedido.  
- **ProgramaPrincipal** → Classe principal que integra todas as partes.

---
## ⚙️ Tecnologias e Conceitos Aplicados

- **Java SE 24+**  
- **Programação Orientada a Objetos (POO)**  
- **Encapsulamento e associações entre classes**  
- **Enums e listas (`ArrayList`)**  
- **Manipulação de datas (`Date` e `SimpleDateFormat`)**  
- **Fluxo de aplicação de pedidos realista**, simulando um mini-sistema de vendas

---

💡 Exemplo de Execução

Entrada:

Cliente: João Silva

Email: joao@gmail.com

Data de nascimento: 15/05/1995

---

Pedido: PROCESSANDO

Itens: 

1 - Notebook - $3500.00 - Quantidade: 1

2 - Mouse - $150.00 - Quantidade: 2

---

Saída no Terminal:

MOMENTO DO PEDIDO: 11/09/2025 21:15:32

STATUS DO PEDIDO: PROCESSANDO

CLIENTE: João Silva (15/05/1995) - joao@gmail.com

ITENS DO PEDIDO: 

Notebook, $3500.00, quantidade: 1, SubTotal: $3500.00

Mouse, $150.00, quantidade: 2, SubTotal: $300.00

PREÇO TOTAL: $3800.00

---
👨‍💻 Autor

João Neto
neto31510@gmail.com
(34) 99683-2626
https://www.linkedin.com/in/joao-rodrigues-neto-855757293

---

