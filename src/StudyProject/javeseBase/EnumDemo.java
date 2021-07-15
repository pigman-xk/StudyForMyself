package StudyProject.javeseBase;

public enum EnumDemo {
    LOW("低级"),MID("中级"),HIGH("高级"); //已定义好的实例 该实例有如下属性name，有如下方法 show（）
                                                         // 使用EnumDemo.LOW就是一个已创建好的实例，有如上方法 LOW等同new EnumDemo，传入"低级"实参

    private String name; //属性

    EnumDemo(String name) { //构造器 无关键字 Default 这里的name 指定 LOW中的name，相同参数
        this.name = name;
    }

    public void show(){
        System.out.println(this.name);
    }
}
