package com.cf.bootssm.controller;

import com.cf.bootssm.bean.CProject;
import com.cf.bootssm.service.serviceImpl.CProjectService;
import com.cf.bootssm.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.naming.spi.DirStateFactory;
import javax.xml.transform.Result;

@RestController
    @EnableAutoConfiguration
    @RequestMapping("/testboot")
    public class CProjectController {

        @Autowired
        private  CProjectService cProjectService;

        @Autowired
        private RedisTemplate<Object,Object> redisTemplate;

        @RequestMapping("getproject")
        public CProject getPjt(String id){
            CProject cProject = (CProject)redisTemplate.opsForValue().get("project");
           // System.out.println(cProject.getId()+"*********"+id);
           // System.out.println(cProject == null || !cProject.getId().equals(id) );
            if(cProject == null || !cProject.getId().equals(id)){
                System.out.println("从新加载");
                cProject = cProjectService.Sel(id);
                redisTemplate.opsForValue().set("project",cProject);
            }

            return cProject;
        }

    @RequestMapping ( value = "/check", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public JsonResult check () {
        JsonResult jsonResult = new JsonResult();

        jsonResult.setMessage("SSM vue前后端框架搭建成功");
        return jsonResult;
    }






}
