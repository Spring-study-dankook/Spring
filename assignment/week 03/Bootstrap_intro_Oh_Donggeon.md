# Bootstrap

Bootstrap은 트위터 개발자들이 만든 프론트엔드 프레임워크이다.

탄생 이유는

- 웹 사이트 개발 시 디자인으로 인한 개발 시간의 지연 해결
- 모바일 환경에 적합한 반응형 웹 사이트 개발

의 이유로 탄생하였다.

Bootstrap은 웹사이트 디자인 시 방대한 양의 코드 양을 현저히 줄여준다.

또한, 현재 가장 유명한 html, css, javascript 프레임워크이다. (특히 css 관련)



# 설치

### 1. maven에 dependency 추가

```xml
<dependency>   
    <groupId>org.webjars</groupId>   
    <artifactId>bootstrap</artifactId>   
    <version>4.3.1</version>
</dependency>
```

 과제를 하면서 bootstrap jar를 보다가 pom.xml에서 jQuery가 명시되어있었다. jQuery도 dependency를 추가 해줘야 할 필요가 있다고 생각했지만 직접 jQuery의 버전을 관리하고 있었기 때문에 추가하지 않았다.

### 2. ftl에 태그 추가

head에는

```html
<link rel="stylesheet" href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
```

body 끝에는

```html
<script src="/webjars/jquery/3.0.0/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
```

을 추가해준다.



##### 예시

```html
<!DOCTYPE html><html lang="ko">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Hello ${name}</title>
</head>
    <body>
        <h2>Hello ${name}</h2>
        <p type="button" class="btn btn-lg btn-primary">primary</p>
        
        <script src="/webjars/jquery/3.0.0/jquery.min.js"></script>
        <script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
```

##### 출력 화면

![1572863377616](C:\Users\cafa3\AppData\Roaming\Typora\typora-user-images\1572863377616.png)



Maven을 통해서 관리하는 이유

1. local로 bootstrap을 관리하면 업데이트마다 파일을 다운받아서 업데이트 해야하는 번거로움이 있다.

2. CDN을 사용하게되면 간혹 UI를 정상적으로 불러오지 못하여 발생하는 현상이 사용자에게 생길 수 있다.

   (참고 : http://millky.com/@origoni/post/1147)

Maven을 통해 관리하게 되면 버전관리에 매우 효율적이므로 이 방법을 선택하였다.