<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhj
  Date: 2021/2/2
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF8">
    <title>字典信息</title>
    <script src="${path}/static/jquery/jquery-1.9.1.js"></script>

</head>
<body>
  <table>
      <tr>
          <th colspan="4">字典管理</th>
      </tr>
      <tr>
         <th>类别名</th>
         <th>字典名</th>
         <th>字典值</th>
         <th>操作【<a href="${path}/dicts/add">新增</a> 】</th>
      </tr>
      <c:forEach items="${dicts}" var="dict">
          <tr id="dict-${dict.id}">
              <td>${dict.code}</td>
              <td>${dict.name}</td>
              <td>${dict.value}</td>
              <td>
                【<a href="${path}/dicts/add?id=${dict.id}">编辑</a> 】
                【<a href="javascript:;" onclick="deleteById(${dict.id},'${dict.name}')">删除</a>】
              </td>
          </tr>
      </c:forEach>
  </table>
<script>
    function deleteById(id,label) {
        var r=confirm('确定要删除"'+label+'"吗？');
        if(r){
            $.ajax({
                url:'${path}/dicts/delete',
                data:{id:id},
                dataType:'json',
                type:'POST',
                success:function (data) {
                    if(data.success){
                        $('#dict-'+id).remove();
                    }else{
                        alert(data.msg);
                    }
                }
            });
        }
    }
</script>

</body>
</html>
