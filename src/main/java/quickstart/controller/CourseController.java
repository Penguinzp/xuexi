package quickstart.controller;


import com.quickstart.bean.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zp on 2018/9/3.
 */
@RestController
public class CourseController {
    @Resource
    private Course course;

    @RequestMapping("/course")
    @ResponseBody
    public String getCourse(){

        return course.toString();
    }


}
