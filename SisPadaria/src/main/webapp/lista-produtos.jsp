<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.Produto" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Lista de produtos</h1>
    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Preco</th>
                <th>Quantidade</th>
            </tr>
        </thead>
        <tbody>
            <%
    List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
    for (Produto produto : produtos) 
{
%>
    <tr>
        <td><%= produto.nome %></td>
        <td><%= produto.preco %></td>
        <td><%= produto.quantidade %></td>
    </tr>
<%
    }
%>
        <button>Cadastrar</button><button>Atualizar</button><button>Deletar</button>
        </tbody>
    </table>
</body>
</html>