package zhujie;


import java.lang.reflect.Method;

public class BankService {

    /**
     * 注解用来提供元数据
     * @param money
     */
    @BankTransferMoney(maxMoney = 15000)
    public static void transferMoney(double money){
        //判断注解转账是否成功
        System.out.println(processAnnotationMoney(money));
    }


    private static String processAnnotationMoney(double money) {

        try{
            final Method transferMoney = BankService.class.getDeclaredMethod("transferMoney", double.class);
            final boolean annotationPresent = transferMoney.isAnnotationPresent(BankTransferMoney.class);
            if(annotationPresent){
                final BankTransferMoney annotation = transferMoney.getAnnotation(BankTransferMoney.class);
                if(money>annotation.maxMoney()){
                    return "失败";
                }else {
                    return "成功";
                }
            }
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
        return "失败";
    }


    public static void main(String[] args) {
        transferMoney(50000);
    }

}
