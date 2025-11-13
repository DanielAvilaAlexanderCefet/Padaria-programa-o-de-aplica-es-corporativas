<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Gerente" %>
<html lang="en">
<%

    List<Gerente> gerentes = (List<Gerente>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Gerentes</title>
    <style>
        table { border-collapse: collapse; width: 60%; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
        th { background: #f2f2f2; }
        a { margin-right: 8px; }
    </style>
</head>
<body>
    <h2>Lista de Gerentes</h2>
    <a href="<%= request.getAttribute("urlSubmit") %>?acao=novo">Cadastrar Novo Gerente</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Matrícula</th>
            <th colspan="2">Ações</th>
        </tr>
        <%
            if (gerentes != null && !gerentes.isEmpty()) {
                for (Gerente gerente : gerentes) {
        %>
        <tr>
            <td><%= gerente.getId() %></td>
            <td><%= gerente.getNome() %></td>
            <td><%= gerente.getSenha() %></td>
            <td>
                <a href="<%= request.getAttribute("urlSubmit") %>?acao=buscar&id=<%= gerente.getId() %>">Editar</a>
            </td>
            <td>
                <a href="<%= request.getAttribute("urlSubmit") %>?acao=deletar&id=<%= gerente.getId() %>" onclick="return confirm('Tem certeza que deseja remover?');">Remover</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="5">Nenhum gerente encontrado.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
</html>