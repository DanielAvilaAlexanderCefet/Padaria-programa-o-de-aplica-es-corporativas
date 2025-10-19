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
public class CadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("Nome: " + request.getParameter("nome") + "<br>");
        response.getWriter().println("Quantidade: " + request.getParameter("quantidade") + "<br>");
        response.getWriter().println("Preco: " + request.getParameter("preco") + "<br>");
        response.getWriter().println("</body></html>");

    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<Produto> produtos = criaProdutos();
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd = request.getRequestDispatcher("lista-produtos.jsp");

        rd.forward(request, response);
    }

    private List<Produto> criaProdutos() {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("test1", 23,2);
        Produto produto2 = new Produto("test2", 19,4);
        Produto produto3 = new Produto("test3", 25,5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        return produtos;
    }
}
