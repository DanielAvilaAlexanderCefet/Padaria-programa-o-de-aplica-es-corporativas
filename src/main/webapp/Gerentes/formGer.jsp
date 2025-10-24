<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Gerente" %>
<%@ page import="br.cefetrj.utils.DateUtils" %>
<%
    Gerente gerente = (Gerente) request.getAttribute("gerente");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Gerente</title>
</head>
<body>
    <h2><% if (gerente != null) { %>Editar Gerente<% } else { %>Cadastrar Gerente<% } %></h2>
    <form action="/gerente" method="post">
        <input type="hidden" name="id" value="<%= gerente != null ? gerente.getId() : '' %>">
        <input type="hidden" name="acao" value="<%= gerente != null ? 'editar' : 'cadastrar' %>">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" value="<%= gerente != null ? gerente.getNome() : '' %>" required><br><br> 
        <label for="senha">Senha:</label>  
        <input type="text" id="senha" name="senha" value="<%= gerente != null ? gerente.getMatricula() : '' %>" required><br><br>
        <button type="submit"><%= gerente != null ? 'Editar Gerente' : 'Cadastrar Gerente' %></button>
</body>
</html>