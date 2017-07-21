package com.kotlin.领域特定语言

/**
 * Created by Lin Change on 2017-07-17.
 */
open class Tag(val name: String): Node { //标签类
    val children = ArrayList<Node>() //子节点列表

    val properties = HashMap<String, String>() //属性

    //字符串拓展方法，使用方式 "属性名"("属性值") ,如："id"("htmlId")
    operator fun String.invoke(value: String) {
        properties[this] = value //this表示字符串本身，value表示构造器中传入的值
    }

    //字符串拓展方法，使用方式 "属性名"("属性值") ,如："head"{ }
    //此处的参数block表示一个（参数为Tag的拓展函数、无返回值的）函数
    operator fun String.invoke(block: Tag.() -> Unit) {
        children.add(Tag(this).apply(block)) //使用apply调用block函数后返回Tag自身
    }

    //字符串拓展方法，一元运算符重载
    operator fun String.unaryPlus() {
        children.add(StringNode(this)) //将字符串节点添加到子节点列表
    }

    //加法重载，用于添加节点
    operator fun plus(node: Node) {
        children.add(node) //将节点添加到子节点列表
    }

    //<html id="htmlid" style=""><head></head> <body></body> </html>
    override fun render(): String {
        return StringBuilder()
                .append("<") //添加左尖括号
                .append(name) //添加标签的名字
                .let { stringBuilder -> //对StringBuilder进行html节点的设置
                    if (!this.properties.isEmpty()) { //当标签属性不为空
                        stringBuilder.append(" ") //添加空格
                        this.properties.forEach { //遍历属性
                            stringBuilder.append(it.key) //添加属性名
                                    .append("=\"") //添加等于号和左引号
                                    .append(it.value) //添加属性的值
                                    .append("\" ") //加添右引号和空格
                        }
                    }
                    stringBuilder //将设置完成后的stringBuilder作为返回值
                }
                .append(">") //添加右尖括号
                .let { stringBuilder ->  //对StringBuilder进行子节点的设置
                    children.map(Node::render) //将子节点转换成Node类型的列表
                            .map(stringBuilder::append) //用append方法把Node类型的列表连接起来
                    stringBuilder //将设置完成后的stringBuilder作为返回值
                }
                .append("</$name>") //添加右边标签信息
                .toString() //将stringBuilder转换成字符串
    }
}