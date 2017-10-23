<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@include file="/WEB-INF/views/header.jsp" %>

<c:url var="readUrl"  value="/goods/list"/>
<c:url var="createUrl"  value="/goods/create"/>
<c:url var="updateUrl"  value="/goods/update"/>
<c:url var="deleteUrl"  value="/goods/delete"/>
<html>
<body>
	<kendo:grid title="GOODS" name="grid" pageable="true" sortable="true" scrollable="true" height="450" naviagatable="true">
		<kendo:grid-editable mode="popup"/>
			<kendo:grid-toolbar>
				<kendo:grid-toolbarItem name ="create" text="생성"/>
			</kendo:grid-toolbar>
		<kendo:grid-pageable refresh="true" pageSizes="true" buttonCount="10"/>
	<kendo:grid-columns>	
		<kendo:grid-column title="제품번호" field="giNum"/>
		<kendo:grid-column title="제품명" field="giName"/>
		<kendo:grid-column title="제품정보" field="giDesc"/>
		<kendo:grid-column title="회사번호" field="viNum">
			<kendo:grid-column-values value="${vendor}"/>
		</kendo:grid-column>
		<kendo:grid-column title="생산일자" field="giCredat" format="{0:yyyyMMdd}"/>
		<kendo:grid-column title="생산완료시간" field="giCretim"/>
		<kendo:grid-column title="&nbsp;" width="200px">
			<kendo:grid-column-commnad>
				<kendo:grid-column-commandItem name="edit"/>
				<kendo:grid-column-commandItem name="destroty"/>
		</kendo:grid-column>
	</kendo:grid-columns>
<kendo:dataSource pageSize="20">
	<kendo:dataSource-transport>
		<kendo:dataSource-transport-read url="${readUrl}" dataType="json" type="POST" contentType="application/json"/>
			<kendo:dataSource-transport-read url="${createUrl}" dataType="json" type="POST" contentType="application/json"/>
				<kendo:dataSource-transport-read url="${deleteUrl}" dataType="json" type="POST" contentType="application/json"/>
					<kendo:dataSource-transport-read url="${updateUrl}" dataTyep="json" type="POST" contentType="application/json"/>
					
					<kendo:dataSource-transport-parameterMap>
						<script>
							function parameterMap(options, type){
								var str = JSON.stringify(options);
								
								return str;								
							}
						</script>
					</kendo:dataSource-transport-parameterMap>
		</kendo:dataSource-transport>
		
	<kendo:dataSource-schema>
		<kendo:dataSource-schema-model id="giNum">
			<kendo:dataSource-schema-model-fields>
				<kendo:dataSource-schema-model-field name="giNum" type="number" editable="false"/>
				<kendo:dataSource-schema-model-field name="giName" type="string">
				<kendo:dataSource-schema-model-field-validation required="true"/>
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="giDesc" type="string">
				<kendo:dataSource-schema-model-field-validation required="true"/>
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="viNum" defaultValue="1">
				<kendo:dataSource-schema-model-field-validation required="true" min="1"/>
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="giCredat" editable="true" type="date">
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="giCretim" editable="false">
				</kendo:dataSource-schema-model-field>
			</kendo:dataSource-schema-model-fields>
		</kendo:dataSource-schema-model>
	</kendo:dataSource-schema>
</kendo:dataSource>
</kendo:grid>
</body>
</htm>

					

				

</body>