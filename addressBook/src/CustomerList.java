import java.util.List;

public class CustomerList {
    private Customer[] list=new Customer[100];
    private int NumberOfCustomers;

    public Customer[] getList() {//返回当前表格
        Customer[] list = this.list;
        return list;
    }
    public Customer getList(int num){//返回num上的Customer
        return list[num];
    }

    public Customer getCustmer(int num) {//获得list的第num个customer元素
        return list[num];
    }

    public void setList(int num,Customer cus) {//将list的第n个元素更改
        this.list[num] = cus;
    }

    public int getNumberOfCustomers() {//获得成员数量
        return NumberOfCustomers;
    }
    public void addlist(Customer cus){
        list[NumberOfCustomers++]=cus;
    }
    public void minuslist(int num){
        while(list[num]!=null){
            list[num]=list[num+1];
            NumberOfCustomers--;
            num++;
        }
    }
}
