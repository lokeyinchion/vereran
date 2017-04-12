package play.callback;

public class Remote {    
    
    /**  
     * 处理消息  
     * @param msg   接收的消息  
     * @param callBack  回调函数处理类  
     */    
    public void executeMessage(String msg,CallBack callBack)    
    {    
        /**模拟远程类正在处理其他事情，可能需要花费许多时间**/    
        for(int i=0;i<10;i++)
        	System.out.println(i);
        /**处理完其他事情，现在来处理消息**/
        System.out.println("Here is the message i get from Local:"); 
        System.out.println(msg);    
        System.out.println("I hava executed the message by Local");    
        /**执行回调**/    
        callBack.execute(new String[]{"I have addressed the msg~!"});  //这相当于同学执行完之后打电话给你  
    }    
        
}