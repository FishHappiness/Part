<%--
  Created by IntelliJ IDEA.
  User: cvter
  Date: 2017/8/7
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>物料中心</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
    <link href="${APP_PATH} /static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container" style="border: 1px solid greenyellow;background-color: #c1e2b3">
        <h2 style="margin-top: 40px;text-align: center">物料中心</h2>

        <div class="row">
           <div class="col-md-2 col-md-offset-10">
               <button class="glyphicon glyphicon-share btn btn-info" id="part_search" >返回物料搜索</button>
           </div>
       </div>

        <div style="margin-left: 200px;margin-right: 200px">
            <h4>新增规则</h4>
            <div class="list-group">
                <button type="button" class="list-group-item list-group-item-success disabled " >电路板</button>
                <button type="button" class="a list-group-item list-group-item-info" id="no_rule_dianzuqi">电阻器</button>
                <button type="button" class="a list-group-item list-group-item-warning" id="sano_rule_njiguan">三极管</button>
                <button type="button" class="a list-group-item list-group-item-danger" id="no_rule_erjiguan">二极管</button>
                <button type="button" class="a list-group-item list-group-item-success"id="no_rule_dianrong">电容</button>
            </div>
        </div>

        <!-- 显示表格数据 -->
        <div class="row" style="margin-left: 145px;margin-top:20px">
           <div class="col-md-10" >
               <h4>关联物料</h4>
               <table class="table table-hover" id="part_items_table">
                   <thead>
                   <tr>
                       <th>
                           <input type="checkbox" id="check_all"/>
                       </th>
                       <th>Part_Item_Id</th>
                       <th>Part_Item_Name</th>
                       <th>Part_Class_Id</th>
                       <th>操作</th>
                   </tr>
                   </thead>
                   <tbody>
                   </tbody>
               </table>
           </div>
       </div>

        <!--规则添加模态框-->
        <div class="modal fade" id="rule_AddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="ruleModalLabel">添加Rule</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Rule_Name</label>
                                <div class="col-sm-10">
                                    <input type="text" name="rule_name" class="form-control" id="rule_name_add_input" placeholder="Rule1">
                                    <span class="help-block"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Description</label>
                                <div class="col-sm-10">
                                    <input type="text" name="rule_des" class="form-control" id="rule_des_add_input" placeholder="(长度，颜色)">
                                    <span class="help-block"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="rule_save_btn">保存</button>
                    </div>
                </div>
            </div>
        </div>

        <!--规格描述添加模态框-->
        <div class="modal fade" id="spec_AddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="specModalLabel">关联规格描述</h4>
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
                                <label class="col-sm-2 control-label" id="property2"></label>
                                <div class="col-sm-10">
                                    <input type="text" name="spec_des" class="form-control" id="spec_p2" placeholder="10">
                                    <span class="help-block"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="spec_save_btn">保存</button>
                    </div>
                </div>
            </div>
        </div>

   </div>
<script type="text/javascript">
    //查询非关联物料列表
    $(function(){
        $.ajax({
            url:"partNoSpec",
            type:"GET",
            data:null,
            success:function(result){
                alert("success");
                show_part_item_on_Des(result);
            }
        });
    });

    function show_part_item_on_Des(result){
        $("#part_items_table tbody").empty();
        var parts = result.extend.partItems_no_desc;
        $.each(parts,function(index,item){
            var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
            var partItemId = $("<td></td>").append(item.partItemId);
            var partItemName = $("<td></td>").append(item.partItemName);
            var partClassId = $("<td></td>").append(item.partClassId);
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-transfer")).append("关联");
            //为按钮添加一个自定义的属性，来表示当前物料id
            editBtn.attr("edit-id",item.partClassId);
            editBtn.attr("con-part-id",item.partItemId);
            var btnTd = $("<td></td>").append(editBtn);
            //append方法执行完成以后还是返回原来的元素
            $("<tr></tr>").append(checkBoxTd)
                .append(partItemId)
                .append(partItemName)
                .append(partClassId)
                .append(btnTd)
                .appendTo("#part_items_table tbody");
        });
    }

    //点击弹出关联规格属性模态框
    var partItemId;
    var contb ;
    $(document).on("click",".edit_btn",function(){
        var partClassId = $(this).attr("edit-id");
        contb =this;
        partItemId = $(this).attr("con-part-id");
        alert(partItemId);
        $.ajax({
            url:"part_class_id_rule",
            data:"partClassId="+partClassId,
            type:"GET",
            success:function(result){
                var ss = result.extend.propertyList.toString().split(",");
                $("#property1").html(ss[0]);
                $("#property2").html(ss[1]);
                $("#spec_AddModal").modal({
                    backdrop:"static"
                });
            }
        });
    });

    //将待关联的物料关联规格描述,如果描述已经存在就直接关联，否则先新建描述，然后进行关联
    $("#spec_save_btn").click(function(){
        alert(partItemId);
        var pname1 = $("#property1").text();
        var pname2 = $("#property2").text();
        var spec_p1 = $("#spec_p1").val();
        var spec_p2 = $("#spec_p2").val();
        var specificationDesDetailCustom={"partItemId":partItemId,"specList":[{"propertyName":pname1+"","propertyValue":spec_p1+""},{"propertyName":pname2+"","propertyValue":spec_p2+""}]};
        if((spec_p1 == null || spec_p1 == "" || spec_p1 == undefined)&&(spec_p2 == null || spec_p2 == "" || spec_p2 == undefined)){
            alert("All specification are not null! Please fill out again.");
        }
        $.ajax({
            url:"conPartWithSpec",
            type:"POST",
            dataType:"json",
            contentType:"application/json",
            data:JSON.stringify(specificationDesDetailCustom),
            success:function(result){
                alert("success");
                $("#spec_AddModal").modal('hide');
                if(result.code == 200){
                    alert(result.extend.fail_message);
                }else{
                    alert($(contb).text());
                    $(contb).html('已关联').addClass("glyphicon glyphicon-ok");
                }
            }
        });
    });

    //点击新增规则弹出模态框
    $(".a").click(function(){
        var  partClassName = $(this).text();//获取button标签的内容
        var rulebt = this;
        $("#rule_AddModal").modal({
            backdrop:"static"
        });
        $("#rule_save_btn").click(function () {
            var ruleName = $("#rule_name_add_input").val();
            var ruleDes = $("#rule_des_add_input").val();
            var rule_custom = {"partClassName":partClassName,"ruleDes":ruleDes,"rule":{"ruleName":ruleName}};
            $.ajax({
                url:"rulePartClass",
                type:"POST",
                dataType:"json",
                contentType:"application/json",
                data:JSON.stringify(rule_custom),
                success:function(result){
                    alert("success");
                    $("#rule_AddModal").modal('hide');
                    $(rulebt).removeClass(a);
                    $(rulebt).addClass(disabled);
                }
            });
        })
    });

    //返回物料搜索
    $("#part_search").click(function(){
        window.location.href="index.jsp"
    });

</script>
</body>

</html>
