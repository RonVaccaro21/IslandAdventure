package edu.ycp.cs320.IslandAdventure.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.IslandAdventure.controller.ActionController;
import edu.ycp.cs320.IslandAdventure.controller.InventoryController;
import edu.ycp.cs320.IslandAdventure.model.Inventory;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Login Servlet: doGet");
		
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("LoginServlet: doPost");
		
		// Navigating to new page by pressing button
		if (req.getParameter("justPlay") != null) {
			System.out.println("justPlay has been clicked!");
			req.getRequestDispatcher("/_view/index.jsp").forward(req, resp); //Go to this page
		}else{
			// if create new account was selected, then go to account page
		}
		
		// create Inventory model - model does not persist between requests
		// must recreate it each time a Post comes in 
		Inventory inventoryModel = new Inventory();
		
		InventoryController inventoryController = new InventoryController();
		
		// assign model reference to controller so that controller can access model
		inventoryController.setModel(inventoryModel);
		
		// Initialize variables in the Inventory model
		inventoryController.createGame();
		
		req.setAttribute("inventory", inventoryModel);
		
		req.setAttribute("action", req.getParameter("action"));
		
		String action = req.getParameter("action");
	
		req.setAttribute("lastAction", action);
		
		ActionController controller = new ActionController();
		controller.interpretAction(action);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}
}
