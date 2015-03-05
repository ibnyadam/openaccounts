<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<c:set var="root" value="${pageContext.request.contextPath}" />
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>
    	<sitemesh:write property='title' default="Open Accounts"/>
    </title>

    <!-- Bootstrap Core CSS -->
    <link href="${root}/resources/components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${root}/resources/components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="${root}/resources/dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${root}/resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="${root}/resources/components/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${root}/resources/components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
	<sitemesh:write property='head'/>
</head>
<body>
	<div id="wrapper">
		
		<!-- Navigation -->
		<jsp:include page="/WEB-INF/views/templates/navigation.jsp"></jsp:include>
		
		<div id="page-wrapper">
			<sitemesh:write property='body' />
		</div>
	</div>
	<!-- /#wrapper -->
		
	<!-- jQuery -->
    <script src="${root}/resources/components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${root}/resources/components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="${root}/resources/components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript 
    <script src="${root}/resources/components/raphael/raphael-min.js"></script>
    <script src="${root}/resources/components/morrisjs/morris.min.js"></script>
    <script src="${root}/resources/js/morris-data.js"></script>
    -->

    <!-- Custom Theme JavaScript -->
    <script src="${root}/resources/dist/js/sb-admin-2.js"></script>
</body>
</html>