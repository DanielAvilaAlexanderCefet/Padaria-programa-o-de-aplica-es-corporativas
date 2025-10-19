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
public class CadastroProdIndServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("Nome: " + request.getParameter("nome") + "<br>");
        response.getWriter().println("Quantidade: " + request.getParameter("quantidade") + "<br>");
        response.getWriter().println("Preco: " + request.getParameter("preco") + "<br>");
        response.getWriter().println("Fornecedor: " + request.getParameter("fornecedor") + "<br>");
        response.getWriter().println("</body></html>");
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<Industrializado> industrializados = criaProdutosInd();
        request.setAttribute("industrializados", industrializados);
        RequestDispatcher rd = request.getRequestDispatcher("lista-prodInd.jsp");

        rd.forward(request, response);
    }

    private List<Industrializado> criaProdutosInd() {
        List<Industrializado> industrializados = new ArrayList<>();
        Industrializado produto1 = new Industrializado("test1", 23,2,"testF1");
        Industrializado produto2 = new Industrializado("test2", 19,4,"testF2");
        Industrializado produto3 = new Industrializado("test3", 25,5,"testF3");
        industrializados.add(produto1);
        industrializados.add(produto2);
        industrializados.add(produto3);
        return industrializados;
    }
}