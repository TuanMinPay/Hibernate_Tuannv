<%--
  Created by IntelliJ IDEA.
  User: conta
  Date: 8/10/2019
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/include/head.jsp"/>
</head>
<body>
    <div class="container">
        <h2>Add Phone</h2>
        <form action="/add" method="POST" id="addPhone">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" id="name" placeholder="iPhone 7 Plus" name="name">
                <span class="nameErr"></span>
            </div>
            <div class="form-group">
                <label for="brand">Brand:</label>
                <select class="form-control" name="brand" id="brand">
                    <option value="Apple" selected>Apple</option>
                    <option value="Samsung">Samsung</option>
                    <option value="Nokia">Nokia</option>
                    <option value="Others">Others</option>
                </select>
            </div>
            <div class="form-group">
                <label for="price">Price:</label>
                <input type="number" class="form-control" id="price" placeholder="8000000" name="price">
                <span class="priceErr"></span>
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <textarea class="form-control" cols="10" rows="8" name="description" id="description"></textarea>
                <span class="desErr"></span>
            </div>
            <button type="reset" class="btn btn-danger">Reset</button>
            <button type="button" class="btn btn-success" id="submitBtn">Submit</button>
        </form>
    </div>
    <jsp:include page="/include/js.jsp"/>

    <script>
        $(document).ready(function () {
            $('#submitBtn').click(function () {
                var name = $('#name').val();
                var nameMsg = $('.nameErr');
                var price = $('#price').val();
                var priceMsg = $('.priceErr');
                var description = $('#description').val();
                var descriptionMsg = $('.desErr');

                if (name == "" || name == null) {
                    nameMsg.text("Name cannot empty!");
                    return;
                } else {
                    nameMsg.text("");
                }
                if (price == "" || price == null) {
                    priceMsg.text("Price cannot empty!");
                    return;
                } else {
                    priceMsg.text("");
                }
                if (description == "" || description == null) {
                    descriptionMsg.text("Description cannot null!");
                    return;
                } else {
                    descriptionMsg.text("");
                }
                $('#addPhone').submit();
            });
        });
    </script>
</body>
</html>
