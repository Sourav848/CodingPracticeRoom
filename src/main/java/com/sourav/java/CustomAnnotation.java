package com.sourav.java.examples;


public class CustomAnnotation{



public @interface MyCustomAnnotationOne {  //Marker Annotation

}

@interface MyCustomAnnotationTwo {  //Single- value Annotation

	int value() default 0;  
	
}

@interface MyCustomAnnotationThree {  //Multi - value Annotation
	
	int value1() default 1;  
	String value2() default "";  
	String value3() default "xyz";

}
}