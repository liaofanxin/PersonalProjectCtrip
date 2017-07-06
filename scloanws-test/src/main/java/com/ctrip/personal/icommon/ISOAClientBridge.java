package com.ctrip.personal.icommon;

/**
 * Created by ljxin on 2017/5/17.
 */
public interface ISOAClientBridge<WsRequest,WsResponse,RstfRequest,RstfResponse> {
    /**
     * 将Restful的请求类转换成业务接口的请求类
     *
     * @param Restful请求类
     * @return 业务请求类
     */
    public WsRequest restToSOARequest(RstfRequest restRequest);

    /**
     * 将业务响应类转换成Restful响应类
     *
     * @param 业务响应类
     * @return Restful响应类
     */
    public RstfResponse soaResponseToRest(WsResponse response);

    /**
     * 执行调用业务接口
     *
     * @param Restful请求类
     * @return Restful响应类
     * @throws Exception
     */
    public RstfResponse request(RstfRequest restRequest) throws Exception;
}
