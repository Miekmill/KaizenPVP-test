package org.runestar.cs2.ir

import org.runestar.cs2.type.Trigger

class CallGraph {

//    val graph = LinkedGraph<Int>()

    val triggers = HashMap<Int, Trigger>()

    fun call(from: Int, to: Int, trigger: Trigger) {
        triggers[to] = trigger
//        graph.addSuccessor(from, to)
    }
}
