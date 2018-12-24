# BDLocationPlugin
cordova 百度定位插件
一、安装插件：
到cordova项目下使用命令添加定位插件：
cordova plugins add https://github.com/hhllnw/BDLocationPlugin.git
二、使用
1、在html页面中映入cordova.js， <script src="cordova.js" type="text/javascript" charset="utf-8"></script>
2、方法：
function getLocation(){
bdLocation.requestLocation(success,error);

function success(message){
console.log(message);
alert(message);
}
function error(message){
console.log(message);
}
}

bdLocation.requestLocation(success,error);为调用经纬度的方法
success(message)是指调用经纬度获取成功的方法;error(message)是数据获取失败；
message是android返回数据

下面贴个列子：
<!DOCTYPE html>
<html>
<head>
    <meta charset=utf-8>
    <meta name=viewport content="width=device-width,initial-scale=1">
    <title>vue</title>
    <script src="cordova.js" type="text/javascript" charset="utf-8"></script>
    <script type=text/javascript charset=utf-8>//定义一个标志位，若值为0表示设备未完成加载

function getLocation(){
bdLocation.requestLocation(success,error);

function success(message){
console.log(message);
alert(message);
}
function error(message){
console.log(message);
}
}

    </script>
</head>
<body><h2 id=deviceProperties>点击屏幕下方的按钮，获取位置信息</h2>
<div class=button_rec>
    <div class=button_main>
        <div class=button onclick=getLocation();>showLocation</div>
    </div>
</div>
<div id=app></div>
</body>
</html>
