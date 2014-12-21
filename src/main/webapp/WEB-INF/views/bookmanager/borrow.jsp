
<h2>${title}</h2>
${message}
${request}
<div class="col-sm-12">
	<c:if test="${not empty errorMessage}">
		<div class="alert alert-error">${f:h(errorMessage)}</div>
	</c:if>


	<div class="well">
		<form:form  modelAttribute="fStr"
		action="${pageContext.request.contextPath}/bookmanager/borrow"
		 class="form-inline my-inline">
			<form:input path="bookId" class="form-control" /><br>
			<form:input path="bookName" class="form-control" /><br>
			<form:input path="bookAuthor" class="form-control" /><br>
			<form:input path="bookPublisher" class="form-control" /><br>
			<form:input path="bookIsbn10" class="form-control" /><br>
			<form:input path="bookIsbn13" class="form-control" /><br>
			<input type="submit" value="Search" class="btn btn-default" />
		</form:form>
	</div>
	<a href="${pageContext.request.contextPath}/user/create?form"
			class="btn btn-primary">New User</a> <br>
	<table class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>本id</th>
				<th>本の名前</th>
				<th>著者</th>
				<th>出版社</th>
				<th>ISBN10</th>
				<th>ISBN13</th>
				<th>登録時間</th>
				<th>更新時間</th>
				<th>期間</th>
				<th>おすすめ度</th>
				<th>コメント</th>
				<th>【実行】</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${page.content}">
				<tr>
				
					<td>${f:h(book.bookId)}</td>
					<td>${f:h(book.bookName)}</td>
					<td>${f:h(book.bookAuthor)}</td>
					<td>${f:h(book.bookPublisher)}</td>
					<td>${f:h(book.bookIsbn10)}</td>
					<td>${f:h(book.bookInsrtedAt)}</td>
					<td>${f:h(book.bookUpdatedAt)}</td>
					<td>${f:h(book.bookTerm)}</td>
					<td>${f:h(book.bookStared)}</td>
<%-- 					<td><form:form
							action="${pageContext.request.contextPath}/user"
							class="form-inline">
							<input type="hidden" name="id" value="${f:h(user.id)}" />
							<input type="submit" class="btn btn-default"
								name="redirectToUpdate" value="Update" />
							<input type="submit" class="btn btn-danger"
								name="redirectToDelete" value="Delete" />
						</form:form></td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>
