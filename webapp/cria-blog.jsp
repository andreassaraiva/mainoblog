<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>

		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Main� Blog - Crie seu Blog</title>
		
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
						<h1><strong>Main� Blog</strong> Cadastro</h1>
						<div class="description">
							<p>
								Crie o seu blog!!
							</p>
						</div>
					</div>
                 </div>
				 <div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>Cadastre-se</h3>
								<p>Preencha os campos abaixo:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-pencil"></i>
							</div>
						</div>
						 <div class="form-bottom">
							<form role="form" action="blog?action=CriaBlog" method="post" class="login-form">
								<p>Dados Pessoais:</p>
								<div class="form-group">
		                    		<label class="sr-only" for="email">E-mail</label>
		                        	<input type="email" name="email" placeholder="E-mail (Login)" class="form-username form-control" id="email" required>
		                        </div>
		                        <div class="form-group">
		                        	<label class="sr-only" for="senha">Senha</label>
		                        	<input type="password" name="senha" placeholder="Senha" class="form-password form-control" id="senha" required>
		                        </div>
								<div class="form-group">
		                    		<label class="sr-only" for="nome">Nome Completo</label>
		                        	<input type="text" name="nome" placeholder="Nome Completo" class="form-username form-control" id="nome" required>
		                        </div>
		                        <p>Informa��es do Blog:</p>
		                        <div class="form-group">
		                    		<label class="sr-only" for="nome_blog">Nome do Blog</label>
		                        	<input type="text" name="nome_blog" placeholder="Nome do Blog" class="form-username form-control" id="nome_blog" required>
		                        </div>
		                        <div class="form-group">
		                    		<label class="sr-only" for="desc_blog">Descri��o do Blog</label>
		                        	<textarea name="desc_blog" placeholder="Descri��o do Blog" class="form-username form-control" id="desc_blog" required></textarea>
		                        </div>
								<label class="form-checkbox">
									<input type="checkbox" name="checkbox" checked required>
									<span>Eu aceito os <a href="#">Termos e Condi��es</a></span>
								</label>
								<button type="submit" class="btn">Criar Blog</button>
							</form>
						 </div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>
