package play.callback;

public class Process {
	public <T> T process(String command, ProcessCallback<T> processor) {
        System.out.println("process start!");
        //
        //在这里做些处理，初始化处理
        //
        T t = null;
        if (command.equals("create user")) {
            t = processor.porcess(command); //在回调接口中进行进一步处理
 
        }
        return t;
    }
 
    public static void main(String args[]) {
 
        //命令
        String command = "create user";
        //根据我的命令创建一个回调接口
        //这个回调接口是根据命令创建的，可以实现多种命令的处理
        ProcessCallback<User> exec = new ProcessCallback<User>() {
            @Override
            public User porcess(String command) {
                System.out.println("接收到命令=" + command);
                User user = new User();
                user.setName("lkyx");
                user.setAccount("sdsdsd");
                return user;
            }
        };
        Process p = new Process();
        User user = p.process(command, exec);
        System.out.println(user.getName());
    }
}
