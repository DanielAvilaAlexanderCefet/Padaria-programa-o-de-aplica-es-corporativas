<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Vendedor" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Lista de vendedores</h1>
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
    List<Vendedor> vendedores = (List<Vendedor>) request.getAttribute("vendedores");
    for (Vendedor vendedor : vendedores) 
{
%>
    <tr>
        <td><%= vendedor.id %></td>
        <td><%= vendedor.nome %></td>
        <td><%= vendedor.senha %></td>
    </tr>
<%
    }
%>
        <button>Cadastrar</button><button>Atualizar</button><button>Deletar</button>
        </tbody>
    </table>
</body>
</html>