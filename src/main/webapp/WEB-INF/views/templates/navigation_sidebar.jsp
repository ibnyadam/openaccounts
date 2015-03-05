<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<div class="navbar-default sidebar" role="navigation">
     <div class="sidebar-nav navbar-collapse">
         <ul class="nav" id="side-menu">
             <li>
                 <a href="${root}"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
             </li>
             <li>
                 <a href="#"><i class="fa fa-bar-chart-o fa-fw">
                 	</i> Vouchers<span class="fa arrow"></span>
                 </a>
                 <ul class="nav nav-second-level">
                     <li>
                         <a href="flot.html">Payment Voucher</a>
                     </li>
                     <li>
                         <a href="flot.html">Receipt Voucher</a>
                     </li>
                     <li>
                         <a href="morris.html">Cash Voucher</a>
                     </li>
                 </ul>
                 <!-- /.nav-second-level -->
             </li>
             <li>
                 <a href="tables.html"><i class="fa fa-table fa-fw"></i> Tables</a>
             </li>
         </ul>
     </div>
     <!-- /.sidebar-collapse -->
 </div>
 <!-- /.navbar-static-side -->