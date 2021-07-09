
public class Test {
    public static void main(String[] args) {
        CMUtility test = new CMUtility();
        CustomerList list = new CustomerList();//增加list表
        CustomerView ui = new CustomerView();
        CMUtility function = new CMUtility();
        test.addmem(list,"张强强",20,"1822497904@qq.com","13297029683","男");

        int num=1;
        while (num != 5) {
        ui.mainUI();
        num = ui.addOpUI();
        if (num <= 4 && num >= 0) {
            int m = 1;
            if (num == 1) {
                function.addmem(list, ui.addName(), ui.addAge(), ui.addEmail(), ui.addphone(), test.addsex(ui, ui.addSex()));//增加客户
                ui.addUI(list.getList(list.getNumberOfCustomers()-1).getName(),list.getList(list.getNumberOfCustomers()-1).getAge(),
                        list.getList(list.getNumberOfCustomers()-1).getEmail(),list.getList(list.getNumberOfCustomers()-1).getPhone(),
                        list.getList(list.getNumberOfCustomers()-1).getSex());
                System.out.println(list.getList(0).getName());
            }
            else if(num==2) {
                function.chgmem(list, test.ifsermem(list,ui,test.ifsermem(list,ui,test.sermem(list, ui.addName()))),
                        ui.addName(), ui.addAge(), ui.addEmail(), ui.addphone(), test.addsex(ui, ui.addSex()));//更改指定客户内容
                System.out.println(list.getList(0).getName());
            }
            else if(num==3){
                function.delmem(list,test.ifsermem(list,ui,test.sermem(list, ui.addName())));//删除指定客户
                ui.Delsc();

            }
            else if(num==4){
                ui.listUI(list);
                ui.goon();
            }
            else if(num==5);
            else ui.pblm();
        }
        }
        }
}

