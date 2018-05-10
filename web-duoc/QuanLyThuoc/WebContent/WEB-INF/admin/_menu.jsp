<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Insert title here</title>
</head>
<body>
	<div id="sidebar-left" class="span2">
		<div class="nav-collapse sidebar-nav">
			<ul class="nav nav-tabs nav-stacked main-menu">
				<li><a href="#"><i class="icon-bar-chart"></i><span
						class="hidden-tablet"> Home</span></a></li>
				<li><a href="messages.html"><i class="icon-eye-open"></i><span
						class="hidden-tablet"> Quản Lý Nhân Viên</span></a></li>
				<li><a class="dropmenu" href="#"><i
						class="icon-folder-close-alt"></i><span class="hidden-tablet">
							Quản lý Sản Phẩm</span><span class="label label-important"> 2 </span></a>
					<ul>
						<li><a class="submenu" href="${pageContext.request.contextPath}/ManagerCategory?command=load"><i
								class="icon-file-alt"></i><span class="hidden-tablet">
									Quản lý Loại Sản Phẩm</span></a></li>
						<li><a class="submenu" href="${pageContext.request.contextPath}/ManagerProduct"><i
								class="icon-file-alt"></i><span class="hidden-tablet">
									Quản lý Sản Phẩm</span></a></li>
					</ul></li>
				<li><a href="ui.html"><i class="icon-eye-open"></i><span
						class="hidden-tablet"> Quản lý Chức vụ</span></a></li>
				<li><a href="widgets.html"><i class="icon-dashboard"></i><span
						class="hidden-tablet"> Quản Lý tin tức</span></a></li>
				<li><a href="form.html"><i class="icon-picture"></i><span
						class="hidden-tablet"> Quản Lý hình ảnh</span></a></li>
				<li><a href="chart.html"><i class="icon-list-alt"></i><span
						class="hidden-tablet"> Phân quyền quản lý</span></a></li>
				<li><a href="login.html"><i class="icon-lock"></i><span
						class="hidden-tablet"> Login Page</span></a></li>
			</ul>
		</div>
	</div>
</body>
</html>