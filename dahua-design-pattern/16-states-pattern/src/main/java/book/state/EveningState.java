package book.state;

import book.Work;

/**
 * @author keminfeng
 * @date 2022-03-07 17:22
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
//            if (work.getHour() < 22) {
//            强制下班时间
            if (work.getHour() < 20) {
                System.out.println("当前时间" + work.getHour() + "点。加班哦，疲惫至极");
            } else {
//                work.setState(new state.SleepingState());
//                强制下班
                work.setState(new ForceRestState());
                work.writeProgram();
            }
        }
    }
}
