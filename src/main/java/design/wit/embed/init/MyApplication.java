package design.wit.embed.init;

import design.wit.embed.Application;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/8
 * @Time: 17:11
 * @Description: No Description
 */
public class MyApplication {
    private static final Integer PORT = 8080;
    public static void run(){
        try {
            String dir = System.getProperty("user.dir");
            Tomcat tomcat = new Tomcat();
            //设置端口
            tomcat.setPort(PORT);
            //设置工作目录
            tomcat.setBaseDir(dir);
            Context context = tomcat.addContext("", Application.class.getResource("/").getPath().replaceAll("%20", " "));
            //监听
            context.addLifecycleListener((LifecycleListener) Class.forName(tomcat.getHost().getConfigClass()).newInstance());
            tomcat.start();
            //只有shutdown才会返回
            tomcat.getServer().await();
        } catch (LifecycleException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
