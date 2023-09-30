package in.com.akhil;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class CreatePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Get the data from the form
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String content = request.getParameter("content");

        // Create a BlogPost object
        BlogPost post = new BlogPost();
        post.setTitle(title);
        post.setDescription(description);
        post.setContent(content);

        // Store the blog post in the database
        // ... code to store the blog post in the database ...

        // Redirect to the view all posts page
        response.sendRedirect("viewAllPosts");
	}

}
