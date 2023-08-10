package com.domain.sub.config

import com.domain.sub.serialization.converter.YamlJackson2HttpMessageConverter
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import javax.print.attribute.standard.Media

@Configuration
class WebConfig : WebMvcConfigurer {

    private val MEDIA_TYPE_APPLICATION_YML = MediaType.valueOf("application/x-yaml")
    override fun configureContentNegotiation(configurer: ContentNegotiationConfigurer) {
        /*
        For query param mediaType
        configurer.favorParameter(true)
            .parameterName("mediaType")
            .ignoreAcceptHeader(true)
            .useRegisteredExtensionsOnly(false)   //.useJaf(true) << DEPRECATED
            .defaultContentType(MediaType.APPLICATION_JSON)
            .mediaType("json", MediaType.APPLICATION_JSON)
            .mediaType("xml", MediaType.APPLICATION_XML)

         */ 
        // mediaType does not accept string as parameter, only MediaType class

        configurer.favorParameter(false)
            .ignoreAcceptHeader(false)
            .useRegisteredExtensionsOnly(false)   //.useJaf(true) << DEPRECATED
            .defaultContentType(MediaType.APPLICATION_JSON)
            .mediaType("json", MediaType.APPLICATION_JSON)
            .mediaType("xml", MediaType.APPLICATION_XML)
            .mediaType("x-yaml", MEDIA_TYPE_APPLICATION_YML)


    }

    override fun extendMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        converters.add(YamlJackson2HttpMessageConverter())
    }
}