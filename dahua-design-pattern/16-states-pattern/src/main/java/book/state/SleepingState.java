package book.state;

import book.Work;

/**
 * @author keminfeng
 * @date 2022-03-07 17:24
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间" + work.getHour() + "点。顶不住了，睡着了");
    }
}
