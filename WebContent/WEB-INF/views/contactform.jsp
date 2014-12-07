<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Hindusthan Blood Bank</title>
<meta name="keywords" content="Blood, Blood bank" />

<link href="../css/templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_wrapper">
	<div id="templatemo_header">
    
        <div id="site_title">
            <a href="#" target="_parent"><img src="../images/templatemo_logo.png" alt="logo" id="site_logo"/></a>
        </div> <!-- end of site_title -->
        
        <div id="templatemo_menu">
            <ul>
                <li><a href="/BloodBank/index.jsp">&nbsp;<br>Home&nbsp;&nbsp;<br>&nbsp;</a></li>
                <li><a href="registrationform.html" target="_parent">Donor <br>Registration</br></a></li>
              <li><a href="bloodrequestform.html">Blood <br>Request Form</a></li>
                <li><a href="hospitalrequestform.html">Hospital <br>Request Form</a>
                <li><a href="contactform.html">&nbsp;<br>&nbsp;Contact&nbsp;<br>&nbsp;</a></li>
            </ul>    	
	    </div> <!-- end of templatemo_menu -->
    
    </div> <!-- end of header -->
    
    <div id="templatemo_main">
    	
        <div id="templatemo_content">
			
            <div class="content_box">
            	
          </div>
            
            <div class="content_box">
                        	<h3>Contact US </h3>
            <form:form method="Post" action="contactform.html"
	commandName="contact">
	<table>
		<tr>
			<td>User Name :<FONT color="red"><form:errors
				path="userName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userName" /></td>
		</tr>

		<tr>
			<td>Email Address :<FONT color="red"><form:errors
				path="emailAddress" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="emailAddress" /></td>
		</tr>
		
		<tr>
			<td>Phone Number:<FONT color="red"><form:errors
				path="phoneNumber" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="phoneNumber" /></td>
		</tr>
        
		<tr>
			<td>Comments :<FONT color="red"><form:errors
				path="comments" /></FONT></td>
		</tr>
		<tr>
			<td><form:textarea path="comments" cols="40" rows="10" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
				          </div>
            
          <div class="content_box">
           	
            <div class="cleaner"></div>
          </div>
    	
                <div class="cleaner"></div>
    
        </div> <!-- end of content -->
        
        <div id="templatemo_sidebar">
        
        	<div class="sidebar_box_woframe">
        	    <a href="#" class="icon_link"><img src="../images/email.png" alt="contact" /></a>
                <a href="#" class="icon_link"><img src="../images/rss.png" alt="contact" /></a>
                <a href="#" class="icon_link"><img src="../images/twitter.png" alt="contact" /></a>
                <div class="cleaner"></div>
			</div>
            
            
            <div class="sidebar_box"><div class="sidebar_box_top"></div>
            	
                <div class="sidebar_box_content">
                    <h3>Popular Posts</h3>
                    <ul id="popular_post_box">
                        <li>
                            <span class="date">25 Dec 2013</span>
                            <span class="title"><a href="#">Sreekanth C</a></span>
                            <p align="justify">I have donated blood more than seven times and have'nt had any problems due to donation.</p>
                         </li>
                         <li>
                            <span class="date">18 Dec 2013</span>
                            <span class="title"><a href="#">Manish Bhartia</a></span>
                            <p align="justify">I have donated blood on many occasions and believe me while donating I always feel pride from inside, a feeling of saving someone's life is beyond anything else. We all should experiance such feelings in life..........</p>
                         </li>
                         <li class="last">
                            <span class="date">14 Dec 2013</span>
                            <span class="title"><a href="#">Anil Reddy</a></span>
                            <p align="justify">I brought awareness of blood donation among my friends and made two others regular donors and they felt very happy participating in social activities. I think more publicity is required in rural areas to bring awareness among the donors. My experience has been Nice.</p></li>
                    </ul>
                </div>
                
                <div class="cleaner"></div>
			<div class="sidebar_box_bottom"></div>                    
            </div>
            
            <div class="sidebar_box"><div class="sidebar_box_top"></div>
            	<div class="sidebar_box_content">
                   
                   <h3>Testimonials</h3>
                   <p align="justify">Using internet to save lives (News Today)
Hindusthan group launched a non-profit social service initiative Hindusthan Blood Bank by organising 'save a life' blood donation camp at Umpathy Arangam, here yesterday. The donors throughout the country .</p>
                    
                  <cite>News  - <span>News Today</span></cite>
                   
                    <div class="cleaner"></div>
                </div>
            	<div class="sidebar_box_bottom"></div>                    
            </div>

            <center>
            
	            <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
    	    <a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/../images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
            
            </center>
                        
            <div class="cleaner"></div>
        </div> <!-- end of sidebar -->
    
    	<div class="cleaner"></div>
    </div> <!-- end of main -->
    
     <div id="templatemo_footer">

        Copyright © 2013 <a href="#">Hindusthan Blood Bank</a> | 
        <a href="xstreamsolutions.co.cu" target="_parent">Website Templates</a> by <a href="xstreamsolutions.co.cu" target="_parent">XStream Solutions</a>     
    </div> <!-- end of templatemo_footer -->
    
</div> <!-- end of warpper -->
</body>
</html>
