package com.skylaker.yunzhi.config;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyong
 * Date: 2018/5/20 14:46
 * Description:
 *      常量定义类
 */
public class GlobalConstant {
    //Redis数据结构名称定义
    //规则：REDIS_ + 结构类型_ + 业务含义
    //-------------------------------
    //已申请验证码手机号时间戳
    public static final String REDIS_HASH_PHONEVERCODE     = "Phone_Vercode_Time";
    //手机号与验证码 hash前缀
    public static final String REDIS_HASH_PHONEVERCODES = "PHONE_VERCODES";
    //已注册手机号
    public static final String REDIS_SET_HASREGISTERPHONE  = "HAS_REGISTER_PHONE";
    //问题时间戳信息
    public static final Object REDIS_ZSET_QUESTIONS_TIME = "QUESTIONS_TIME";
    //热门问题
    public static final Object REDIS_ZSET_QUESTIONS_HOT = "QUESTIONS_HOT";
    //问题对应的所有回答zset key名称后缀
    public static final String REDIS_ZSET_QUESTION_ANSWERS = "_Answers";


    //非业务型常量定义
    //-------------------------------
    //一分钟毫秒数
    public static final long ONE_MINUTE_MICRO_SECONDS = 60 * 1000;
    //密码加密次数
    public static final int PASSWORD_ENCRYPT_COUNT = 3;
    //密码加密算法
    public static final String PWD_MD5 = "md5";
    //用户session名称
    public static final Object SESSION_USER_NAME = "user";
    //每次加载最新问题数量
    public static final int QUESTIONS_NUM = 10;
    //热门指数最小值
    public static final double MIN_HOT_INDEX = Double.valueOf(1);
    //每次加载回答数量
    public static final Integer ANSWERS_NUM = 10;
    //用户点赞的回答
    public static final String STAR_ANSWERS = "_STAR_ANSWERS";
}