package br.cefetrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.model.Cliente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Cliente")
public class ClienteServlet extends GenericServlet {
    

    @Override
    protected Cliente preencherEntidade(HttpServletRequest request) {
        Cliente cliente = new Cliente();
        String id = request.getParameter("id");
        cliente.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        cliente.setNome(request.getParameter("nome"));
        cliente.setIdade(Integer.parseInt(request.getParameter("idade")));

        return cliente;
    }
}
