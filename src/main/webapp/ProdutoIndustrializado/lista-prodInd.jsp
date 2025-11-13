<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Industrializado" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<%

    List<Industrializado> industrializados = (List<Industrializado>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Industrializados</title>
    <style>
        table { border-collapse: collapse; width: 60%; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
        th { background: #f2f2f2; }
        a { margin-right: 8px; }
    </style>
</head>
<body>
    <h2>Lista de Industrializados</h2>
    <a href="<%= request.getAttribute("urlSubmit") %>?acao=novo">Cadastrar Novo Industrializado</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Matrícula</th>
            <th colspan="2">Ações</th>
        </tr>
        <%
            if (industrializados != null && !industrializados.isEmpty()) {
                for (Industrializado industrializado : industrializados) {
        %>
        <tr>
            <td><%= industrializado.getId() %></td>
            <td><%= industrializado.getNome() %></td>
            <td><%= industrializado.getPreco() %></td>
            <td><%= industrializado.getQuantidade() %></td>
            <td><%= industrializado.getFornecedor() %></td>
            <td>
                <a href="<%= request.getAttribute("urlSubmit") %>?acao=buscar&id=<%= industrializado.getId() %>">Editar</a>
            </td>
            <td>
                <a href="<%= request.getAttribute("urlSubmit") %>?acao=deletar&id=<%= industrializado.getId() %>" onclick="return confirm('Tem certeza que deseja remover?');">Remover</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="5">Nenhum industrializado encontrado.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>