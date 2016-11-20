<html>
<head>
    <link href="${request.contextPath}/css/example.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>${request.getAttribute('my_var')}</h1>
<#if last_job_execution??>
<p>Last job execution: ${last_job_execution?datetime}</p>
</#if>
</body>
</html>