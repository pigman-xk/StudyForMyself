# StudyForMyself
成为java大神的点滴之路


2021.5.08：
           学习了equals的一些要点，以及instance是判断是某类型或者是某类型的子类。
           
           常量、对象实例化后的对象或存在的值调用的equals、空指针调用equals输出是不同的，前者会报错，后者不会
           而Object的equals是this==obj，比较内存地址
           
           str的equals（obj）先检验是否是obj两者的地址指向（字符串不可变类型，表明了地址确定不变）是否相同，相同返回True，不同则再判断是不是String类型的子类或者就是String类型
           （考虑到子类可能会对字符串的压缩改变编码格式utf-16，iso（Latin1），故要查看编码格式是否相同），
           是则转化为String格式，检验两者的编码格式然后分别用各自编码格式的equals方法再检验一遍是否相等，不等则进入最后的return false。
 
           而null中是没有任何equals方法的，故一定会报错。
           
           

2021.05.09：
