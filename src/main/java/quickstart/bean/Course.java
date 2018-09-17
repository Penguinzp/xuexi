package quickstart.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zpp on 2018/9/3.
 */
@Component
public class Course {
   @Resource(name = "student")
   private Student student;

   @Resource(name = "teacher")
    private Teacher teacher;

    @Override
    public String toString() {
        return "Course{" +
                "学生：" + student +
                ", 老师：" + teacher +
                '}';
    }
}
