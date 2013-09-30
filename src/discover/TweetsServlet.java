package discover;
/* Main Class looks at the menu_choice options for Buzz or Tweets
 * and gets the results
 */
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
import winterwell.*;
import winterwell.jtwitter.OAuthSignpostClient;
import winterwell.jtwitter.Status;
import winterwell.jtwitter.Twitter;
import winterwell.jtwitter.Twitter_Users;
import winterwell.jtwitter.User;

@SuppressWarnings("serial")
public class TweetsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		 	resp.setContentType("text/html");
		 	PrintWriter pr = resp.getWriter();
	 	    pr.println( "<link rel=\"stylesheet\"  type=\"text/css\"  href=\"/stylesheets/main.css\"  media=\"screen\" />");
	 	    pr.println("<html>");
	 	    pr.println("<body>");
	 	    pr.println("<div id=\"page\">");
	 	    pr.println("<h2>");
	 	    pr.println("Users");
	 	    pr.println("</h2>");
	 	    String query1 = req.getParameter("query");
	 	    String key = " ";
	 	    String[] value = null;

	 	   /*
	 	  OAuthSignpostClient oauthClient = new OAuthSignpostClient("SjkIUBgtmYhASQWCjFs3w", 
	 			 "cEfk57JD1Vr797bxpvQiwkwgeXODdN82t5iyq9Rs", "oob");
	 	 oauthClient.authorizeDesktop();
	 	String v = oauthClient.askUser("Please enter the verification PIN from Twitter"); 
	 	oauthClient.setAuthorizationCode(v); 
  
	 	String[] accessToken = oauthClient.getAccessToken(); 	 
	 	  
	 	String ACCESS_TOKEN=accessToken[0]; 
	 	String ACCESS_KEY=accessToken[1];
	 	Twitter twitterUser = new 
	 			Twitter("mdharmal",oauthClient); 
	 			*/
	 	
	 	OAuthSignpostClient newOauthClient = new 
	 			OAuthSignpostClient("SjkIUBgtmYhASQWCjFs3w","cEfk57JD1Vr797bxpvQiwkwgeXODdN82t5iyq9Rs", 
	 					"1911351822-NJGoEBKkvplO8bPANUkrOKYFSRkUo0NrnHpmx4b", "k3pWNxjRZPjYVcF8FV9TWe1PSTRiQuwSGXL29ZkPg");//the last two are from above 

	 			Twitter twitter = new Twitter("mdharmal",newOauthClient); 
	 			List<Status> tweets = twitter.search(query1);
	 			int count =0;
	 			for (Status tweet : tweets) {
	 				count++;
	 				if(count <=4){
	 				pr.println("<br>");
			        User a = tweet.getUser();
			        pr.println("<img src="+a.getProfileImageUrl()+">");
			        pr.println("<br>");
			        pr.println("User id :" +a);
	 				pr.println("<br>");
			        pr.println("Tweet  : = ");
	 				pr.println(tweet.getDisplayText());
	 				pr.println();
	 				  pr.println( 
	 						  	"<input type='submit' value='Engage/Tweet/CreateLeads'> " );
	 				   
	 				}else{
	 					break;
	 				}
	 			}
	 	
		     
	        	 pr.println("</div>");	 
	        	 
}}