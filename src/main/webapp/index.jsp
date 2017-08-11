<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>关于物料</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container" style="border: 1px solid greenyellow;background-color: #1b6d85">
        <h2 style="text-align: center;margin-top: 50px;">物料搜索</h2>
        <div class="row">
            <div class="col-md-2 col-md-offset-10">
                <button class="glyphicon glyphicon-user btn btn-info" id="part_conter" >进入物料中心</button>
            </div>
        </div>
        <div class="navbar-form navbar-left" role="search" style="margin-top: 60px;margin-left:440px" >
            <div class="form-group" >
                <input type="text" class="form-control" placeholder="Search" id="part_class_name" name="part_class_name">
            </div>
            <button  class="glyphicon glyphicon-search btn btn-default " id="search">搜索</button>
        </div>

        <!--物料分类不存在模态框-->
        <div class="modal fade" tabindex="-1" role="dialog" id="no_rule_AddModal">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        该分类还没有规则，快进入物料中心为其添加吧～
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>
        </div>
        <!--规格描述模态框-->
        <div class="modal fade" id="spec_Modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="specModalLabel">规格描述</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" id="property1"></label>
                                <div class="col-sm-10">
                                    <input type="text" name="spec_name" class="form-control" id="spec_p1" placeholder="红">
                                    <span class="help-block"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"id="property2"></label>
                                <div class="col-sm-10">
                                    <input type="text" name="spec_des" class="form-control" id="spec_p2" placeholder="10">
                                    <span class="help-block"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" id="spec_save_btn">搜索</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- 显示表格数据 -->
        <div class="row" style="margin-left: 200px;margin-top:200px">
            <div class="col-md-10" >
                <table class="table table-hover" id="part_items_table">
                    <thead>
                    <tr>
                        <th>
                            <input type="checkbox" id="check_all"/>
                        </th>
                        <th>Part_Item_Id</th>
                        <th>Part_Item_Name</th>
                        <th>Part_Class_Id</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>

<script type="text/javascript">
    $("#search").click(function () {
        //alter(111);
        var partClassName = $("#part_class_name").val();
        alert(partClassName);
        $.ajax({
            url:"part",
            data:"partClassName="+partClassName,
            type:"GET",
            success:function(result){
                //result.extend.info;
                if(result.extend.info){
                    showRuleDes(partClassName);
                }else if(partClassName != null && partClassName != "" && partClassName != undefined){
                    $("#no_rule_AddModal").modal({
                        backdrop:"static"
                    });
                }
            }
        });
    });

    //如果物料分类存在规则，则弹出规则模态框
    function showRuleDes(partClassName) {
        $.ajax({
            url:"part_rule",
            data:"partClassName="+partClassName,
            type:"GET",
            success:function(result){
                var ss = result.extend.propertyList.toString().split(",");
                $("#property1").html(ss[0]);
                $("#property2").html(ss[1]);
                $("#spec_Modal").modal({
                    backdrop:"static"
                });
            }
        });
    }

    $("#spec_save_btn").click(function(){
        var saveDataAry=[];
        var pname1 = $("#property1").text();
        var pname2 = $("#property2").text();
        var spec_p1 = $("#spec_p1").val();
        var spec_p2 = $("#spec_p2").val();
        var data1={"propertyName":pname1+"","propertyValue":spec_p1+""};
        var data2={"propertyName":pname2+"","propertyValue":spec_p2+""};
        saveDataAry.push(data1);
        saveDataAry.push(data2);
        $.ajax({
            url:"partSpec",
            type:"POST",
            dataType:"json",
            contentType:"application/json",
            data:JSON.stringify(saveDataAry),
            success:function(result){
                alert("success");
                alert(result.extend.partItems)
                $("#spec_Modal").modal('hide');
                show_part_item(result)
            }
        });
    });

    function show_part_item(result){
        $("#part_items_table tbody").empty();
        var parts = result.extend.partItems;
        $.each(parts,function(index,item){
            var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
            var partItemId = $("<td></td>").append(item.partItemId);
            var partItemName = $("<td></td>").append(item.partItemName);
            var partClassId = $("<td></td>").append(item.partClassId);
            //append方法执行完成以后还是返回原来的元素
            $("<tr></tr>").append(checkBoxTd)
                .append(partItemId)
                .append(partItemName)
                .append(partClassId)
                .appendTo("#part_items_table tbody");
        });
    }
    $("#part_conter").click(function(){
        window.location.href="part_center.jsp"
    });
</script>
</html>