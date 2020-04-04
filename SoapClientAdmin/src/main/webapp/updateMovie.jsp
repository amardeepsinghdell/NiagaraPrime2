<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="theme.css">
    </head>
    <div class="login">
	<h1>Update a Movie</h1>
        <form method="post" action="Display" enctype="multipart/form-data">
      <input type="text" name="id" value="${movie.id}" placeholder="Id" required="required" />
    	<input type="text" name="title" value="${movie.title}" placeholder="Title" required="required" />
        <textarea class="input" name="desc" >${movie.description}</textarea>
       <input type="text" name="prod" placeholder="Producer" required="required" value="${movie.producer}"/>
       <input type="text" name="dir" placeholder="Director" required="required" value="${movie.director}"/>
      <input type="text" name="cat" placeholder="Category" required="required" value="${movie.category}" />
      <input type="text" name="rate" placeholder="Rating" required="required" value="${movie.rating}"/>
      
      
      <p>Please upload a Thumbnail for your Movie</p>
        <div class="form-group">
                            <div class="btn">
                                <span>Choose file</span>
                                <input type="file" accept="image/*" name="thumbnail">
                            </div>
                            <c:if test="${not empty imageError}">
                                <div class="row">
                                    <medium class="text-danger">
                                        ${imageError}
                                    </medium>      
                                </div>
                            </c:if>
                        </div>
                   
                    <c:if test="${not empty uploadedImg}">
                        <div class="form-group">
                            <p><input type="checkbox" class="form-check-input" value="${movie.thumb}" name="prevImg" checked>Use previously uploaded image:</p>          
                            <img src="data:image/jpg;base64,${uploadedImg}" class="img-thumbnail" width="304" height="236"> 
                        </div>
                    </c:if>
               
     <br/>
   <div style="display: inline;" align="center">
       <div style="float: right;">
        <button id="updatemov" name="updatemovie"type="submit" class="btn btn-primary btn-block btn-large">Update Movie</button>
       </div>
      
     </div>
        <br/>
        <br/>
         </form>
<!--          <button type="submit" name="viewlist" value="View List" class="btn btn-primary btn-block btn-large">Back to movie list</button>-->
           <a href="Display" style="color:white;">Back to Movies  </a>
</div>
</div>
</html>
