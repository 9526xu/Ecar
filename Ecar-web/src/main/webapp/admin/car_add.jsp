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
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/font-awesome-4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/ionicons-2.0.1/css/ionicons.min.css">
    <!--Theme style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/dist/css/skins/skin-blue.min.css">
    <!--html5编辑器-->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/admin/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!--webupload css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/webuploader-0.1.5/webuploader.css">
    <!--demo-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/picUpload/demo.css">

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
                            <img src="${pageContext.request.contextPath }/admin/dist/img/user2-160x160.jpg"
                                 class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">${user.userName}</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="${pageContext.request.contextPath }/admin/dist/img/user2-160x160.jpg"
                                     class="img-circle" alt="User Image">

                                <p>
                                    ${user.userName}
                                    <small>注册日期</small>
                                </p>
                            </li>

                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">设置</a>
                                </div>
                                <div class="pull-right">
                                    <a href="${pageContext.request.contextPath }/admin/common/adminLogOut" class="btn btn-default btn-flat">登出</a>
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
                    <img src="${pageContext.request.contextPath }/admin/dist/img/user2-160x160.jpg" class="img-circle"
                         alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>${user.userName}</p>
                    <!-- Status -->
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>


            <!-- Sidebar Menu -->
            <ul class="sidebar-menu">
                <li class="header">HEADER</li>
                <!-- Optionally, you can add icons to the links -->
                <li class="active"><a href="#"><i class="fa fa-link"></i> <span>会员管理</span></a></li>
                <li><a href="#"><i class="fa fa-link"></i> <span>订单管理</span></a></li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-link"></i> <span>车辆管理</span> <i class="fa fa-angle-left pull-right"></i></a>
                    <ul class="treeview-menu">
                        <li><a href="${pageContext.request.contextPath }/admin/carInfo/listHome.do">车辆列表</a></li>
                        <li><a href="${pageContext.request.contextPath }/admin/carInfo/addHomde.do">车辆增加</a></li>
                    </ul>
                </li>
                <!--品牌管理-->
                <li><a href="${pageContext.request.contextPath }/admin/model/home"><i class="fa fa-link"></i>
                    <span>品牌管理</span></a></li>
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
                车辆增加
                <small>车辆增加</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 主页</a></li>
                <li class="active">车辆增加</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <!--用户信息栏-->
            <div class="box box-default">
                <div class="box-header with-border">
                    <h3 class="box-title">用户信息,请先输入用户手机号码</h3>
                    <div class="box-tools pull-right">
                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i
                                class="fa fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.box-header -->

                <div class="box-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="mobile">手机号</label>
                                <input type="text" class="form-control" id="mobile" placeholder="用户手机号">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="userName">用户姓名</label>
                                <input type="text" class="form-control" id="userName" placeholder="输入用户登录名" disabled>
                            </div>
                        </div>

                    </div>


                </div>
                <!-- /.box-body -->

                <div class="box-footer">
                    <button type="button" onclick="findUser()" id="userBtn" class="btn btn-primary">确定</button>
                </div>


            </div>
            <!--车辆信息栏-->
            <div class="box box-default">
                <div class="box-header with-border">
                    <h3 class="box-title">车辆信息</h3>
                    <div class="box-tools pull-right">
                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i
                                class="fa fa-minus"></i></button>
                    </div>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form role="form" id="carForm" method="post" action="${pageContext.request.contextPath }/admin/carInfo/add.do">
                    <%--车辆拥有者id--%>
                    <input type="hidden" name="ownerId" id="owner">
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-12">
                                <label>车辆品牌</label>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <select class="form-control" name="brand" onchange="changeBrand(this)">
                                        <option value="">请选择</option>
                                        <c:forEach items="${modelList}" var="brand">
                                            <option value="${brand.brand}">${brand.brand}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <select class="form-control" name="model" id="modelSelect">
                                        <option value="">请选择</option>

                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">

                                <div class="form-group">

                                    <label>车辆价格</label>
                                    <div class="input-group">
                                        <span class="input-group-addon">¥</span>
                                        <input type="number" name="amount" class="form-control">
                                        <span class="input-group-addon">.00</span>
                                    </div>

                                    <label>过户次数</label>
                                    <input type="number" class="form-control" name="transferNum" placeholder="过户次数">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>车辆颜色</label>
                                    <input type="text" class="form-control" name="color"
                                           placeholder="车辆颜色">
                                    <label>车龄</label>
                                    <input type="number" class="form-control" name="age" placeholder="车龄">
                                </div>
                            </div>


                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <label>车源地</label>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">


                                    <select class="form-control" name="province" id="provinceSelect" onchange="changeProvince(this)">
                                        <option>请选择</option>
                                        <c:forEach items="${provinceList}" var="province">
                                            <option value="${province.regId}">${province.name}</option>
                                        </c:forEach>

                                    </select>


                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">

                                    <select class="form-control" name="city" id="citySelect">

                                    </select>

                                </div>
                            </div>
                        </div>
                        <%--<div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>车辆价格</label>
                                    <div class="input-group">
                                        <span class="input-group-addon">¥</span>
                                        <input type="number" class="form-control">
                                        <span class="input-group-addon">.00</span>
                                    </div>
                                </div>
                            </div>
                        </div>--%>
                        <!--图片上传,采用百度图片上传插件-->

                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>车辆图片</label>
                                    <div class="box box-default">
                                        <div id="uploader" class="wu-example">
                                            <div class="queueList">
                                                <div id="dndArea" class="placeholder">
                                                    <div id="filePicker"></div>
                                                    <p>或将照片拖到这里，单次最多可选300张</p>
                                                </div>
                                            </div>
                                            <div class="statusBar" style="display:none;">
                                                <div class="progress">
                                                    <span class="text">0%</span>
                                                    <span class="percentage"></span>
                                                </div>
                                                <div class="info"></div>
                                                <div class="btns">
                                                    <div id="filePicker2"></div>
                                                    <div class="uploadBtn">开始上传</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>


                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>车辆其他信息</label>
                                    <div class="box">
                                        <div class="box-body pad">
                                        <textarea class="textarea" name="otherInfo" placeholder="Place some text here"
                                                  style="width: 100%; height: 200px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;"></textarea>
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>


                    </div>
                    <!-- /.box-body -->

                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>


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
</div>

<!-- Control Sidebar -->


<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.2.0 -->
<script src="${pageContext.request.contextPath }/admin/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="${pageContext.request.contextPath }/admin/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath }/admin/dist/js/app.min.js"></script>

<!--html5编辑器js-->
<script src="${pageContext.request.contextPath }/admin/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!--webupload js-->
<script src="${pageContext.request.contextPath }/admin/webuploader-0.1.5/webuploader.js"></script>

<!--demo js-->
<script src="${pageContext.request.contextPath }/admin/picUpload/demo.js"></script>
<script>
    $(function () {
        // Replace the <textarea id="editor1"> with a CKEditor
        // instance, using default configuration.
        //CKEDITOR.replace('editor1');
        //bootstrap WYSIHTML5 - text editor
        $(".textarea").wysihtml5();
    });

    function findUser() {
        var mobile = $("#mobile").val();
        if ($.trim(mobile) == "") {
            alert("手机号不能为空!!");
            return;
        }
        var url = "${pageContext.request.contextPath }/admin/user/findUserByTel.do";
        $.post(url, {
                    "mobile": mobile
                },
                function (data) {
                    if (data.resultCode == "1") {
                        if (data.add == "1") {
                            alert("用户不存在,自动新增用户!");
                        }

                        $("#userName").val(data.result.userName)
                        $("#owner").val(data.result.userId);

                    } else {
                        alert(data.errMsg);
                    }
                }, "json");

    }

    function changeBrand(o) {
        var value = $(o).find("option:selected").val();
        //未分页地址
        var url = "${pageContext.request.contextPath }/admin/model/list.do";
        $.post(url, {
            "brand": value
        }, function (data) {
            $("#modelSelect").empty();
            for (var i = 0; i < data.length; i++) {
                var $p = $("<option></option>");
                $p.val(data[i].year + ":" + data[i].model);
                $p.text(data[i].year + ":" + data[i].model);

                $("#modelSelect").append($p);

            }

        }, "json");

    }

    function changeProvince(o) {
        var value = $(o).find("option:selected").val();
        var url = "${pageContext.request.contextPath }/admin/common/city";
        $.post(url, {
            "regId": value
        }, function (data) {
            if(data.resultCode==1){
                $("#citySelect").empty();
                for (var i = 0; i < data.result.length; i++) {
                    var $p = $("<option></option>");
                    $p.val(data.result[i].regId);
                    $p.text(data.result[i].name);

                    $("#citySelect").append($p);

                }
            }else{
                alert(data.errMsg);
            }

        }, "json");

    }
</script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. Slimscroll is required when using the
     fixed layout. -->
</body>
</html>
