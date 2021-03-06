
package edu.ycp.cs320.IslandAdventure.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.IslandAdventure.controller.ActionController;
import edu.ycp.cs320.IslandAdventure.controller.InventoryController;
import edu.ycp.cs320.IslandAdventure.controller.PlayerController;
import edu.ycp.cs320.IslandAdventure.model.Inventory;
import edu.ycp.cs320.IslandAdventure.model.Player;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		
		System.out.println("Index Servlet: doGet");

		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		
		System.out.println("Index Servlet: doPost");
		
		// create Inventory model - model does not persist between requests
		// must recreate it each time a Post comes in 
		String action = "";
		PlayerController playerController = new PlayerController();
		Player player = playerController.createNewPlayer();

		Inventory inventoryModel = new Inventory(player.getInventory().getInventoryMap());
		InventoryController inventoryController = new InventoryController(player.getInventory());
		ActionController controller = new ActionController(player);

		
		// assign model reference to controller so that controller can access model
		inventoryController.setModel(inventoryModel);

		// Initialize variables in the Inventory model		
		req.setAttribute("inventory", inventoryModel);
		
		req.setAttribute("action", req.getParameter("action"));
		
		action = req.getParameter("action");
	
		req.setAttribute("lastAction", action);
		
		controller.interpretAction(action);
		
		req.setAttribute("woodCount", player.getInventory().getWoodCount());
		
		req.setAttribute("locationX", player.getLocation().getX());
		req.setAttribute("locationY", player.getLocation().getY());
		req.setAttribute("locationZ", player.getLocation().getZ());
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
	}
}
