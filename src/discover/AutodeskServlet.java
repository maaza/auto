package discover;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Level;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class AutodeskServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
	 	PrintWriter pr = resp.getWriter();
 	    pr.println( "<link rel=\"stylesheet\"  type=\"text/css\"  href=\"/stylesheets/main.css\" />");
 	    pr.println("<html>");
 	    pr.println("<body>");
 	    pr.println("<div id=\"page\">");
 	    pr.println("<h2>");
 	    pr.println("<br>");
 	    pr.println("<br>");
 	    pr.println("<br>");
 	    pr.println("<h1 align = \"center\" class=\"animated bounceInDown\">");
 	    pr.println("<img src=\"/stylesheets/auto1.png\"  height=\"150\" width=\"300\">");
 	    pr.println("<span class=\"particle particle--c\">");
 	    pr.println("</span>");
 	    pr.println("<span class=\"particle particle--a\">");
 	    pr.println("</span>");
 	    pr.println("<span class=\"particle particle--b\">");
 	    pr.println("</span>");
 	    pr.println("</h1>");
 	    pr.println("</h2>");

	     
	    pr.println("<form method=\"get\" action=\"engage\" >" +
	    		"<br />" +
	    		"<br /><h4 align=\"center\">Search<input type='text' name='query' >Geo<input type='text' name='geo' ><br />"
	                + " <br /><input type='submit' value='submit'><input type='reset' value='reset'></h4> </FORM>");
	   
		pr.println("</div>");
	}
}
