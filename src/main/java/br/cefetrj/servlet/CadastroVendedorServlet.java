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
public class CadastroVendedorServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("ID: " + request.getParameter("id") + "<br>");
        response.getWriter().println("Nome: " + request.getParameter("nome") + "<br>");
        response.getWriter().println("Senha: " + request.getParameter("senha") + "<br>");
        response.getWriter().println("</body></html>");

    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<Vendedor> vendedores = criaUsuarios();
        request.setAttribute("vendedores", vendedores);
        RequestDispatcher rd = request.getRequestDispatcher("lista-Vendedores.jsp");

        rd.forward(request, response);
    }

    private List<Vendedor> criaUsuarios() {
        List<Vendedor> vendedores = new ArrayList<>();
        Vendedor vendedor1 = new Vendedor(1, "Vendedor1","senha1");
        Vendedor vendedor2 = new Vendedor(2, "Vendedor1","senha2");
        Vendedor vendedor3 = new Vendedor(3, "Vendedor1","senha3");
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        return vendedores;
    }
}