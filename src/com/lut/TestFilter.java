package com.lut;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @MethodName
 * @Description
 * @Author 马维俊
 * @Return
 * @Date 2019/3/28 11:30
 */
@javax.servlet.annotation.WebFilter(filterName = "TestFilter")
public class TestFilter implements javax.servlet.Filter {
    @Override
    public void destroy() {
        System.out.println("destory filter");

    }
    @Override
    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
      //  chain.doFilter(req, resp);
        System.out.println("处理客户端访问后端资源的请求,阻止访问doFilterTest,转向访问百度。");
        //过滤器处理该请求，返回百度首页
        ((HttpServletResponse)resp).sendRedirect("https://www.baidu.com/");
        return;
    }
    @Override
    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        System.out.println("init filter");
    }

}
