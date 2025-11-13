<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Produto" %>
<%@ page import="br.cefetrj.utils.DateUtils" %>
<%
    Produto produto = (Produto) request.getAttribute("produto");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Produto</title>
</head>
<body>
    <h2><% if (produto != null) { %>Editar Produto<% } else { %>Cadastrar Produto<% } %></h2>
    <form action="/produto" method="post">
        <input type="hidden" name="id" value="<%= produto != null ? produto.getId() : '' %>">
        <input type="hidden" name="acao" value="<%= produto != null ? 'editar' : 'cadastrar' %>">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" value="<%= produto != null ? produto.getNome() : '' %>" required><br><br>
        <label for="preco">Preco:</label>  
        <input type="text" id="preco" name="preco" value="<%= produto != null ? produto.getMatricula() : '' %>" required><br><br>
        <label for="quantidade">Quantidade:</label>
        <input type="text" id="quantidade" name="quantidade" value="<%= produto != null ? produto.getCpf() : '' %>" required><br><br>
        <button type="submit"><%= produto != null ? 'Editar Produto' : 'Cadastrar Produto' %></button>
</body>
</html>