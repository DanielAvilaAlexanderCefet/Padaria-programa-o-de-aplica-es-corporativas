package br.cefetrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.model.Industrializado;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/CadastroProdInd")
public class CadastroProdIndServlet extends GenericServlet {
    
    @Override
    protected Industrializado preencherEntidade(HttpServletRequest request) {
        Industrializado industrializado = new Industrializado();
        String id = request.getParameter("id");
        industrializado.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        industrializado.setNome(request.getParameter("nome"));
        industrializado.setPreco(Integer.parseInt(request.getParameter("preco")));
        industrializado.setQuantidade(Integer.parseInt(request.getParameter("idade")));
        industrializado.setFornecedor(request.getParameter("fornecedor"));
        return industrializado;
    }
}