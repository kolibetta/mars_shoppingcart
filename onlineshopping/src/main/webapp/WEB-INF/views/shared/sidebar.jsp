          <h1 class="my-4">Shop Name</h1>
          <div class="list-group">
          <c:forEach items="${categories}" var="category">
          	<a href="${contextRoot}/show/category/${category.cat_id}/products" id="a_${category.cat_name}" class="list-group-item">${category.cat_name}</a>
          </c:forEach>
          </div>