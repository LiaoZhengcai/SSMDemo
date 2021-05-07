import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.dao.OrdersMapper;
import com.ssm.dao.UserMapper;
import com.ssm.entity.Orders;
import com.ssm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Test
    public void test1(){
        List<User> userList = userMapper.findAll();
        for (User user:userList) {
            System.out.println(user.getId()+","+user.getUsername()+","+user.getPassword());
        }
    }

    @Test
    public void test2(){
        User user = new User();
        user.setUsername("user11");
        user.setPassword("888888");
        if (userMapper.addUser(user)){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }

    @Test
    public void test3(){
        if (userMapper.delUser(14)){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }

    @Test
    public void test4(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        if (userMapper.updateUser(user)){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }

    @Test
    public void test5() {
        User user = new User();
        user.setUsername("admin");
        System.out.println(userMapper.findByCondition(user));
    }

    @Test
    public void test6() {
        int[] ids = {1,2,3};
        List<User> userList = userMapper.findByIds(ids);
        for (User user:userList) {
            System.out.println(user.getId()+","+user.getUsername()+","+user.getPassword());
        }
    }

    @Test
    public void test7() {
        PageHelper.startPage(2,3);
        List<User> userList = userMapper.findAll();
        for (User user:userList) {
            System.out.println(user);
        }
        //获得与分页相关参数
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        System.out.println(pageInfo);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数："+pageInfo.getPageSize());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否是第一页："+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页："+pageInfo.isIsLastPage());
    }
    //////////////////////////////Orders/////////////////////////////////////////
    @Test
    public void test8(){
        List<Orders> orderList = ordersMapper.findOrder();
        for (Orders order:orderList) {
            System.out.println(order);
        }
    }

    @Test
    public void test9(){
        List<User> userList = userMapper.findUserOrder();
        for (User user:userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test10(){
        List<User> userList = userMapper.findUserRole();
        for (User user:userList) {
            System.out.println(user);
        }
    }
}
