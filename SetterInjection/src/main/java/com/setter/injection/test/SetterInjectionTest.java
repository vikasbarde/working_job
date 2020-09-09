package com.setter.injection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.setter.injection.user.Radio;

public class SetterInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		Radio radio = (Radio) factory.getBean("radio");
		radio.listen();
	}

}
