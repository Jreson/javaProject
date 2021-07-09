public class CMUtility {
    //增删改查功能
    //添加成员

    public void addmem(CustomerList list,String name,int age,String email,String phone,String sex){//增加元素个数
        list.addlist(new Customer(name,age,email,phone,sex));
    }
    public void delmem(CustomerList list,int num){//删除指定客户
        list.minuslist(num);
    }
    public void chgmem(CustomerList list,int num,String name,int age,String email,String phone,String sex){//更改指定客户内容
        Customer mem=new Customer(name,age,email,phone,sex);
        list.setList(num,mem);
    }
    public int sermem(CustomerList list,String name){//根据客户的名字查找客户信息,返回客户在表中的位置（int），否则返回负数
        int i=0;
        while(i<list.getNumberOfCustomers()){

            if(list.getList(i).getName().equals(name))
            {
                return i;
            }
            i++;
        }
        return -1;
    }
    public int ifsermem(CustomerList list,CustomerView ui,int num){
        int tmp=1;
        while(tmp!=0){
        if(num>=0){
            System.out.println("查找成功");
            tmp=0;

        }
        else{
            System.out.println("未找到，请重新输入");
            sermem(list,ui.addName()); }
        }
        return num;
    }

    public String addsex(CustomerView ui,int sex){//添加性别的实现
        String tmp_sex="null";
        boolean tmp=true;
        while(tmp){
            if(sex==1){
                tmp_sex="男";
                tmp=false;
            }
            else if(sex==2){
                tmp_sex="女";
                tmp=false;
            }
            else {ui.pblm();sex=ui.addSex();};
        }
        return tmp_sex;
    }
}


