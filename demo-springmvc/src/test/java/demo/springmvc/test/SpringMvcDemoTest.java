package demo.springmvc.test;

import demo.springmvc.config.DispatcherServletInitializer;
import demo.springmvc.web.Demo2Controller;
import demo.springmvc.web.DemoController;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.net.URI;

/**
 * @author LiPengJu
 * @date 2018/9/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DispatcherServletInitializer.class})
public class SpringMvcDemoTest {

    @Test
    public void test() throws Exception {
        Demo2Controller demo2Controller = new Demo2Controller();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(demo2Controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/demo2/test"))
                .andExpect(MockMvcResultMatchers.content().string("demo2 test"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
    @Test
    public void test2() throws Exception {
        DemoController controller=new DemoController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/demo/test"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
