<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 2 | Starter</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!--Theme style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/dist/css/skins/skin-blue.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]><!--

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    -->
    <![endif]-->
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <header class="main-header">

        <!-- Logo -->
        <a href="index.jsp" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>E</b>car</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Admin</b>Ecar</span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">

            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->

                    <!-- /.messages-menu -->


                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                            <img src="${pageContext.request.contextPath }/admin/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">Alexander Pierce</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="${pageContext.request.contextPath }/admin/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    使用者姓名
                                    <small>注册日期</small>
                                </p>
                            </li>

                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">设置</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">登出</a>
                                </div>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">

        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">

            <!-- Sidebar user panel (optional) -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="${pageContext.request.contextPath }/admin/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>使用者姓名</p>
                    <!-- Status -->
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>


            <!-- Sidebar Menu -->
            <ul class="sidebar-menu">
                <li class="header">HEADER</li>
                <!-- Optionally, you can add icons to the links -->
                <li><a href="#"><i class="fa fa-link"></i> <span>会员管理</span></a></li>
                <li><a href="#"><i class="fa fa-link"></i> <span>订单管理</span></a></li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-link"></i> <span>车辆管理</span> <i class="fa fa-angle-left pull-right"></i></a>
                    <ul class="treeview-menu">
                        <li><a href="car_list.html">车辆列表</a></li>
                        <li><a href="car_add.html">车辆增加</a></li>
                    </ul>
                </li>
                <!--品牌管理-->
                <li class="active"><a href="${pageContext.request.contextPath }/admin/model/home"><i class="fa fa-link"></i> <span>品牌管理</span></a></li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                车辆品牌管理
                <small>车辆品牌以及型号管理</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="/admin/index.jsp"><i class="fa fa-dashboard"></i> 主页</a></li>
                <li class="active">品牌管理</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="box">
                <div class="box-header">
                    <div class="row">
                        <div class="col-md-2">
                            <div class="form-group">
                                <h3 class="box-title">品牌名:</h3>
                                <select class="form-control" onchange="changeBrand(this)">
                                    <option value="">请选择</option>
                                    <c:forEach items="${requestScope.brandList}" var="ecarModel">
                                        <option value="${ecarModel.brand}">${ecarModel.brand}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </div>

                </div>

            </div>
            <!--弹出框(增加)-->

            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" onclick="closeModal()" class="close" data-dismiss="modal"
                                    aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">车辆型号增加</h4>
                        </div>
                        <div class="modal-body">
                            <!--正文-->
                            <form id="modalForm">
                                <div class="form-group">
                                    <label>品牌</label>
                                    <input type="hidden" name="modelId" id="modalId">
                                    <input type="text" id="modalBrand" class="form-control" name="brand"
                                           placeholder="品牌">
                                    <label>年份</label>
                                    <input type="text" class="form-control" id="modalYear" name="year" placeholder="年份">
                                    <label>车辆型号</label>
                                    <input type="text" class="form-control" id="modalModel" name="model"
                                           placeholder="车辆型号">

                                </div>
                                <div class="callout callout-danger" id="faild" hidden>
                                </div>
                                <div class="callout callout-success" hidden>
                                    <p>添加成功</p>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <button type="button" id="btn1" class="btn btn-primary" onclick="addModel()">确定</button>
                            <button type="button" id="btn2" class="btn btn-primary" onclick="updateModel()">确定</button>
                        </div>
                    </div>
                </div>
            </div>

            <%--弹出框(编辑)
            <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" onclick="closeModal()" class="close" data-dismiss="modal"
                                    aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" >车辆型号编辑</h4>
                        </div>
                        <div class="modal-body">
                            <!--正文-->
                            <form id="modalForm1">
                                <div class="form-group">
                                    <label>品牌</label>
                                    <input type="text" id="modalBrand" class="form-control" name="brand"
                                           placeholder="品牌">
                                    <label>年份</label>
                                    <input type="text" class="form-control" id="modalYear" name="year" placeholder="年份">
                                    <label>车辆型号</label>
                                    <input type="text" class="form-control" id="modalModel" name="model"
                                           placeholder="车辆型号">

                                </div>
                                <div class="callout callout-success" hidden>
                                    <h4>成功</h4>

                                    <p>添加成功</p>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <button type="button" class="btn btn-primary" onclick="addModel()">确定</button>
                        </div>
                    </div>
                </div>
            </div>--%>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
            Anything you want
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2015 <a href="#">Company</a>.</strong> All rights reserved.
    </footer>

    <!-- Control Sidebar -->

</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.2.0 -->
<script src="${pageContext.request.contextPath }/admin/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="${pageContext.request.contextPath }/admin/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath }/admin/dist/js/app.min.js"></script>

<script>

    function changeBrand(o) {
        //可以用json方式,但是操作太复杂
        var value = $(o).find("option:selected").val();
        if ($.trim(value) == "") {
            //alert("asdassda");
            return;
        }

        var url = "${pageContext.request.contextPath }/admin/model/list.do"
        $.post(url, {"brand": value}, function (data) {
            var header = $(".box-header");
            //先删除原来存在,不然重复叠加
            header.next(".box-body").remove();
            header.after(data);
        });


    };


    function toAddModel() {
        //按钮2隐藏,按钮1出现
        $("#btn2").hide();
        $("#btn1").show();
        $("#myModalLabel").text("增加车型");

        var value = $("select").find("option:selected").val();
        $("#modalBrand").val(value);
        $("#myModal").modal();
    }

    function addModel() {


        var strData = $("#modalForm").serialize();
        // alert(data);
        var url = "${pageContext.request.contextPath }/admin/model/add.do";
        $.post(url, strData, function (data) {
            //alert(data.resultCode);
            if (data.resultCode == "1") {
                $("#modalForm div:first-child").hide();
                var $p=$("<p>添加成功</p>");
                $("#modalForm div:last-child").append($p).show();
                $(".modal-footer").hide();
                //刷新当前数据
                $select=$("select");
                changeBrand($select);


            }else{
                var $p=$("<p></p>").text(data.errDesc);
                $("#faild").append($p);
            }

        }, "json");
        /*var json={
         "brand":"Audi",
         "model":"x6",
         "year":2009
         };*/
        /*$.ajax({
         url: url,
         cache: false,
         contentType:"application/json; charset=utf-8",
         data:json,
         type:"post",
         success: function(data){
         //$("#results").append(html);
         alert(data);
         }
         });*/

    }

    function closeModal() {
        $("#modalForm div:first-child").show();
        $("#modalForm div:last-child").hide();
        $(".modal-footer").show();
        $("#modalYear").val('');
        $("#modalModel").val('');
        $("#modalId").val('');

        $("#modalForm div:last-child").empty();
        $("#faild").empty();
    }

    function editModel(modelId) {
        $("#myModalLabel").text("更新车型");
        //按钮2隐藏,按钮1出现
        $("#btn2").show();
        $("#btn1").hide();


        var url = "${pageContext.request.contextPath }/admin/model/toEdit.do";
        $.post(url,
                {
                    "modelId": modelId
                },
                function (data) {
                    $("#myModal").modal();
                    if(data.resultCode=="1"){
                        $("#modalBrand").val(data.result.brand);
                        $("#modalYear").val(data.result.year);
                        $("#modalModel").val(data.result.model);
                        $("#modalId").val(data.result.modelId);

                        $select=$("select");
                        changeBrand($select);
                    }else{
                        var $p=$("<p></p>").text(data.errDesc);
                        $("#faild").append($p);
                    }
                },
                "json"
        )
    }

    function updateModel() {
        var strData = $("#modalForm").serialize();
        // alert(data);
        var url = "${pageContext.request.contextPath }/admin/model/update.do";
        $.post(url, strData, function (data) {
            //alert(data.resultCode);
            if (data.resultCode == "1") {
                $("#modalForm div:first-child").hide();
                var $p=$("<p>更新成功</p>");
                $("#modalForm div:last-child").append($p).show();
                $(".modal-footer").hide();


            }

        }, "json")
    }
    
    function deleteModel(modelId) {
c
        var c=confirm("确定删除?");
        if(c==true){
            var url="${pageContext.request.contextPath }/admin/model/delete.do";
            $.post(url,
                    {
                        "modelId": modelId
                    },
                    function (data) {

                        if(data.resultCode=="1"){
                            alert("删除成功!");
                            $select=$("select");
                            changeBrand($select);

                        }else{
                            alert(data.errDesc);
                        }
                    },
                    "json"
            )
        }
    }


</script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. Slimscroll is required when using the
     fixed layout. -->
</body>
</html>
