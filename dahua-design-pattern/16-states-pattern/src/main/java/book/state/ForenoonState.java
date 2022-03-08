package book.state;

import book.Work;

/**
 * @author keminfeng
 * @date 2022-03-07 17:14
 */
public class ForenoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间" + work.getHour() + "点。上午工作，精神百倍");
        }else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
