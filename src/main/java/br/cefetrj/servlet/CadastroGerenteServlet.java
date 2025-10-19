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
public class CadastroGerenteServlet extends HttpServlet {
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
        List<Gerente> gerentes = criaUsuarios();
        request.setAttribute("gerentes", gerentes);
        RequestDispatcher rd = request.getRequestDispatcher("lista-Gerentes.jsp");

        rd.forward(request, response);
    }

    private List<Gerente> criaUsuarios() {
        List<Gerente> gerentes = new ArrayList<>();
        Gerente gerente1 = new Gerente(1, "Gerente1","senha1");
        Gerente gerente2 = new Gerente(2, "Gerente2","senha2");
        Gerente gerente3 = new Gerente(3, "Gerente3","senha3");
        gerentes.add(gerente1);
        gerentes.add(gerente2);
        gerentes.add(gerente3);
        return gerentes;
    }
}