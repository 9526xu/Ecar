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
        <div class="row" >
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
                    <c:forEach items="${requestScope.pageResult.result}" var="model">
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
        <input type="hidden" id="totalPage" value="${pageResult.totalPage}">
        <input type="hidden" id="pageNo" value="${pageResult.pageNo}">
        <input type="hidden" id="totalCount" value="${requestScope.pageResult.totalCount}">
    </div>
</div>


