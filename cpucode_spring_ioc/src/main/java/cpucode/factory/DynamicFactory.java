package cpucode.factory;

import cpucode.dao.UserDao;
import cpucode.dao.impl.UserDaoImpl;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 12:46
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        System.out.println("DynamicFactory 调用 getUserDao");

        return new UserDaoImpl();
    }
}
