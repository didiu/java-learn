package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisConnection {


    //连接池配置
    private JedisPoolConfig jedisPoolConfig;
    //ip
    private String ip;
    private Integer port;
    //redis 服务器密码
    private String pwd;
    private Integer timeOut;
    private JedisPool jedisPool;
    private String clientName=null;
     void setIp(String ip) {
        this.ip = ip;
    }

     void setPort(Integer port) {
        this.port = port;
    }

     void setPwd(String pwd) {
        this.pwd = pwd;
    }

     void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

     void setJedisPoolConfig(JedisPoolConfig jedisPoolConfig) {
        this.jedisPoolConfig = jedisPoolConfig;
    }

     void setClientName(String clientName) {
        this.clientName = clientName;
    }

   private void buildConnection(){
        if(jedisPool==null){
            jedisPool=new JedisPool(new JedisPoolConfig(),ip,port,timeOut,pwd,0,clientName);
        }else{
            jedisPool = new JedisPool(jedisPoolConfig, ip, port, timeOut, pwd, 0, clientName);
        }
   }

   public Jedis getJedis(){
        buildConnection();
        if(jedisPool!=null){
            return jedisPool.getResource();
        }
        return null;
   }


}
