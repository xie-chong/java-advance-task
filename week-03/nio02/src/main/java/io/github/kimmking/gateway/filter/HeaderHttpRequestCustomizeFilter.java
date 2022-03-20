package io.github.kimmking.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

public class HeaderHttpRequestCustomizeFilter implements HttpRequestFilter {

    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        String headValue = fullRequest.headers().get("xjava");
        System.out.println("heat-key：xjava-" + headValue);
        if (!headValue.equals("kimmking")) {
            return;
        } else {
            fullRequest.headers().set("xjava", "kimmking");
        }
    }
}
