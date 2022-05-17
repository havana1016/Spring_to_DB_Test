package testDB;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testC {
    @Autowired
    SqlSessionTemplate sql;

    @GetMapping("/")
    String a(){
        return ("datasavetest");
    }
    @GetMapping("/save")
    void b(@RequestParam("name1")String id1,@RequestParam("name2")String id2){
        sql.insert("data.savedb",id1);
    }

}
