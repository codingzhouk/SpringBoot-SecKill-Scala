package cn.edu.jxnu.seckill.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import cn.edu.jxnu.seckill.redis.RedisService
import cn.edu.jxnu.seckill.service.SeckillUserService
import org.springframework.ui.Model
import cn.edu.jxnu.seckill.domain.SeckillUser
import cn.edu.jxnu.seckill.result.Result

/**
 * 用户控制器
 *
 * @author 梦境迷离.
 * @time 2018年5月21日
 * @version v1.0
 */
@RestController
@RequestMapping(Array("/user"))
class UserController @Autowired() (userService: SeckillUserService,
    redisService: RedisService) {

    /**
     * QPS:366.6 1000 * 10
     */
    @RequestMapping(Array("/info"))
    def info(model: Model, user: SeckillUser): Result[SeckillUser] = {
        
        Result.success(user)
    }

}