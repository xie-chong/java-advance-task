package io.kimmking.rpcfx.client;

import com.alibaba.fastjson.JSON;
import io.kimmking.rpcfx.api.RpcfxRequest;
import io.kimmking.rpcfx.api.RpcfxResponse;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class RpcfxInvocationAop {

    public static final MediaType JSONTYPE = MediaType.get("application/json; charset=utf-8");


    @Pointcut(value="execution(* io.kimmking.rpcfx.client.*create(..))")
    public void point(){

    }

    @Before(value="point()")
    public void before(){
        System.out.println("========>begin create(..)");
    }

    @AfterReturning(value = "point()")
    public void after(){
        System.out.println("========>after create(..)");
    }


    @Around("point()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("========>around begin ");

        Object[] args = joinPoint.getArgs();

        RpcfxRequest request = new RpcfxRequest();
//        request.setServiceClass(this.serviceClass.getName());
//        request.setMethod(method.getName());
//        request.setParams(params);
//
        RpcfxResponse response = post(request, "url");

        joinPoint.proceed();

        return JSON.parse(response.getResult().toString());



    }


    private RpcfxResponse post(RpcfxRequest req, String url) throws IOException {
        String reqJson = JSON.toJSONString(req);
        System.out.println("req json: "+reqJson);

        // 1.可以复用client
        // 2.尝试使用httpclient或者netty client
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(JSONTYPE, reqJson))
                .build();
        String respJson = client.newCall(request).execute().body().string();
        System.out.println("resp json: "+respJson);
        return JSON.parseObject(respJson, RpcfxResponse.class);
    }
}
