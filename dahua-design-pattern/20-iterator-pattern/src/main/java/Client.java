/**
 * @author keminfeng
 * @date 2022-03-10 18:06
 */
public class Client {
    public static void main(String[] args) {
        // 人们上车
        Bus bus = new Bus();
        bus.add("路人A");
        bus.add("路人B");
        bus.add("带大件行李的人");
        bus.add("行李");
        bus.add("公交公司员工");
        bus.add("小偷");
        bus.add("被偷手机的女人");

        // 票务员开始收钱
        Iterator ticketSeller = bus.iterator();

        while (ticketSeller.hasNext()) {
            Object ticketBuyer = ticketSeller.next();
            System.out.println(ticketBuyer + "请买票");
            if ("小偷".equals(ticketBuyer)) {
                System.out.println("发现小偷，小偷要跳车了，暂停卖票");
                break;
            }
            System.out.println(ticketBuyer + "买了票了");
        }

        // remove后 迭代器里的集合也被 remove 了一个
        bus.remove("小偷");

        System.out.println("小偷跳车跑了，继续卖票");

        while (ticketSeller.hasNext()) {
            Object ticketBuyer = ticketSeller.next();
            System.out.println(ticketBuyer + "请买票");
            if ("小偷".equals(ticketBuyer)) {
                System.out.println("发现小偷，小偷要跳车了，暂停卖票");
                break;
            }
            System.out.println(ticketBuyer + "买了票了");
        }
    }
}
