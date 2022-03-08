package book;

import book.state.ForenoonState;

/**
 * @author keminfeng
 * @date 2022-03-07 17:26
 */
public class Client {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.setFinish(false);
        work.setState(new ForenoonState());
        work.writeProgram();

        for (int i = 10; i <= 23; i++) {
            work.setHour(i);
            // 17点完成任务
            work.setFinish(i == 21 || work.isFinish());
            work.writeProgram();
        }
    }
}
