<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Industrializado" %>
<%@ page import="br.cefetrj.utils.DateUtils" %>
<%
    Industrializado industrializado = (Industrializado) request.getAttribute("industrializado");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Industrializados</title>
</head>
<body>
    <h2><% if (industrializado != null) { %>Editar Industrializado<% } else { %>Cadastrar Industrializado<% } %></h2>
    <form action="/industrializado" method="post">
        <input type="hidden" name="id" value="<%= industrializado != null ? industrializado.getId() : '' %>">
        <input type="hidden" name="acao" value="<%= industrializado != null ? 'editar' : 'cadastrar' %>">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" value="<%= industrializado != null ? industrializado.getNome() : '' %>" required><br><br>
        <label for="preco">Preco:</label>  
        <input type="text" id="preco" name="preco" value="<%= industrializado != null ? industrializado.getMatricula() : '' %>" required><br><br>
        <label for="quantidade">Quantidade:</label>
        <input type="text" id="quantidade" name="quantidade" value="<%= industrializado != null ? industrializado.getCpf() : '' %>" required><br><br>
        <label for="fornecedor">Fornecedor:</label>
        <input type="text" id="fornecedor" name="fornecedor" value="<%= industrializado != null ? industrializado.getCpf() : '' %>" required><br><br>
        <button type="submit"><%= industrializado != null ? 'Editar Industrializado' : 'Cadastrar Industrializado' %></button>
</body>
</html>