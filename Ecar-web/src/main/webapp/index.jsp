<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
    <link rel="stylesheet" href="/admin/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="/admin/webuploader-0.1.5/webuploader.css">
</header>
<body>
<label><h1>后台首页</h1></label>
<a href="admin/index.jsp">后台首页</a>
<h2>adasdsa</h2>
<%--<a href="/admin/car_add.jsp">aaaaaa</a>--%>
<%--<img src="/admin/image/image.png">--%>


<%--<script src="/admin/plugins/jQuery/jQuery-2.2.0.min.js"></script>--%>
<form enctype="multipart/form-data" action="/admin/common/upload" method="post">
    <%--<input type="file" name="file">
    <input type="file" name="file">--%>
    <input type="text" name="name">
    <div id="uploader-demo">
        <!--用来存放item-->
        <div id="fileList" class="uploader-list"></div>
        <div id="filePicker">选择图片</div>
    </div>
    <input type="submit">

</form>



<script src="/admin/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<script src="/admin/webuploader-0.1.5/webuploader.min.js"></script>
<script>
    $(function () {
        $(function () {
            var $ = jQuery,
                    $list = $('#fileList'),
            // 优化retina, 在retina下这个值是2
                    ratio = window.devicePixelRatio || 1,

            // 缩略图大小
                    thumbnailWidth = 100 * ratio,
                    thumbnailHeight = 100 * ratio,

            // Web Uploader实例
                    uploader;
            // 初始化Web Uploader
            uploader = WebUploader.create({

                // 选完文件后，是否自动上传。
                auto: true,

                // swf文件路径
                swf: "/admin/webuploader-0.1.5/Uploader.swf",

                // 文件接收服务端。
                server: '/admin/common/upload',

                // 选择文件的按钮。可选。
                // 内部根据当前运行是创建，可能是input元素，也可能是flash.
                pick: '#filePicker',

                // 只允许选择图片文件。
                accept: {
                    title: 'Images',
                    extensions: 'gif,jpg,jpeg,bmp,png',
                    mimeTypes: 'image/*'
                }
            });

            // 当有文件添加进来的时候
            uploader.on( 'fileQueued', function( file ) {
                var $li = $(
                                '<div id="' + file.id + '" class="file-item thumbnail">' +
                                '<img>' +
                                '</div>'
                        ),
                        $img = $li.find('img');

                $("#fileList").append( $li );

                // 创建缩略图
                uploader.makeThumb( file, function( error, src ) {
                    if ( error ) {
                        $img.replaceWith('<span>不能预览</span>');
                        return;
                    }

                    $img.attr( 'src', src );
                }, thumbnailWidth, thumbnailHeight );
            });
        })
    })
</script>
</body>
</html>
