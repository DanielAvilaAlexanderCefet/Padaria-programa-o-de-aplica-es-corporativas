<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="br.cefetrj.model.PFrio" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Lista de Frios</h1>
    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Preco</th>
                <th>Quantidade</th>
                <th>Temperatura Ideal</th>
            </tr>
        </thead>
        <tbody>
            <%
    List<PFrio> frios = (List<PFrio>) request.getAttribute("frios");
    for (PFrio frio : frios) 
{
%>
    <tr>
        <td><%= frio.nome %></td>
        <td><%= frio.preco %></td>
        <td><%= frio.quantidade %></td>
        <td><%= frio.tempIdeal %></td>

    </tr>
<%
    }
%>
        <button>Cadastrar</button><button>Atualizar</button><button>Deletar</button>
        </tbody>
    </table>
</body>
</html>