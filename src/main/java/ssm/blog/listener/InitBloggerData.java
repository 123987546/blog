package ssm.blog.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


import ssm.blog.entity.BlogType;
import ssm.blog.service.BlogTypeService;

@Component
public class InitBloggerData implements ServletContextListener, ApplicationContextAware {

	private static ApplicationContext applicationContext;
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(applicationContext);
		//�Ȼ�ȡservlet������
		ServletContext application = sce.getServletContext();
		//ͬ�ϣ���ȡ���������Ϣ
		BlogTypeService blogTypeService = (BlogTypeService) applicationContext.getBean(BlogTypeService.class);
		List<BlogType> blogTypeList = blogTypeService.getBlogTypeData();
		application.setAttribute("blogTypeList", blogTypeList);

	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) 
			throws BeansException {
		InitBloggerData.applicationContext = applicationContext;
	}

}
