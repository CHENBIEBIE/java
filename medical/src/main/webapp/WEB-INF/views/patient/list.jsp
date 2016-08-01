<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/2.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdn.staticfile.org/font-awesome/4.1.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body>

<div class="navbar navbar-static-top">
    <div class="navbar-inner">
        <a class="brand" href="#">凯盛医疗</a>
        <ul class="nav">
            <li><a href="home.html"><i class="fa fa-home"></i> 首页</a></li>
            <li class="active"><a href="/patient/home"><i class="fa fa-building"></i> 病人档案</a></li>
            <li><a href="#"><i class="fa fa-stethoscope"></i>  就诊记录</a></li>
            <li><a href="#"><i class="fa fa-bell-o"></i> 复诊提醒</a></li>
            <li><a href="#"><i class="fa fa-bar-chart-o"></i> 数据统计</a></li>
            <li class="dropdown ">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" ><i class="fa fa-cogs"></i> 系统设置 <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href=""><i class="fa fa-sitemap"></i> 科室设置</a></li>
                    <li><a href=""><i class="fa fa-medkit"></i> 病种设置</a></li>
                    <li><a href=""><i class="fa fa-bars"></i> 医保类型设置</a></li>
                    <li><a href=""><i class="fa fa-child"></i> 患者状态设置</a></li>
                    <li class="divider"></li>
                    <li><a href=""><i class="fa fa-user-md"></i> 账号设置</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav pull-right">
            <li class="divider-vertical"></li>
            <li><a href="#"><i class="fa fa-cog"></i> 个人设置</a></li>
        </ul>
    </div>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">

            <div class="box">
                <div class="box-header">
            <span class="title">
              <i class="fa fa-info"></i>
              <a href="patient-list.html"> 患者列表</a>  /  患者基本信息
            </span>
                    <ul class="unstyled inline pull-right">
                        <li><a href="new-patient.html"><i class="fa fa-edit"></i> 修改</a></li>
                        <li><a href="new-patient.html"><i class="fa fa-times"></i> 删除</a></li>
                    </ul>
                </div>
                <div class="box-body">
                    <table class="table">
                        <tbody>
                        <tr>
                            <td width="100"><strong>姓名</strong></td>
                            <td width="300">张晓明</td>
                            <td width="100"><strong>性别</strong></td>
                            <td width="300">男</td>
                            <td width="100"><strong>年龄</strong></td>
                            <td width="">45</td>
                        </tr>
                        <tr>
                            <td><strong>身份证号</strong></td>
                            <td>412809196708120998</td>
                            <td><strong>联系电话</strong></td>
                            <td>13400000000</td>
                            <td><strong>医保类型</strong></td>
                            <td>新农合</td>
                        </tr>
                        <tr>
                            <td><strong>地址</strong></td>
                            <td colspan="5">河南省焦作市塔南路新新小区4号楼8单元7楼东户</td>
                        </tr>
                        <tr>
                            <td colspan="6"><strong>过敏史</strong></td>
                        </tr>
                        <tr>
                            <td colspan="6">
                                饮食性过敏原可以是一些普通的食物和饮料，如海产类、果仁类、草莓类、香料、牛奶、啤酒或含有酒精的饮料均可能成为引起最常有的皮肤过敏症状------荨麻疹。还有很多的过敏原隐藏在其他食物里。如果对一种食物敏感，则可能会对该类食物有过敏反应，例如有数以百计的食物都含有牛奶、小麦、蛋类、香料或味精。
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6"><strong>备注</strong></td>
                        </tr>
                        <tr>
                            <td colspan="6">张局长的小舅子</td>
                        </tr>
                        </tbody>

                    </table>
                </div>
            </div>
            <!-- box end -->
            <div class="box">
                <div class="box-header">
                    <span class="title"><i class="fa fa-stethoscope"></i> 就诊记录</span>
                </div>
                <div class="box-body">
                    <table class="table">
                        <thead>
                        <tr>
                            <th width="100">日期</th>
                            <th width="150">科室</th>
                            <th width="200">病种</th>
                            <th>初步诊断</th>
                            <th width="50"></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>2014-07-02</td>
                            <td>内科</td>
                            <td>流感</td>
                            <td>流行性感冒</td>
                            <td>
                                <a href="">详情</a>
                            </td>
                        </tr>
                        </tbody>
                    </table>

                </div>
            </div>
            <!-- box end -->
        </div>

    </div>
</div>



<script src="http://cdn.staticfile.org/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/twitter-bootstrap/3.0.0/js/bootstrap.min.js"></script>

</body>
</html>
