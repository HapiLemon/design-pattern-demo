package event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author keminfeng
 * @date 2022-02-23 16:17
 */
public class Event {

    /**
     * 委托的方法名称
     */
    private String methodName;

    /**
     * 委托者
     */
    private Object targetObj;

    /**
     * 参数类型
     */
    private Class[] paramsType;

    /**
     * 方法参数
     */
    private Object[] params;

    public Event(String methodName, Object targetObj, Object[] params) {
        this.methodName = methodName;
        this.targetObj = targetObj;
        this.params = params;
        if (null != params) {
            createParamsByClass();
        }
    }

    /**
     * 获取方法参数的类型
     */
    private void createParamsByClass() {
        this.paramsType = new Class[this.params.length];
        for (int i = 0; i < this.params.length; i++) {
            this.paramsType[i] = this.params[i].getClass();
        }
    }

    /**
     * 反射执行方法
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = targetObj.getClass().getMethod(this.methodName, this.paramsType);
        method.invoke(targetObj, params);
    } 
}
