<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.PFrio" %>
<%@ page import="br.cefetrj.utils.DateUtils" %>
<%
    PFrio pFrio = (PFrio) request.getAttribute("pFrio");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Frios</title>
</head>
<body>
    <h2><% if (pFrio != null) { %>Editar PFrio<% } else { %>Cadastrar PFrio<% } %></h2>
    <form action="/pFrio" method="post">
        <input type="hidden" name="id" value="<%= pFrio != null ? pFrio.getId() : '' %>">
        <input type="hidden" name="acao" value="<%= pFrio != null ? 'editar' : 'cadastrar' %>">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" value="<%= pFrio != null ? pFrio.getNome() : '' %>" required><br><br>
        <label for="preco">Preco:</label>  
        <input type="text" id="preco" name="preco" value="<%= pFrio != null ? pFrio.getMatricula() : '' %>" required><br><br>
        <label for="quantidade">Quantidade:</label>
        <input type="text" id="quantidade" name="quantidade" value="<%= pFrio != null ? pFrio.getCpf() : '' %>" required><br><br>
        <label for="tempIdeal">Temperatura Ideal:</label>
        <input type="text" id="tempIdeal" name="tempIdeal" value="<%= pFrio != null ? pFrio.getCpf() : '' %>" required><br><br>
        <button type="submit"><%= pFrio != null ? 'Editar PFrio' : 'Cadastrar PFrio' %></button>
</body>
</html>