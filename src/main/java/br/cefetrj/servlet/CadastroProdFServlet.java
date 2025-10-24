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
public class CadastroProdFServlet extends GenericServlet {
    
    @Override
    protected PFrio preencherEntidade(HttpServletRequest request) {
        PFrio pFrio = new PFrio();
        String id = request.getParameter("id");
        pFrio.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        pFrio.setNome(request.getParameter("nome"));
        pFrio.setPreco(Integer.parseInt(request.getParameter("preco")));
        pFrio.setQuantidade(Integer.parseInt(request.getParameter("idade")));
        pFrio.setTempIdeal(Integer.parseInt(request.getParameter("temperatura")));
        return pFrio;
    }
}
 
    

