<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<!-- start: Header -->

	<div class="container-fluid-full">
		<div class="row-fluid">

			<!-- start: Main Menu -->
			<jsp:include page="_menu.jsp"></jsp:include>
			<!-- end: Main Menu -->
			<!-- start: Content -->
			<div id="content" class="span10">


				<ul class="breadcrumb">
					<li><i class="icon-home"></i> <a href="index.html">Home</a> <i
						class="icon-angle-right"></i></li>
					<li><a href="#">Manager Product</a></li>
				</ul>
				<p>
					<a
						href="${pageContext.request.contextPath}/ManagerCategory?command=insert">Tạo
						mới Loại Sản Phẩm</a>
				</p>
				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header" data-original-title>
							<h2>
								<i class="halflings-icon white user"></i><span class="break"></span>Danh
								Sách Loại sản Phẩm
							</h2>
							<div class="box-icon">
								<a href="#" class="btn-setting"><i
									class="halflings-icon white wrench"></i></a> <a href="#"
									class="btn-minimize"><i
									class="halflings-icon white chevron-up"></i></a> <a href="#"
									class="btn-close"><i class="halflings-icon white remove"></i></a>
							</div>
						</div>
						<div class="box-content">
							<div class="control-group">
								<div class="controls" style="color: red; margin-left: 400px">
									${error }</div>
							</div>
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable">
								<thead>
									<tr>
										<th>Tên Loại Sản Phẩm</th>
										<th>Actions</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${lstLoaiSP}" var="lsp">
										<tr>
											<td>${lsp.tenLoai}</td>
											<td class="center"><a class="btn btn-success" href="#">
													<i class="halflings-icon white zoom-in"></i>
											</a> <a class="btn btn-info" href="${pageContext.request.contextPath}/ManagerCategory?command=edit&maloai=${lsp.maLoai}"> <i
													class="halflings-icon white edit"></i>
											</a> <a class="btn btn-danger"
												href="${pageContext.request.contextPath}/ManagerCategory?command=delete&maloai=${lsp.maLoai}">
													<i class="halflings-icon white trash"></i>
											</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<!--/span-->
				</div>
				<!--/row-->
			</div>
			<!--/.fluid-container-->

			<!-- end: Content -->
		</div>
		<!--/#content.span10-->
	</div>
	<!--/fluid-row-->

	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a> <a href="#"
				class="btn btn-primary">Save changes</a>
		</div>
	</div>
	<div class="common-modal modal fade" id="common-Modal1" tabindex="-1"
		role="dialog" aria-hidden="true">
		<div class="modal-content">
			<ul class="list-inline item-details">
				<li><a href="http://themifycloud.com">Admin templates</a></li>
				<li><a href="http://themescloud.org">Bootstrap themes</a></li>
			</ul>
		</div>
	</div>
	<div class="clearfix"></div>

	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>