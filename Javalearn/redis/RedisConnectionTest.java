package redis;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

public class RedisConnectionTest {

    private RedisConnection redisConnection;

     void before(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //设置 redis 连接池最大连接数量
        jedisPoolConfig.setMaxTotal(50);
        //设置 redis 连接池最大空闲连接数量
        jedisPoolConfig.setMaxIdle(10);
        //设置 redis 连接池最小空闲连接数量
        jedisPoolConfig.setMinIdle(1);
        redisConnection = new RedisConnection();
        redisConnection.setIp("122.51.175.157");
        redisConnection.setPort(6379);
        redisConnection.setPwd("QNPqqC8g4i.wp2n");
        redisConnection.setClientName(Thread.currentThread().getName());
        redisConnection.setTimeOut(600);
        redisConnection.setJedisPoolConfig(jedisPoolConfig);
    }

    @Test
    @DisplayName("redis的get set")
    void run(){
        before();
        try (Jedis jedis = redisConnection.getJedis()) {
            jedis.select(1);
            jedis.set("name", "grace");
            System.out.println(jedis.get("name"));
        }
    }

}
