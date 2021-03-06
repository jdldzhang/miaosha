package com.zld.mall.result;

/**
 * 描述：code状态的封装类
 *
 * @author lida
 * @time 2019/8/13 21:15
 */
public class CodeMsg {
    private int code;
    private String msg;

    //通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(500101, "参数校验异常:%s");
    //登录模块 5002XX
    public static CodeMsg SESSION_ERROR = new CodeMsg(500210, "Session不存在或已失效");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg(500212, "手机号不能为空");
    public static CodeMsg MOBILE_ERROR = new CodeMsg(500213, "手机号格式错误");
    public static CodeMsg MOBILE_NOTEXEITS = new CodeMsg(500214, "手机号不存在");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(500215, "密码错误");
    //商品模块 5003XX

    //订单模块 5004XX

    //秒杀模块 5005XX
    public static CodeMsg MIAO_SHA_ERROR = new CodeMsg(500500, "库存不足，秒杀失败");
    public static CodeMsg REPEATE_MIAOSHA = new CodeMsg(500501, "操作失败，重复秒杀");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

    public CodeMsg fillArgs(Object... args){
        int code = this.code;
        String message = String.format(this.msg,args);
        return new CodeMsg(code, message);
    }



    @Override
    public String toString(){
        return "CodeMsg [code=" + code + ",msg=" + msg + "]";
    }
}
