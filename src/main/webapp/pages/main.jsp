<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30 0030
  Time: 下午 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" type="text/javascript"></script>
</head>
<body>
<h3>登录成功</h3>
登录人：${sessionScope.emp.ename}
<c:if test="${sessionScope.emp.etype=='普通员工'}">    <a href="#">修改密码</a><br><hr>
    <h3>餐饮列表</h3>
    <a href="#" onclick="OpenAdd();">添加食品</a>
    <!--添加食品DIV-->
    <div id="addfoot_div" style="display: none">
        <form id="my_foot_fm" action="${pageContext.request.contextPath}/footAction/addFoot" method="post">
            食品名称：<input name="fname"><br>
            食品价格：<input name="fprice"><br>
            <input type="submit" value="添加" onclick="AddFoot();">
            <input type="button" value="取消" onclick="closeFootDiv();">
        </form>
    </div>
    <hr>
    <div id="mydiv" style="width:500px;"></div>
    <!--选中物品div-->
    <div id="onpenfootinfo" style="display: none;padding: 20px;position: absolute;top: 20%;left: 30%; background-color: #F0F0F0">
        <form action="${pageContext.request.contextPath}/footCheckAction/addFootCheck" style="text-align: center">
            <input name="fname2" readonly="readonly" style="text-align: center;font-size:20px;width: 150px;"><br>
            <input name="fprice2" readonly="readonly" style="text-align: center;font-size:20px;width: 150px;"><br>
        <!--输入数量-->
            <input type="button" value="-" onclick="decline();"><!--递减-->
            <input name="fnum" value="1" style="text-align: center;font-size:20px;width: 50px;">
            <input type="button" value="+" onclick="increasing();"><!--递减-->
            <br>
            <input type="submit" value="添加">
            <input type="button" value="取消" onclick="closefootinfo();">
        </form>
    </div><br><br><br><br>

    <a href="#">订单详情</a>
</c:if>
<c:if test="${sessionScope.emp.etype=='管理员'}">
    ,职位： ${sessionScope.emp.etype}    <a href="#">添加员工</a>  <a>查询员工</a><br><hr>


</c:if>
<c:if test="${sessionScope.emp.etype=='经理'}">
    ,职位： ${sessionScope.emp.etype}    <a href="#">领VIP</a><br><hr>


</c:if>
</body>
</html>
<script>
    //打开添加页面
    function OpenAdd(){
        $("#addfoot_div").show();
    }
    //关闭添加页面
    function closeFootDiv(){
        $("#addfoot_div").hide();
    }

    $(function(){
        if(${param.rtype==1}){
            alert("添加成功");
        }
        if(${param.rtype==-1}){
            alert("添加失败");
        }
        onload();
    })

    function onload(){
        $.get("${pageContext.request.contextPath}/footAction/footList","",function(data){
            $.each(data,function(i,v){

                str="<div style='width: 100px;float: left'><a href='#' onclick='getname(this);'>" + v.fname + "<a></div>";
                $("#mydiv").append(str);
            })

        },"json")
    }

    //打开食品详情页面
    function onpenfootinfo(){
        $("#onpenfootinfo").show();
    }
    //关闭食品详情页面
    function closefootinfo(){
        $("#onpenfootinfo").hide();
    }
    //根据名称查询物品详情
    function getname(opt){
         var param = "fname="+$(opt).html()+"";
        onpenfootinfo();
        $.post("${pageContext.request.contextPath}/footAction/findfootByName",param,function (data) {

            $("input[name='fname2']").val(data.fname);
            $("input[name='fprice2']").val(data.fprice);
        })
    }

    //数量递减
    function decline(){
        var param = $("input[name='fnum']").val();
        param--;
        if(param<0){
            $("input[name='fnum']").val(0);
        }else{
            $("input[name='fnum']").val(param);
        }

    }
    //数量递增
    function increasing(){
        var param = $("input[name='fnum']").val();
        param++;
        $("input[name='fnum']").val(param);
    }

    //点击确定获取 当前时间，食物信息，数量






</script>
