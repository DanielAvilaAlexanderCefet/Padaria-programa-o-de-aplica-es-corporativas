package br.cefetrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import br.cefetrj.model.Vendedor;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CadastroVendedor")
public class CadastroVendedorServlet extends GenericServlet {

    @Override
    protected Vendedor preencherEntidade(HttpServletRequest request) {
        Vendedor vendedor = new Vendedor();
        String id = request.getParameter("id");
        vendedor.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        vendedor.setNome(request.getParameter("nome"));
        vendedor.setSenha(request.getParameter("senha"));

        return vendedor;
    }
}
