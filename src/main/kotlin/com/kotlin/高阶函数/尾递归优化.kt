package com.kotlin.高阶函数

/**
 * Created by Lin Change on 2017-07-16.
 */
/**
 * 尾递归优化
 * 1.调用自身后无其他操作的递归叫尾递归
 * 2.使用tailrec关键字提示编译器尾递归优化，可大幅度加快运行效率，只适用于尾递归的情况
 */
data class ListNode(val value: Int, var next: ListNode? = null) //链表结点

tailrec fun findListNode(head: ListNode?, value: Int): ListNode? { //根据传入的值查找节点
    head ?: return null //如果头结点为空，返回null
    if (head.value == value) return head //如果头结点的值等于传入的值，返回头结点
    //如果未查到，将头结点的下一个结点和要查找的值传入函数本身，继续查找
    return findListNode(head.next, value)
}

fun main(args: Array<String>) {
    val MAX_NODE_COUNT = 100000
    val head = ListNode(0)
    var p = head
    for (i in 1..MAX_NODE_COUNT) {
        p.next = ListNode(i)
        p = p.next!!
    }

    println(findListNode(head, MAX_NODE_COUNT - 2)?.value)
}

fun factorial(n: Long): Long { //求阶乘
    return n * factorial(n - 1)
}

data class TreeNode(val value: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun findTreeNode(root: TreeNode?, value: Int): TreeNode? {
    root ?: return null
    if (root.value == value) return root
    return findTreeNode(root.left, value) ?: return findTreeNode(root.right, value)
}