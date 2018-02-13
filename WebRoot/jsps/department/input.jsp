<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<link href="../../css/tagStyles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<%-- Here starts the javascript call function --%>
<script type="text/javascript" src="js/input.js">
</script>
	<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">部门管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<form action="list.jsp" method="post">
  			<div style="border:1px solid #cecece;">
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				  <tr styleclass="tr">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				    <tr  styleclass="trF">
				      <td styleclass="td18">部门名称</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
				      </td>
				      <td styleclass="td2no30">电话</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
				      </td>
				    </tr>
				    <tr  styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				</table>
				
			</div>
			<div styleclass="order-botton">
				<div style="margin:1px auto auto 1px;">
					<table width="100%"  border="0" cellpadding="0" cellspacing="0">
					  <tr>
					    <td>
					    	<a href="javascript:void(0)" id="commit"><img src="../../images/order_tuo.gif" border="0" /></a>
					    </td>
					    <td>&nbsp;</td>
					    <td><a href="#"><img src="../../images/order_tuo.gif" border="0" /></a></td>
					    <td>&nbsp;</td>
					    <td><a href="#"><img src="../../images/order_tuo.gif" border="0" /></a></td>
					  </tr>
					</table>
				</div>
			</div>
			</form>
		</div><!--"square-order"end-->
	</div><!--"content-text"end-->
	<div styleclass="content-bbg"><img src="../../images/content_bbg.jpg" /></div>
</div>
<%-- end of input.jsp --%>