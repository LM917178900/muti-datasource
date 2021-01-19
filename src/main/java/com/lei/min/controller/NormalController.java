package com.lei.min.controller;

import com.lei.min.model.ApiCode;
import com.lei.min.model.ApiResult;
import com.lei.min.model.SysTask;
import com.lei.min.service.INormalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: NormalController
 * @author: leiming5
 * @date: 2020-12-29 09:07
 */
@RestController
public class NormalController {

    /**
     * service 接口哦
     */
    @Resource
    private INormalService normalService;

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @GetMapping("normal/getById")
    public ApiResult getById(Long id) throws InterruptedException {

        Thread.sleep(3000);

        if (id == null) {
            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
        }

        return ApiResult.ok(normalService.getById(id));
    }

    @PostMapping("normal/postById")
    public ApiResult postById(@RequestBody Long id) throws InterruptedException {

        Thread.sleep(3000);

        if (id == null) {
            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
        }

        return ApiResult.ok(normalService.getById(id));
    }

    @PostMapping("normal/postByTask")
    public ApiResult postById(@RequestBody SysTask sysTask) throws InterruptedException {

        Thread.sleep(3000);

        Long id = sysTask.getId();

        if (id == null) {
            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
        }

        return ApiResult.ok(normalService.getById(id));
    }

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @GetMapping("normal/getByMap")
    public ApiResult getByMap(Long id) throws InterruptedException {

        Thread.sleep(9000);

        if (id == null) {
            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
        }


        return ApiResult.ok(normalService.getByMap(id));
    }
}
