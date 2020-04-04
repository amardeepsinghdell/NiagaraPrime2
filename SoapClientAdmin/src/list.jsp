<%-- 
    Document   : list
    Created on : Apr 1, 2020, 11:47:29 PM
    Author     : Bunny Gaming
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="theme_1.css">
        <title>Movies</title>
    </head>
    


<div class="made-with-love">
  Made with
  <i>♥</i>
</div>
    
    
  <div class="waveWrapper waveAnimation">
      
  <div class="waveWrapperInner bgTop">
      
    <section>
  <h1>Movie List</h1>
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          <th>Title</th>
          <th>Description</th>
          <th>Producer</th>
          <th>Director</th>
          <th>Category</th>
          <th>Rating</th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
          <c:forEach var="display" items="${movies}">
                            <tr>
                                <th scope="row">${display.title}</th>
                                <td>${display.description}</td>
                                <td>${display.producer}</td>
                                <td>${display.director}</td>
                                <td>${display.category}</td>
                                <td>${display.rating}</td>
                                <td><button class="btn btn-success" type="submit" name="deleteid" value=${display.id} class="btn">Delete</button></td>
                                <td><button class="btn btn-success" type="submit" name="updateid" value=${display.id} class="btn">Update</button></td>
                            </tr>
                        </c:forEach>
                             <button class="btn btn-success" type="submit" name="addnewmov" value="Add Show" class="btn">Add New Movie</button>
      </tbody>
    </table>
  </div>
</section>

    <div class="wave waveTop" style="background-image: url('http://front-end-noobs.com/jecko/img/wave-top.png')"></div>
  </div>
  <div class="waveWrapperInner bgMiddle">
    <div class="wave waveMiddle" style="background-image: url('http://front-end-noobs.com/jecko/img/wave-mid.png')"></div>
  </div>
  <div class="waveWrapperInner bgBottom">
    <div class="wave waveBottom" style="background-image: url('http://front-end-noobs.com/jecko/img/wave-bot.png')"></div>
  </div>
</div>
</html>
