<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Gerente" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Lista de gerentes</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Senha</th>
            </tr>
        </thead>
        <tbody>
            <%
    List<Gerente> gerentes = (List<Gerente>) request.getAttribute("gerentes");
    for (Gerente gerente : gerentes) 
{
%>
    <tr>
        <td><%= gerente.id %></td>
        <td><%= gerente.nome %></td>
        <td><%= gerente.senha %></td>
    </tr>
<%
    }
%>
        <button>Cadastrar</button><button>Atualizar</button><button>Deletar</button>
        </tbody>
    </table>
</body>
</html>