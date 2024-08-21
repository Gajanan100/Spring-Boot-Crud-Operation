<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
html {
  height: 100%;
}

.login-box {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 400px;
  padding: 40px;
  transform: translate(-50%, -50%);
  background: rgba(0,0,0,.5);
  box-sizing: border-box;
  box-shadow: 0 15px 25px rgba(0,0,0,.6);
  border-radius: 10px;
}

.login-box h2 {
  margin: 0 0 30px;
  padding: 0;
  color: #fff;
  text-align: center;
}

.login-box .user-box {
  position: relative;
}

.login-box .user-box input {
  width: 100%;
  padding: 10px 0;
  font-size: 16px;
  color: #fff;
  margin-bottom: 30px;
  border: none;
  border-bottom: 1px solid #fff;
  outline: none;
  background: transparent;
}
.login-box .user-box label {
  position: absolute;
  top:0;
  left: 0;
  padding: 10px 0;
  font-size: 16px;
  color: #fff;
  pointer-events: none;
  transition: .5s;
}

.login-box .user-box input:focus ~ label,
.login-box .user-box input:valid ~ label {
  top: -20px;
  left: 0;
  color: #03e9f4;
  font-size: 12px;
}

.login-box form a {
  position: relative;
  display: inline-block;
  padding: 10px 20px;
  color: #03e9f4;
  font-size: 16px;
  text-decoration: none;
  text-transform: uppercase;
  overflow: hidden;
  transition: .5s;
  margin-top: 40px;
  letter-spacing: 4px
}

</style>
</head>
<body>
		
		<div class="login-box">
  <h2>Employee From </h2>
  <form action="addnewEmployee">
    <div class="user-box">
      <input type="text" name="emp_name" required="">
      <label>Enter Employee Name</label>
    </div>
    <div class="user-box">
      <input type="text" name="salary" required="">
      <label> Enter Employee Salary</label>
    </div>
			<div class="user-box">
				<input type="text" name="position" required=""> <label>Enter
					Employee Position</label>
			</div>
			<div style="color: green; text-align: center; margin: 0 auto; background: #3A4450;
     padding: 5px;">
    <input style="background: #678CA4; font-size: 14px; padding: 3px; color: white;" type="submit">
    <input style="background: #678CA4; font-size: 14px; padding: 3px; color: white;" type="reset">
    
    </div>
    
  </form>
  
</div>



</body>
</html>