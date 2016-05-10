<%--
  Created by IntelliJ IDEA.
  User: xurujian
  Date: 16/5/9
  Time: 下午8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="box-body">
    <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">
        <div class="row">
            <div class="col-sm-6">
                <div class="dataTables_length" id="example1_length">
                    <a href="#" onclick="toAddModel()"  >
                        <span class="glyphicon glyphicon-plus"></span>
                        <span class="glyphicon-class">增加</span>
                    </a>
                </div>

            </div>
            <div class="col-sm-6"></div>
        </div>
        <div class="row">
            <div class="col-sm-12">

                <table id="example2" class="table  table-bordered table-hover  dataTable" role="grid"
                       aria-describedby="example2_info">
                    <thead>
                    <tr role="row">
                        <th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1"
                            colspan="1"
                            aria-label="Rendering engine: activate to sort column descending"
                            aria-sort="ascending">编号
                        </th>
                        <th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1"
                            colspan="1"
                            aria-label="Rendering engine: activate to sort column descending"
                            aria-sort="ascending">车辆年份
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1"
                            colspan="1" aria-label="Browser: activate to sort column ascending">车辆型号
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1"
                            colspan="1" aria-label="Platform(s): activate to sort column ascending">
                            车辆型号中文名
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1"
                            colspan="1" aria-label="CSS grade: activate to sort column ascending">操作
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.modelList}" var="model">
                        <tr role="row" >
                            <td>${model.modelId}</td>
                            <td>${model.year}</td>
                            <td>${model.model}</td>
                            <td>${model.modelCn}</td>
                            <td>

                                <a href="#" onclick="editModel(${model.modelId})">

                                    <span class="glyphicon glyphicon-pencil"></span>
                                    <span class="glyphicon-class">编辑</span>

                                </a>
                                <a href="#" onclick="deleteModel(${model.modelId})">
                                    <span class="glyphicon glyphicon-remove"></span>
                                    <span class="glyphicon-class">删除</span>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    <%--<tr role="row" class="odd">
                        <td class="sorting_1">1999</td>
                        <td>Somerset</td>
                        <td>野马</td>
                        <td>

                            <a href="#">

                                <span class="glyphicon glyphicon-pencil"></span>
                                <span class="glyphicon-class">编辑</span>

                            </a>
                            <a href="#">
                                <span class="glyphicon glyphicon-remove"></span>
                                <span class="glyphicon-class">删除</span>
                            </a>
                        </td>
                    </tr>
                    <tr role="row" class="even">
                        <td class="sorting_1">2000</td>
                        <td>Tempo</td>
                        <td>节奏</td>
                        <td>

                            <a href="#">

                                <span class="glyphicon glyphicon-pencil"></span>
                                <span class="glyphicon-class">编辑</span>

                            </a>
                            <a href="#">
                                <span class="glyphicon glyphicon-remove"></span>
                                <span class="glyphicon-class">删除</span>
                            </a>
                        </td>
                    </tr>--%>
                    </tbody>

                </table>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-5">
                <div class="dataTables_info" id="example2_info" role="status" aria-live="polite">
                    总共两条记录
                </div>
            </div>
            <div class="col-sm-7">
                <div class="dataTables_paginate paging_simple_numbers" id="example2_paginate">
                    <ul class="pagination">
                        <li class="paginate_button previous disabled" id="example2_previous"><a href="#"
                                                                                                aria-controls="example2"
                                                                                                data-dt-idx="0"
                                                                                                tabindex="0">上一页</a>
                        </li>
                        <li class="paginate_button active"><a href="#" aria-controls="example2"
                                                              data-dt-idx="1" tabindex="0">1</a></li>
                        <li class="paginate_button "><a href="#" aria-controls="example2"
                                                        data-dt-idx="2" tabindex="0">2</a></li>
                        <li class="paginate_button "><a href="#" aria-controls="example2"
                                                        data-dt-idx="3" tabindex="0">3</a></li>
                        <li class="paginate_button "><a href="#" aria-controls="example2"
                                                        data-dt-idx="4" tabindex="0">4</a></li>
                        <li class="paginate_button "><a href="#" aria-controls="example2"
                                                        data-dt-idx="5" tabindex="0">5</a></li>
                        <li class="paginate_button "><a href="#" aria-controls="example2"
                                                        data-dt-idx="6" tabindex="0">6</a></li>
                        <li class="paginate_button next" id="example2_next"><a href="#"
                                                                               aria-controls="example2"
                                                                               data-dt-idx="7"
                                                                               tabindex="0">后一页</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
