package controller;

import org.apache.log4j.Logger;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


/**
 * Created by htxie on 2017/7/7.
 */
@Controller
@RequestMapping("/home")
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
