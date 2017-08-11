<%--
  Created by IntelliJ IDEA.
  User: cvter
  Date: 2017/8/7
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Rule</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
    <link href="${APP_PATH} /static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%--<%=request.getParameter("part_class_name")%>--%>

    <!--新增规格描述-->
    <div class="row">
        <div class="col-md-2 col-md-offset-2" style="margin-top: 100px">
            <button class="btn btn-primary" id="spec_des_add_modal_btn">新增规格描述</button>
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
    <div class="modal fade" id="spec_AddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="specModalLabel">添加Rule</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Spec_Name</label>
                            <div class="col-sm-10">
                                <input type="text" name="spec_name" class="form-control" id="spec_name_add_input" placeholder="sp001">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-10">
                                <input type="text" name="spec_des" class="form-control" id="spec_des_add_input" placeholder="(10，红)">
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

<script type="text/javascript">

    //点击新增规格描述弹出模态框
    $("#spec_des_add_modal_btn").click(function(){
        <%--<%String part_class_name = request.getParameter("part_class_name");%>--%>
        //  alert(part_class_name);

        //弹出模态框
        $("#spec_AddModal").modal({
            backdrop:"static"
        });
    });

</script>
</body>

</html>
