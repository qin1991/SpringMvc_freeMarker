<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
</head>
<body>
    ${content}<br/>

    freemarker 学习<br/>
    <#assign number=42/>
    number:${number!''}<br/>
    string:${number?string}<br/>
    string.number:${number?string.number}<br/>
    string.currency:${number?string.currency}<br/>
    string.percent:${number?string.percent}
    <br/><br/><hr/>

    布尔值输出(一定要转string):${foo?string}<br/>
    foo:${foo?string("foo is true","foo is false")}
    <br/><br/><hr/>

    判断为不为空
    <#if  myName!??>myName是空的<#else>myName不是空的</#if><br/>
    myName:${myName!''}
    <br/><br/><hr/>

    集合遍历<br/>
    <#list weekList as week>
        ${week}
    </#list>
    <br/><br/><hr/>

    map展示
    姓名:${map.name}
    身高:${map.height}
    体重:${map.wight}
    <br/><br/><hr/>

    算术运算
    <#assign x=5 age=30/>
    5*5-10=${x*x-10}
    1.25转int ${1.25?int}

    <br/><br/><hr/>
    age:${age}
    <#if (age>60)>老年人
    <#elseif (age>40)>中年人
    <#elseif (age>20)>青年人
    <#else>小孩子
    </#if>

    <#if foo>
        foo is null
    </#if>


</body>
</html>