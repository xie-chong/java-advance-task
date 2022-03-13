package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class HttpClientHelper {
    public static CloseableHttpClient httpclient = HttpClients.createDefault();

    // GET 调用
    public static String getAsString(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpGet);
            log.info("" + response.getStatusLine());
            HttpEntity entity1 = response.getEntity();
            return EntityUtils.toString(entity1, "UTF-8");
        } finally {
            if (null != response) {
                response.close();
            }
        }
    }
}
