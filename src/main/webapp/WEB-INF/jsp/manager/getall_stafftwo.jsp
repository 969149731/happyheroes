<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@include file="common/head.jsp"%>  
	<div class="right_col" role="main">
	<div class="clearfix"></div>
	<div class="col-md-12 col-sm-12 col-xs-12">
	                <div class="x_panel">
	                  <div class="x_title row">
	                    <h2>员工信息列表 </h2>
	                    <div class="clearfix"></div>
	                  </div>
					<!-- 按钮 -->
					<div class="row">
					<form class="form-inline" action="getbyparams" method="post">
			                      <span class="row">
			                       <div class="form-group">
								    <label >员工id:</label>
								    <input type="text" class="form-control" id="staffid" name="staffid" >
								  </div>
								  <div class="form-group">
								    <label >员工姓名:</label>
								    <input type="text" class="form-control" id="staffname" name="staffname">
								  </div>
								  <button class="btn btn-primary" type="submit">查询</button>
								  <a href="${pageContext.request.contextPath }/manager/toadd" class="btn btn-primary " role="button">新增</a>
								  </span>
		                    </form>
					</div>
					<div class="row">
	                  <div class="x_content">
	                    <table id="datatable" class="table table-striped table-bordered table-hover">
					    	<tr>
					        	 <th>员工id</th>
					        	 <th>员工姓名</th>
					        	 <th>年龄</th>
								<th>部门编号</th>
					        	 <th>部门名字</th>
					        	 <th>操作</th>
					        </tr>
					        <c:forEach items="${pageInfo.list}" var="staff">
					        	<tr>
					                         <th>${staff.id}</th>
					                         <th>${staff.name}</th>
					                         <th>${staff.age}</th>
									     <th>${staff.dept.id}</th>
					                         <th>${staff.dept.name}</th>



					                         <th>


					                         </th>
					          	</tr>
					         </c:forEach>
	                    </table>
	                  </div>


						<!-- 显示分页信息 -->
						<div class="row">
							<!--分页文字信息  -->
							<div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
								页,总 ${pageInfo.total } 条记录</div>
							<!-- 分页条信息 -->
							<div class="col-md-6">
								<nav aria-label="Page navigation">
								<ul class="pagination">
									<li><a href="${pageContext.request.contextPath }/manager/getall?pn=1">首页</a></li>
									<c:if test="${pageInfo.hasPreviousPage }">
										<li><a href="${pageContext.request.contextPath }/manager/getall?pn=${pageInfo.pageNum-1}"
											aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
										</a></li>
									</c:if>


									<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
										<c:if test="${page_Num == pageInfo.pageNum }">
											<li class="active"><a href="#">${page_Num }</a></li>
										</c:if>
										<c:if test="${page_Num != pageInfo.pageNum }">
											<li><a href="${pageContext.request.contextPath }/manager/getall?pn=${page_Num }">${page_Num }</a></li>
										</c:if>

									</c:forEach>
									<c:if test="${pageInfo.hasNextPage }">
										<li><a href="${pageContext.request.contextPath }/manager/getall?pn=${pageInfo.pageNum+1 }"
											aria-label="Next"> <span aria-hidden="true">&raquo;</span>
										</a></li>
									</c:if>
									<li><a href="${pageContext.request.contextPath }/manager/getall?pn=${pageInfo.pages}">末页</a></li>
								</ul>
								</nav>
							</div>
						</div>

	                </div>
	</div>
</div>
</div>
<%@include file="common/footer.jsp"%>
<script type="text/javascript">
	function del(id) {
		var message=confirm("是否确认要删除?");
		if (message==true) {
			// 确认时做的操作 var
			window.location.href="${pageContext.request.contextPath }/manager/delete?staffid="+id;
			alert("删除成功");
	} else {
// 取消时做的操作
alert("删除失败");
}
}</script>