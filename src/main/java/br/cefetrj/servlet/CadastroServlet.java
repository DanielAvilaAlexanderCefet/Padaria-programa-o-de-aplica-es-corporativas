package br.cefetrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.model.Produto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Cadastro")
public class CadastroServlet extends GenericServlet {
    

    @Override
    protected Produto preencherEntidade(HttpServletRequest request) {
        Produto produto = new Produto();
        String id = request.getParameter("id");
        produto.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        produto.setNome(request.getParameter("nome"));
        produto.setPreco(Integer.parseInt(request.getParameter("preco")));
        produto.setQuantidade(Integer.parseInt(request.getParameter("idade")));
        return produto;
    }
}