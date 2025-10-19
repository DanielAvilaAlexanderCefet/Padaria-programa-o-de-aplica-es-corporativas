<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Industrializado" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Lista de produtos industrializados</h1>
    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Preco</th>
                <th>Quantidade</th>
                <th>Fornecedor</th>
            </tr>
        </thead>
        <tbody>
            <%
    List<Industrializado> industrializados = (List<Industrializado>) request.getAttribute("industrializados");
    for (Industrializado industrializado : industrializados) 
{
%>
    <tr>
        <td><%= industrializado.nome %></td>
        <td><%= industrializado.preco %></td>
        <td><%= industrializado.quantidade %></td>
        <td><%= industrializado.fornecedor %></td>

    </tr>
<%
    }
%>      
        <button>Cadastrar</button><button>Atualizar</button><button>Deletar</button>
        </tbody>
    </table>
</body>
</html>