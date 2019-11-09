<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>${title!'타이틀'}</title>
</head>

<body>
    <#list boardList as boardList>
        <h2>${boardList.title}</h2>
        <h4>${boardList.content}</h4>
    </#list>
</body>

</html>