<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>${title}</title>
</head>

<body>
    <#list boardList as boardList>
        <h2>${boardList.title}</h2>
        <h5>${boardList.content}</h5>
    </#list>
</body>

</html>