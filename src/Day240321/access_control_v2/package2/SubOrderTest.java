package Day240321.access_control_v2.package2;

import Day240321.access_control_v2.package1.Order;

public class SubOrderTest extends Order { // extends SubOrder
    public void test() {
        SubOrder subOrder = new SubOrder();

        //subOrder.orderProtected = 0;

//        subOrder.methodProtected();
    }
}