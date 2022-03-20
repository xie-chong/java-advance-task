package io.xie.httpclient;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

//@Slf4j
public class HttpClientHelper {
    public static CloseableHttpClient httpclient = HttpClients.createDefault();

    // GET 调用
    public static String getAsString(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("xjava","kimmking");
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpGet);
            System.out.println("" + response.getStatusLine());
            HttpEntity entity1 = response.getEntity();
            Header[] arry = response.getAllHeaders();
            return EntityUtils.toString(entity1, "UTF-8");
        } finally {
            if (null != response) {
                response.close();
            }
        }
    }
}
