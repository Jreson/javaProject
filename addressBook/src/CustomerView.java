import java.util.Scanner;

public class CustomerView {
    Scanner scan=new Scanner(System.in);
    //1.添加客户 2.修改客户 3.删除客户 4.客户列表 5.退出
    public void mainUI(){
        System.out.printf("-------客户信息管理软件-------\n\n" +"\t\t"+
                "1.添加客户\n\t\t2.修改客户\n\t\t3.删除客户\n\t\t4.客户列表\n\t\t5.退出\n");
    }
    public int addOpUI(){
        System.out.print("        请选择(1-5):");
        int num;
        num=scan.nextInt();
        return num;
    }
    public void pblm(){
        System.out.println("请输入正确的数字");
    }
    public void addUI(String name,int age,String email,String phone,String sex){
        System.out.printf("----------添加客户----------\n"+
                "姓名:"+name+"\n性别:"+sex+"\n年龄:"+age+"\n电话:"+phone+"\n邮箱:"+email+"\n");
        System.out.printf("----------添加完成----------\n");
    }
    public String addName(){
        System.out.print("请输入客户的姓名：");
        String name=scan.next();
        return name;
    }
    public int addSex(){
        System.out.print("请输入客户的性别(1.男 2.女)：");
        int sex=scan.nextInt();
        return sex;
    }
    public int addAge() {
        System.out.print("请输入客户的年龄:");
        int age=0;
        boolean tmp=true;
        while(tmp){
        age = scan.nextInt();
        if(age>0&&age<100)
        tmp=false;
        else pblm();}
        return age;
    }
    public String addphone(){
        System.out.print("请输入客户的电话:");
        String phone= scan.next();
        return phone;
    }
    public String addEmail(){
        System.out.print("请输入客户的邮箱：");
        String Email=scan.next();
        return Email;
    }
    public void Delsc(){
        System.out.println("删除成功");
    }
    public void listUI(CustomerList list){
        System.out.println("-----------------------------客户列表-----------------------------");
        System.out.println("序号  姓名     年龄                邮箱              电话        性别");
        int i=0;
        while (list.getList()[i]!=null){
         System.out.printf("%-5d%-7s%-13d%-20s%-16s%-1s\n",i+1,list.getList(i).getName(),list.getList(i).getAge(),list.getList(i).getEmail()
         ,list.getList(i).getPhone(),list.getList(i).getSex());i++;}
    }
    public void goon(){
        System.out.println("---------------------输入任意字符加回车跳回主菜单---------------------");
        String tmp=scan.next();
    }

}
