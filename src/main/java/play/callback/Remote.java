package play.callback;

public class Remote {    
    
    /**  
     * ������Ϣ  
     * @param msg   ���յ���Ϣ  
     * @param callBack  �ص�����������  
     */    
    public void executeMessage(String msg,CallBack callBack)    
    {    
        /**ģ��Զ�������ڴ����������飬������Ҫ�������ʱ��**/    
        for(int i=0;i<10;i++)
        	System.out.println(i);
        /**�������������飬������������Ϣ**/
        System.out.println("Here is the message i get from Local:"); 
        System.out.println(msg);    
        System.out.println("I hava executed the message by Local");    
        /**ִ�лص�**/    
        callBack.execute(new String[]{"I have addressed the msg~!"});  //���൱��ͬѧִ����֮���绰����  
    }    
        
}