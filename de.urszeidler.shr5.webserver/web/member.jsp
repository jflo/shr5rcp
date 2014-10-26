<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="de.urszeidler.eclipse.shr5.Shr5Package"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimePackage"%>
<%@page import="de.urszeidler.shr5.ecp.util.ShadowrunEditingTools"%>
<%@page import="de.urszeidler.eclipse.shr5.KoerperPersona"%>
<%@page import="org.eclipse.emf.common.util.EList"%>
<%@page import="de.urszeidler.shr5.scripting.ScriptHistory"%>
<%@page import="de.urszeidler.shr5.ecp.service.ScriptService"%>
<%@page import="de.urszeidler.shr5.webserver.Activator"%>
<%@page import="de.urszeidler.eclipse.shr5.Feuerwaffe"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.AbstraktGegenstand"%>
<%@page import="de.urszeidler.eclipse.shr5.ChrakterLimits"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    if(pm==null){
    	response.sendRedirect("main");
    }
    RuntimeCharacter character = pm.getCharacter();

    String characterName = WebTools.getText(character.getCharacter().getPersona().getName());
    ScriptService scriptService = Activator.getDefault().getScriptService();
    ScriptHistory history = scriptService.getCurrentScript().getHistory();
    EList<String> writtenProtokol = history.getWrittenProtokol();
    request.setAttribute("lhand", character.getLeftHand());
    request.setAttribute("rhand", character.getRightHand());
    request.setAttribute("armor", character.getArmor());
    //
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Impersonating <%=characterName%></title>
<%@include file="include/style.jsp"%>
</head>

<body>
	<div id="dialog" class="no-close"></div>
	<script type="text/javascript">
		$("#dialog").dialog({
			dialogClass : "no-close",
			autoOpen : false,
			modal : true,
			show : "puff",
			hide : "puff"
		});

		(function poll() {
			$.ajax({
				url : "/main?action=dialog",
				type : "GET",
				success : function(data) {
					if (data != "") {
						$('#dialog').html(data);
						//$('#page').html('');
						$('#dialog').dialog("option", "position", {
							my : "left top",
							at : "left top",
							of : window
						});
						$('#dialog').dialog("option", "closeOnEscape", false);
						$('#dialog').dialog("open");
					} else {
						setTimeout(function() {
							poll()
						}, 1000)
					}
				},
				dataType : "text",
				//         complete: setTimeout(function() {poll()}, 10000),
				timeout : 2000
			})
		})();
	</script>
	<div id="page" class="page">
		<div id="character" class="character-container">
			<div class="character-container-head thin-border small-corner ">
				<div class="inner-margin">
					<strong class="container-row"> 
					<img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(character)%>" />
						<%=characterName%></strong> <strong class="container-row"> <%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__USED_EDGE)%>:
						<%=character.getUsedEdge()%>/<%=character.getCharacter().getPersona().getEdge()%></strong>
					<hr />
					<jsp:include page="include/conditionMonitor.jsp" />
				</div>
			</div>
			<div class="container-row">
				<div
					class="character-single-item-container thin-border small-corner ">
					<div class="inner-margin">
						<%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND)%>
						:
						<img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(character.getLeftHand())%>" /><%=WebTools.getText(character.getLeftHand())%>
						<hr />
						<jsp:include page="include/item.jsp">
							<jsp:param name="object" value="lhand" />
						</jsp:include>
					</div>
				</div>
				
				<div
					class="character-single-item-container thin-border small-corner ">
					<div class="inner-margin">
						<%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND)%>
						:
						<img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(character.getRightHand())%>" /><%=WebTools.getText(character.getRightHand())%>
						<hr />
						<jsp:include page="include/item.jsp">
							<jsp:param name="object" value="rhand" />
						</jsp:include>
					</div>
				</div>

				<div
					class="character-single-item-container thin-border small-corner ">
					<div class="inner-margin">
						<%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__ARMOR)%>
						:
						<img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(character.getArmor())%>" /><%=WebTools.getText(character.getArmor())%>
						<hr />
						<jsp:include page="include/item.jsp">
							<jsp:param name="object" value="armor" />
						</jsp:include>
					</div>
				</div>
				
			</div><!--  -->
		</div>

		<!-- end container -->
		<div class="character-inventar-container">
			<a href="changeInventar.jsp">change</a> </br>
			<div class="character-multi-item-container thin-border small-corner">
				<div class="inner-margin">
					<%
					    for (AbstraktGegenstand g : character.getInUse()) {
					%>
					<p class="inventar"><img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(g)%>" /><%=WebTools.getText(g)%></p>
					<%
					    }
					%>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			(function poll() {
				$.ajax({
					url : "/main?action=history",
					type : "GET",
					success : function(data) {
					if (data != "") {
						$('#history-container').html(data);
						}
					},
					dataType : "text",
					complete : setTimeout(function() {
						poll()
					}, 3000),
					timeout : 2000
				})
			})();
		</script>
		<jsp:include page="include/history.jsp" />
		<a href="main?action=logout">stop being <%=WebTools.getText(character)%>(logout)
		</a>
	</div>
	</div>
</body>
</html>