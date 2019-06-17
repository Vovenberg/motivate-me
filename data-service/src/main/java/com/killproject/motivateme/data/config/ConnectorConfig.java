//package com.killproject.motivateme.data.config;
//
//import org.apache.catalina.Context;
//import org.apache.catalina.connector.Connector;
//import org.apache.http.client.HttpClient;
//import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.ssl.SSLContextBuilder;
//import org.apache.tomcat.util.descriptor.web.SecurityCollection;
//import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.web.client.RestTemplate;
//
//import javax.net.ssl.SSLContext;
//
//
//@Configuration
//public class ConnectorConfig {
//
//
////      @Bean
////      public TomcatServletWebServerFactory servletContainer() {
////          TomcatServletWebServerFactory tomcat =
////          new TomcatServletWebServerFactory() {
////
////            @Override
////            protected void postProcessContext(Context context) {
////              SecurityConstraint securityConstraint = new SecurityConstraint();
////              securityConstraint.setUserConstraint("CONFIDENTIAL");
////              SecurityCollection collection = new SecurityCollection();
////              collection.addPattern("/*");
////              securityConstraint.addCollection(collection);
////              context.addConstraint(securityConstraint);
////            }
////          };
////        tomcat.addAdditionalTomcatConnectors(createHttpConnector());
////        return tomcat;
////      }
////
////      private Connector createHttpConnector() {
////        Connector connector =
////          new Connector("org.apache.coyote.http11.Http11NioProtocol");
////        connector.setScheme("http");
////        connector.setSecure(false);
////        connector.setPort(8899);
////        connector.setRedirectPort(8899);
////        return connector;
////      }
//
//    @Bean
//    RestTemplate restTemplate() throws Exception {
//        SSLContext sslContext = new SSLContextBuilder()
//                .loadTrustMaterial(, trustStorePassword.toCharArray())
//                .build();
//        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);
//        HttpClient httpClient = HttpClients.custom()
//                .setSSLSocketFactory(socketFactory)
//                .build();
//        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
//        return new RestTemplate(factory);
//    }
//
//}