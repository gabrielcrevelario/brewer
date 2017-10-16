package com.gclick.brewer.config.init;
import java.util.logging.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.gclick.brewer.config.AppApplication;
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { AppApplication.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected javax.servlet.Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		((CharacterEncodingFilter) characterEncodingFilter).setEncoding("UTF-8");
		((CharacterEncodingFilter) characterEncodingFilter).setForceEncoding(true);
		
		return (javax.servlet.Filter[]) new Filter[] { (Filter) characterEncodingFilter };
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
