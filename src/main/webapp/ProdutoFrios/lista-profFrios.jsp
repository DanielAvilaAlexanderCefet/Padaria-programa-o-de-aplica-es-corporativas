<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.PFrio" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<%

    List<Produto> pFrios = (List<Produto>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Frios</title>
    <style>
        table { border-collapse: collapse; width: 60%; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
        th { background: #f2f2f2; }
        a { margin-right: 8px; }
    </style>
</head>
<body>
    <h2>Lista de Frios</h2>
    <a href="<%= request.getAttribute("urlSubmit") %>?acao=novo">Cadastrar Novo Produto</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Matrícula</th>
            <th colspan="2">Ações</th>
        </tr>
        <%
            if (pFrios != null && !pFrios.isEmpty()) {
                for (Produto pFrio : pFrios) {
        %>
        <tr>
            <td><%= pFrio.getId() %></td>
            <td><%= pFrio.getNome() %></td>
            <td><%= pFrio.getPreco() %></td>
            <td><%= pFrio.getQuantidade() %></td>
            <td><%= pFrio.getTempIdeal() %></td>
            <td>
                <a href="<%= request.getAttribute("urlSubmit") %>?acao=buscar&id=<%= pFrio.getId() %>">Editar</a>
            </td>
            <td>
                <a href="<%= request.getAttribute("urlSubmit") %>?acao=deletar&id=<%= pFrio.getId() %>" onclick="return confirm('Tem certeza que deseja remover?');">Remover</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="5">Nenhum pFrio encontrado.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>