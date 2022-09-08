package com.course.springboot.learnspringboot;

import org.springqframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "Currency-Service")
@Component
public class CurrencyServiceConfiguration {
        private String url;
        private String username;
        private String key;

        private getUrl() {
            return url;
        }

        public void setUrl(String url){
            this.url = url;
        }

        private getUsername(){
            return username;
        }

        public void setUsername(String username){
            this.username = username;
        }

        private getKey(){
            return key;
        }

        public setKey(String key){
            this.key = key;
        }



}

