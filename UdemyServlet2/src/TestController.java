

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestController() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 Get request dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
		//2 get the data from model
		String data = TestModel.getData();
		//3 send data to request object
		request.setAttribute("data", data);
		
		//4 forward request and response
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
