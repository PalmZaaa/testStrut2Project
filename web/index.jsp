<%-- 
    Document   : index
    Created on : May 25, 2017, 3:52:08 PM
    Author     : PalmZaaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
</head>
<body>
    <div>
        <form action="hello" method="POST">
           <label for="name">Please enter your name</label><br/>
           <input type="text" name="name"/>
           <input type="submit" value="Say Hello"/>
        </form>
    </div>
    
    <div>
        <form action="upload" method="POST" enctype="multipart/form-data">
          <label for="name">Please choose file</label><br/>
          <input type="file" name="myFile"/>
          <input type="submit" value="Upload"/>
        </form>
    </div>
</body>
</html>
