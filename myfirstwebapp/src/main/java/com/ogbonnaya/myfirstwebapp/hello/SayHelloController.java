package com.ogbonnaya.myfirstwebapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, what are you learning today";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();

        sb.append("<html >");
        sb.append("<head>");
        sb.append("   <title > My first HTML Page</title >");
        sb.append(" </head>");
        sb.append("<body>");
        sb.append("This is my first web page on springboot");
        sb.append("</body >");
        sb.append("</html >");


        return sb.toString();

    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
