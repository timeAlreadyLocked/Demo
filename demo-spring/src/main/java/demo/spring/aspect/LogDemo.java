package demo.spring.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;


/**
 * @author LiPengJu
 * @date 2018/9/2
 */
@Aspect
public class LogDemo {
    static Logger logger = Logger.getLogger(LogDemo.class);

    @Pointcut("execution(* demo.spring.service.ShoppingCarService.*(..))")
    public void test() {
    }

    @Around("test()")
    public void before(ProceedingJoinPoint point) {
        out.println(point.getTarget().getClass());
        Class targetClazz = point.getTarget().getClass();
        String name = point.getSignature().getName();
        logger.info(targetClazz.getName() + "类的" + name + "方法开始执行******start******");
        List<String> args = new ArrayList<String>();
        for (Object o : point.getArgs()) {
            if(o instanceof String){
                args.add(String.valueOf(o));
            }else if(o instanceof Integer){
                args.add(Integer.valueOf(o.toString()).toString());
            }
        }
        logger.info("参数：" + args.toString());
        try {
            point.proceed();
            logger.info(targetClazz.getName() + "类的" + name + "方法执行结束******end******");
        } catch (Throwable throwable) {
//            throwable.printStackTrace();
            logger.info(targetClazz.getName() + "类的" + name + "方法执行错误******exception******" + throwable);
        }
    }
}
