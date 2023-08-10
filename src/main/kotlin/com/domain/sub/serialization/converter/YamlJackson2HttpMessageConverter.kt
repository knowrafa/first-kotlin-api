package com.domain.sub.serialization.converter

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import org.springframework.http.MediaType
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter

class YamlJackson2HttpMessageConverter: AbstractJackson2HttpMessageConverter(
    // We dont want to serialize null attributes
    YAMLMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL),

    MediaType.parseMediaType("application/x-yaml")
) {
}