//package com.open.harmony.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class AliPayService {
//
//    @Autowired
//    AliPayHelper aliPayHelper;
//
//    @Resource
//    AlipayConfig alipayConfig;
//
//    @Transactional(rollbackFor = Exception.class)
//    public GenericResponse<Object> placeOrderForPCWeb(AliPayRequest aliPayRequest) throws IOException {
//        log.info("【请求开始-在线购买-交易创建】*********统一下单开始*********");
//
//        String tradeNo = aliPayHelper.generateTradeNumber();
//
//        String subject = "购买套餐1";
//        Map<String, Object> map = aliPayHelper.placeOrderAndPayForPCWeb(tradeNo, 100, subject);
//
//        if (Boolean.parseBoolean(String.valueOf(map.get("isSuccess")))) {
//            log.info("【请求开始-在线购买-交易创建】统一下单成功，开始保存订单数据");
//
//            //保存订单信息
//            // 添加你自己的业务逻辑，主要是保存订单数据
//
//            log.info("【请求成功-在线购买-交易创建】*********统一下单结束*********");
//            return new GenericResponse<>(ResponseCode.SUCCESS, map.get("body"));
//        }else{
//            log.info("【失败：请求失败-在线购买-交易创建】*********统一下单结束*********");
//            return new GenericResponse<>(ResponseCode.INTERNAL_ERROR, String.valueOf(map.get("subMsg")));
//        }
//    }
//
//    // sync return page
//    public void orderCallbackInSync(HttpServletRequest request, HttpServletResponse response) {
//        try {
//            OutputStream outputStream = response.getOutputStream();
//            //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
//            response.setHeader("content-type", "text/html;charset=UTF-8");
//            String outputData = "支付成功，请返回网站并刷新页面。";
//
//            /**
//             * data.getBytes()是一个将字符转换成字节数组的过程，这个过程中一定会去查码表，
//             * 如果是中文的操作系统环境，默认就是查找查GB2312的码表，
//             */
//            byte[] dataByteArr = outputData.getBytes("UTF-8");//将字符转换成字节数组，指定以UTF-8编码进行转换
//            outputStream.write(dataByteArr);//使用OutputStream流向客户端输出字节数组
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public String orderCallbackInAsync(HttpServletRequest request) {
//        try {
//            Map<String, String> map = aliPayHelper.paramstoMap(request);
//            String tradeNo = map.get("out_trade_no");
//            String sign = map.get("sign");
//            String content = AlipaySignature.getSignCheckContentV1(map);
//            boolean signVerified = aliPayHelper.CheckSignIn(sign, content);
//
//            // check order status
//            // 这里在DB中检查order的状态，如果已经支付成功，无需再次验证。
//            if(从DB中拿到order，并且判断order是否支付成功过){
//                log.info("订单：" + tradeNo + " 已经支付成功，无需再次验证。");
//                return "success";
//            }
//
//            //验证业务数据是否一致
//            if(!checkData(map, order)){
//                log.error("返回业务数据验证失败，订单：" + tradeNo );
//                return "返回业务数据验证失败";
//            }
//            //签名验证成功
//            if(signVerified){
//                log.info("支付宝签名验证成功，订单：" + tradeNo);
//                // 验证支付状态
//                String tradeStatus = request.getParameter("trade_status");
//                if(tradeStatus.equals("TRADE_SUCCESS")){
//                    log.info("支付成功，订单："+tradeNo);
//			        // 更新订单状态，执行一些业务逻辑
//
//                    return "success";
//                }else{
//                    System.out.println("支付失败，订单：" + tradeNo );
//                    return "支付失败";
//                }
//            }else{
//                log.error("签名验证失败，订单：" + tradeNo );
//                return "签名验证失败.";
//            }
//        } catch (IOException e) {
//            log.error("IO exception happened ", e);
//            throw new RuntimeException(ResponseCode.INTERNAL_ERROR, e.getMessage());
//        }
//    }
//
//
//    public boolean checkData(Map<String, String> map, OrderInfo order) {
//        log.info("【请求开始-交易回调-订单确认】*********校验订单确认开始*********");
//
//        //验证订单号是否准确，并且订单状态为待支付
//        if(验证订单号是否准确，并且订单状态为待支付){
//            float amount1 = Float.parseFloat(map.get("total_amount"));
//            float amount2 = (float) order.getOrderAmount();
//            //判断金额是否相等
//            if(amount1 == amount2){
//                //验证收款商户id是否一致
//                if(map.get("seller_id").equals(alipayConfig.getPid())){
//                    //判断appid是否一致
//                    if(map.get("app_id").equals(alipayConfig.getAppid())){
//                        log.info("【成功：请求开始-交易回调-订单确认】*********校验订单确认成功*********");
//                        return true;                    }
//                }
//            }
//        }
//        log.info("【失败：请求开始-交易回调-订单确认】*********校验订单确认失败*********");
//        return false;    }
//}
//
