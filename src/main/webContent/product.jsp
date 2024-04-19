<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="layout/header.jsp" />

<div class="container">
	<div class="row my-5">
		<div class="col-md-3">
			<div class="card" class="">
				<div class="card-header">Cars</div>
				<div class="card-body">
					<div class="row justify-content-center">
					<img
						src="${pageContext.request.contextPath }/assets/imgs/car icon1.png"
						class="productimage" />
					</div>
				</div>
				<div class="card-footer">
					<div class="row justify-content-between ">
						<span>  $150</span>
						<button class=" btn btn-primary btn-sm">
							<i class="fa fa-shopping-cart"></i>
						</button>
					</div>

				</div>
			</div>
		</div>



	</div>
</div>


<c:import url="layout/footer.jsp" />