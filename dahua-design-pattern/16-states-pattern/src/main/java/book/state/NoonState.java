package book.state;

import book.Work;

/**
 * @author keminfeng
 * @date 2022-03-07 17:19
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间" + work.getHour() + "点。干饭午休");
        }else {
            work.setState(new AfterNoonState());
            work.writeProgram();
        }
    }
}
