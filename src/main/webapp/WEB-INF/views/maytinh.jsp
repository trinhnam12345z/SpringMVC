<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/5/2021
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy tính</title>
</head>
<body>
    <h1>TRỊNH NAM</h1>

    <form action="/convert" method="POST">
        <label >Phep tinh :</label>
        <select name="pheptinh" style="width: 100px;" id="">
            <option value="+"> + </option>
            <option value="-"> - </option>
            <option value="*"> * </option>
            <option value="/"> / </option>
        </select><br>
        <label >Number 1 :</label><br>
        <input value="${number1}" name="number1" ><br>
        <label >Number 2 :</label><br>
        <input value="${number2}" name="number2" ><br>
        <label >Result :</label><br>
        <input value="${result}" name="result" ><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
