package book.state;

import book.Work;

/**
 * @author keminfeng
 * @date 2022-03-07 17:35
 */
public class ForceRestState extends State {

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间" + work.getHour() + "点。强制下班");
    }
}
