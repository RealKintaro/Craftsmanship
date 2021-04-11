<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>sign up</title>
   <!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords"
		content="Working Signin form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<!-- //Meta tag Keywords -->
	<link href="//fonts.googleapis.com/css2?family=Karla:wght@400;700&display=swap" rel="stylesheet">
	<!--/Style-CSS -->
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--//Style-CSS -->
</head>
<body>
     <!-- form section start -->
	 <section class="w3l-workinghny-form">
        <!-- /form -->
        <div class="workinghny-form-grid">
            <div class="wrapper">
                <div class="logo">
                   
                    <!-- if logo is image enable this   
                        <a class="brand-logo" href="#index.html">
                            <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
                        </a> -->
                </div>
                <div class="workinghny-block-grid">
                    <div class="workinghny-left-img align-end">
                        <center><h1>Welcome to the signup</h1></center>
                        <img src="images/2.png" class="img-responsive" alt="img" />
                    </div>
                    <div class="form-right-inf">
                        <div class="login-form-content">
                            <form action="signin" class="signin-form" method="post">
                                <div class="one-frm">
									<input type="text" name="fn"  placeholder="first name" required="">
								</div>
                                <div class="one-frm">
									<input type="text" name="ln"  placeholder="last name" required="">
								</div>
								<div class="one-frm">
									<input type="email" name="username"  placeholder="username" required="">
								</div>
								<div class="one-frm">
									<input type="password" name="password"  placeholder="password" required="">
								</div>
                                <div class="one-frm">
									<input type="password" name="cpassword"  placeholder="confirm password" required="">
								</div>
                                <button class="btn btn-style mt-3">Sign up </button>
                                <p class="already">already have an account? <a href="index.jsp">Sign in</a></p>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //form -->
        <!-- copyright-->
        <div class="copyright text-center">
            <div class="wrapper">
                <p class="copy-footer-29">© 2021 develop by jee team </p>
            </div>
        </div>
        <!-- //copyright-->
    </section>
    <!-- //form section start -->
</body>
</html>