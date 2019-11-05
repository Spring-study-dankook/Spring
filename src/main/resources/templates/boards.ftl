<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>Boards</title>
</head>

<body>
    <#if boards??>
        <#list boards as board>
            <h2>${(board.type)!}</h2>
            <h4>${(board.title)!}</h4>
            <p>${(board.content)!}</p>
        </#list>
    </#if>

</body>

</html>