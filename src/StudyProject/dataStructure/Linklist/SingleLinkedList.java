package StudyProject.dataStructure.Linklist;

public class SingleLinkedList {
    public static void main(String[] args) {
        //测试
        //创建结点
        HeroNode heroNode1 = new HeroNode(1,"宋江","及时雨");
        HeroNode heroNode2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode heroNode3 = new HeroNode(3,"吴用","智多星");

        SingleLinkedListClass singleLinkedListClass = new SingleLinkedListClass();
        singleLinkedListClass.addByOrder(heroNode2);
        singleLinkedListClass.addByOrder(heroNode1);
        singleLinkedListClass.addByOrder(heroNode3);
        singleLinkedListClass.addByOrder(heroNode3);


        singleLinkedListClass.list();

        //测试修改

        HeroNode newHeroNode = new HeroNode(2,"小路","玉麒麟~~");

        singleLinkedListClass.update(newHeroNode);
        singleLinkedListClass.list();

        singleLinkedListClass.del(1);
        singleLinkedListClass.list();

    }

}
//d定义一个LinkedList管理英雄
class SingleLinkedListClass{
    //初始化一个头结点
    private HeroNode head = new HeroNode();

    //添加结点到单向链表
    //当不考虑编号循序，找到链表最后的结点，然后指向最新的结点即可
    public void add(HeroNode heroNode){
        //因为head结点不能动，所以我们需要一个辅助结点
        HeroNode temp = head;
        //遍历结点找到最后
        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        //退出while循环，temp指向链表最后
        temp.next=heroNode;
    }

    //根据no来进行插入，若已存在则添加失败并提示
    public void addByOrder(HeroNode heroNode){
         //因为单链表，因为我们找temp是位于添加位置的前一个结点，否则插入不了
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if (temp.next==null){
                break;
            }
            if(temp.next.no>heroNode.no){//如果temp后一个结点no大于新的节点，则找到位置
                break;
            }
            else if(temp.next.no == heroNode.no){//说明编号存在
                flag = true;
                break;
            }
            temp = temp.next;//后移
        }

        if (flag){//编号存在了，添加失败
            System.out.printf("添加英雄编号%d已经存在，添加失败\n",heroNode.no);
            return;
        }
        heroNode.next=temp.next;
        temp.next=heroNode;

    }

    //根据编号来修改，即no不能改
    public void  update(HeroNode heroNode){
        boolean flag=false;
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if (temp==null){
                break;
            }
            if(temp.no==heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name = heroNode.name;
            temp.nickname= heroNode.nickname;
        }else {//没有找到信息
            System.out.printf("没有找到编号为%d的节点，不能修改\n",heroNode.no);
        }
    }

    public void del(int no ){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if (temp.next==null){
                break;
            }
            if(temp.next.no==no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            temp.next=temp.next.next;
        }
        else{
            System.out.printf("找不到编号为%d的英雄",no);
        }

    }

    //显示链表[遍历]
    public void list(){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while(true){
            //判断是否到链表最后
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }

}



class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(){
    }

    public HeroNode(int no,String name,String nickname){
        this.no=no;
        this.name=name;
        this.nickname=nickname;
    }

    //为了显示方法重写toString
    @Override
    public String toString(){
        return "HeroNode [no="+no+",name="+name+",nickname="+nickname+"]";
    }
}