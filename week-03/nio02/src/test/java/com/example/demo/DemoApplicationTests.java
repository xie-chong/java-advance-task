package com.example.demo;

import io.xie.httpclient.HttpClientHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

//@Slf4j
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class DemoApplicationTests {
	/**直接调用指定地址的后端服务*/
	@Test
	public void httpRequestBusinessServerTest() throws IOException {
		String url = "http://127.0.0.1:8801";
		String text = HttpClientHelper.getAsString(url);
		System.out.println("use HttpClientHelper, response: \n" + text);
	}


	/**调用后端服务网关（业务网关--服务分发）*/
	@Test
	public void httpRequestGateWayTest() throws IOException {
		String url = "http://127.0.0.1:8888";
		String text = HttpClientHelper.getAsString(url);
		System.out.println("use HttpClientHelper, response: \n" + text);
	}

//    public static void main(String[] args) throws IOException {
//        String url = "http://127.0.0.1:8888";
//        String text = HttpClientHelper.getAsString(url);
//        log.info("use HttpClientHelper, response: \n" + text);
//    }

}
