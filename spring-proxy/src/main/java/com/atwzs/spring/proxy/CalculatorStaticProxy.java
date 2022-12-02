package com.atwzs.spring.proxy;

/**
 * @ClassName CalculatorStaticProxy
 * @Description
 * @Author WangZhisheng
 * @Date 15:50 2022/11/13
 * @Version 11.0.15
 */
public class CalculatorStaticProxy implements Calculator{

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        int addResult = 0;
        try {
            // 附加功能由代理类中的代理方法来实现
            System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
            // 通过目标对象来实现核心业务逻辑
            addResult = target.add(i, j);
            System.out.println("[日志] add 方法结束了，结果是：" + addResult);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
        // 通过目标对象来实现核心业务逻辑
        int addResult = target.sub(i, j);
        System.out.println("[日志] sub 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int mul(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
        // 通过目标对象来实现核心业务逻辑
        int addResult = target.mul(i, j);
        System.out.println("[日志] mul 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int div(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        // 通过目标对象来实现核心业务逻辑
        int addResult = target.div(i, j);
        System.out.println("[日志] div 方法结束了，结果是：" + addResult);
        return addResult;
    }
}
