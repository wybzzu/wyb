package com.huitu.api.hnsl.rest;


import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.message.GZipEncoder;
import org.glassfish.jersey.message.filtering.EntityFiltering;
import org.glassfish.jersey.message.filtering.EntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.EncodingFilter;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.huitu.api.hnsl.filter.CORSResponseFilter;
import com.huitu.api.hnsl.filter.LoggingResponseFilter;
import com.huitu.api.hnsl.filter.PagingFilter;
import com.huitu.api.hnsl.filter.TokenRequestFilter;


/**
 * Registers the components to be used by the JAX-RS application  
 *
 * @author ama
 *
 */
public class ApiApplication extends ResourceConfig {

	/**
	 * Register JAX-RS application components.
	 */
	public ApiApplication(){

		register(RequestContextFilter.class);
		register(TokenRequestFilter.class);

	/*	register(PodcastRestService.class);
		register(HuitudemoRestService.class);*/

		//注册rest服务
		packages("com.huitu.api.hnsl.resource");

		register(JacksonFeature.class);
		register(LoggingResponseFilter.class);//增加后，不能显示wadl
		register(CORSResponseFilter.class);
		register(PagingFilter.class);
		register(MultiPartFeature.class);

		EncodingFilter.enableFor(this, GZipEncoder.class);
	}
}
