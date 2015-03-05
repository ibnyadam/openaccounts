<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Please Sign In</h3>
				</div>
				<div class="panel-body">
					<c:if test="${not empty error}">
						<div class="errorblock">Your login attempt was not
							successful, try again. Caused :
							${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>
					</c:if>
					<c:if test="${not empty error}">
						<div class="error">${error}</div>
					</c:if>
					<c:if test="${not empty msg}">
						<div class="msg">${msg}</div>
					</c:if>

					<form role="form" name="f"
						action="<c:url value='j_spring_security_check'/>" method="POST">
						<fieldset>
							<div class="form-group">
								<input class="form-control" placeholder="E-mail"
									name="j_username" type="email" autofocus>
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password"
									name="j_password" type="password" value="">
							</div>
							<div class="checkbox">
								<label> <input name="remember" type="checkbox"
									value="Remember Me">Remember Me
								</label>
							</div>
							<!-- Change this to a button or input when using this as a form -->
							<input name="Submit" type="submit" value="Submit"
								class="btn btn-lg btn-success btn-block">
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>