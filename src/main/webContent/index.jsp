<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<c:import url="layout/header.jsp" />
<c:import url="layout/sideshow.jsp" />

<sql:setDataSource var="ds" dataSource="jdbc/TestDB"></sql:setDataSource>
<sql:query dataSource="${ds }" var="result" sql="SELECT * FROM categories"></sql:query>
<div class="container mt-5">
	<div class="row">	
	
		<c:forEach var="cat" items="${result.rows}">
			<div class="col-md-4">
				<div class="card mb-4">
					<div class="card-header">${cat.name}</div>
					<div class="card-body">
						<div class="row justify-content-center">
							<a href="${pageContext.request.contextPath }/ProductController?cat_id=${cat.id}"> <img
								src="${pageContext.request.contextPath }/assets/imgs/${cat.image}"
								class="img-fluid myiconimage" />
							</a>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>
<c:import url="layout/footer.jsp" />