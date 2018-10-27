package bootserv.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import bootserv.entity.Girl;
import bootserv.service.GirlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sultan on 2018/4/3.
 */
@Controller
public class GirlController {
    @Resource(name="girlServiceImpl")
    private GirlService girlSev;
    @RequestMapping(value="/mysqlTest", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object HelloController(@RequestParam String test) {
        System.out.println("*******spring boot mysqlTest Gitchange*******");
        List<Girl> list = girlSev.findByCupSize(36);
        for(Girl g : list){
            System.out.println(g.getName()+"/"+g.getCupSize()+"/"+test);
        }
        JSONArray obj = (JSONArray)JSONObject.toJSON(list);
        return obj;
    }

    @RequestMapping(value="/trsacUpdate", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String trsacUpdate() {
        System.out.println("*******spring boot trsacUpdate*******");
	    	/*Girl girl = girlSev.findById(3L);
	    	girl.setName("God Bless You");*/
        Girl g = girlSev.updateById();
        //System.out.println("修改后："+g.getName());
        return "{\"data\":\""+g+"\"}";
    }

    @RequestMapping(value="/trsacRead", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String trsacRead() {
        System.out.println("*******spring boot trsacRead*******");
        Girl girl = girlSev.findById(3L);
        //System.out.println(girl.getName());
        return "trsacRead success ";
    }

    @RequestMapping(value="/gitTest", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String gitTest() {
        System.out.println("*******spring boot gitTest*******");
        return "testGit success ";
    }

    @RequestMapping(value="/gitTest1", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String gitTest1() {
        System.out.println("*******spring boot gitTest*******");
        Girl girl = girlSev.daoTest();
        return "gitTest success ";
    }

    @RequestMapping(value="/index", method={RequestMethod.GET, RequestMethod.POST})
    public String index() {
        System.out.println("*******spring boot gitTest*******");
        ModelAndView mv = new ModelAndView();
        mv.addObject("test","testValue");
        return "/index";
    }

}
