<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<meta name="description" content="">
<meta name="author" content="">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/carousel.css"
	rel="stylesheet">

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/css/bootstrap.css"></script>

<title>Insert title here</title>
</head>
<body>

	<!-- header -->
	<header>
		<%@ include file="../headerBar.jsp"%>
	</header>

	<!-- content -->
	<div class="container marketing">
		<!-- Body -->
		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-7 col-md-push-5">
				<h3 class="featurette-heading">BIM</h3>
				<p class="lead">Donec ullamcorper nulla non metus auctor
					fringilla. Vestibulum id ligula porta felis euismod semper.
					Praesent commodo cursus magna, vel scelerisque nisl consectetur.
					Fusce dapibus, tellus ac cursus commodo.</p>
				<%--<p>
					<button type="button" class="btn btn-primary">상세보기</button>
				</p> --%>
			</div>
			<div class="col-md-5 col-md-pull-7">
				<img
					src="${pageContext.request.contextPath}/resources/image/BIM-Image-Copy-1.jpg"
					class="featurette-image img-responsive center-block"
					data-src="holder.js/350x214/auto" alt="Generic placeholder image">
			</div>
		</div>

		<hr class="featurette-divider">
		<div class="row featurette">
			<div class="col-md-7">
				<h3 class="featurette-heading">
					<span class="text-muted">도시 설계 : IOT</span>
				</h3>
				<p class="lead">Donec ullamcorper nulla non metus auctor
					fringilla. Vestibulum id ligula porta felis euismod semper.
					Praesent commodo cursus magna, vel scelerisque nisl consectetur.
					Fusce dapibus, tellus ac cursus commodo.</p>
				<%--<p>
					<button type="button" class="btn btn-primary">주요 실적</button>
				</p>--%>
			</div>
			<div class="col-md-5">
				<img
					src="${pageContext.request.contextPath}/resources/image/city-4317139_1920.jpg"
					class="featurette-image img-responsive center-block"
					data-src="holder.js/500x500/auto" alt="Generic placeholder image">
			</div>
		</div>

		<hr class="featurette-divider">
		<!-- FOOTER -->
		<footer>
			<p><%@ include file="../footer.jsp"%></p>
		</footer>
	</div>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<script src="../../assets/js/vendor/holder.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>