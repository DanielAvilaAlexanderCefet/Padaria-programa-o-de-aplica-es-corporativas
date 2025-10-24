<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Vendedor" %>
<%@ page import="br.cefetrj.utils.DateUtils" %>
<%
    Vendedor vendedor = (Vendedor) request.getAttribute("vendedor");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Vendedor</title>
</head>
<body>
    <h2><% if (vendedor != null) { %>Editar Vendedor<% } else { %>Cadastrar Vendedor<% } %></h2>
    <form action="/vendedor" method="post">
        <input type="hidden" name="id" value="<%= vendedor != null ? vendedor.getId() : '' %>">
        <input type="hidden" name="acao" value="<%= vendedor != null ? 'editar' : 'cadastrar' %>">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" value="<%= vendedor != null ? vendedor.getNome() : '' %>" required><br><br> 
        <label for="senha">Senha:</label>  
        <input type="text" id="senha" name="senha" value="<%= vendedor != null ? vendedor.getMatricula() : '' %>" required><br><br>
        <button type="submit"><%= vendedor != null ? 'Editar Vendedor' : 'Cadastrar Vendedor' %></button>
</body>
</html>