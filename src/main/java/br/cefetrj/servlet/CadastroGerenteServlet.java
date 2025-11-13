package br.cefetrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// gerente Gerente gerentes
import br.cefetrj.model.Gerente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CadastroGerente")
public class CadastroGerenteServlet extends GenericServlet {

    @Override
    protected Gerente preencherEntidade(HttpServletRequest request) {
        Gerente gerente = new Gerente();
        String id = request.getParameter("id");
        gerente.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        gerente.setNome(request.getParameter("nome"));
        gerente.setSenha(request.getParameter("senha"));

        return gerente;
    }
}