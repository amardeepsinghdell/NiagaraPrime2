<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="theme.css">
    </head>
    <div class="login">
	<h1>Add a Movie</h1>
        <form method="post" action="Display" enctype="multipart/form-data">
      <input type="text" name="id" placeholder="Id" required="required" />
    	<input type="text" name="title" placeholder="Title" required="required" />
        <textarea class="input" name="desc" maxlength="50">Description</textarea>
       <input type="text" name="prod" placeholder="Producer" required="required" />
       <input type="text" name="dir" placeholder="Director" required="required" />
      <input type="text" name="cat" placeholder="Category" required="required" />
      <input type="number" min="1" max="10" name="rate" placeholder="Rating" required="required" />
      
      
      <p>Please upload a Thumbnail for your Movie</p>
        <div class="form-group">
                            <div class="btn">
                                <span>Choose file</span>
                                <input type="file" accept="image/*" name="thumbnail">
                            </div>
                            <c:if test="${not empty imageError}" >
                                <div class="row">
                                    <medium class="text-danger" style='color:red;'>
                                       ${imageError}
                                    </medium>      
                                </div>
                            </c:if>
                        </div>
                    <!--  col-md-6   -->
                
                    <c:if test="${not empty uploadedImg}">
                        <div class="form-group">
<!--                            <p><input type="checkbox" class="form-check-input" value="${movie.thumb}" name="prevImg" checked>Use previously uploaded image:</p>          -->
                     
                        </div>
                    </c:if>
               
     <br/>
   <div style="display: inline;" align="center">
       <div style="float: left;">
        <button id="addmov" name="addmovie"type="submit" class="btn btn-primary btn-block btn-large">Add a Movie</button>
       </div>
       <div style="float: right;">
<!--        <button id="updatemov" name="updatemovie"type="submit" class="btn btn-primary btn-block btn-large">Back to Movies List</button>-->

      
     </div>
        <br/>
        <br/>
         </form>
<!--        <button id="updatemov" name="viewlist"  class="btn btn-primary btn-block btn-large">Back to Movies List</button>-->
        <a href="Display" style="color:white;">Back to Movies  </a>
</div>
</div>
</html>
