package br.cefetrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.model.PFrio;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/CadastroProdF")
public class CadastroProdFServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("Nome: " + request.getParameter("nome") + "<br>");
        response.getWriter().println("Quantidade: " + request.getParameter("quantidade") + "<br>");
        response.getWriter().println("Preco: " + request.getParameter("preco") + "<br>");
        response.getWriter().println("Temperatura ideal: " + request.getParameter("temperatura") + "<br>");
        response.getWriter().println("</body></html>");
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<PFrio> frios = criaProdutosInd();
        request.setAttribute("frios", frios);
        RequestDispatcher rd = request.getRequestDispatcher("lista-profFrios.jsp");

        rd.forward(request, response);
    }

    private List<PFrio> criaProdutosInd() {
        List<PFrio> frios = new ArrayList<>();
        PFrio produto1 = new PFrio("test1", 23,2,5);
        PFrio produto2 = new PFrio("test2", 19,4,4);
        PFrio produto3 = new PFrio("test3", 25,5,3);
        frios.add(produto1);
        frios.add(produto2);
        frios.add(produto3);
        return frios;
    }
}
 
    

