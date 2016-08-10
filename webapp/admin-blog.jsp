<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
	<head>

		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Mainô Blog - Crie seu Blog</title>
		
		<link rel="stylesheet" href="assets/css/demo.css">
		<link rel="stylesheet" href="assets/css/form-register.css">
		
		<!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">
		
		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
	</head>

	<body>
	
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1><strong>Mainô Blog</strong> - Adminisração</h1>
						<div class="description">
							<p>Olá ${sessionScope.blog.usuario.nome}</p>
						</div>
					</div>
                 </div>
                 <div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<div class="description">
							<h3>Blog: <strong>${sessionScope.blog.nome}</strong></h3>
							<p>${sessionScope.blog.descricao}</p>
						</div>
					</div>
                 </div>
                 <div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>O que deseja fazer?</h3>
							</div>
							<div class="form-top-right">
								<i class="fa fa-hand-o-down"></i>
							</div>
							<div>
								<p>
									<a href="#">Escrever um post</a>
								</p>
								<p>
									<a href="#">Visualizar Blog</a>
								</p>
							</div>
						</div>
					</div>
                 </div>
			</div>
		</div>
	</div>

</body>

</html>