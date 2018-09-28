package com.yunjae.functionspringkotlin

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.support.beans

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .initializers(beans {

                arrayOf(1,2,3,4).forEach {index ->
                    bean("runner${index}") {
                        ApplicationRunner {
                            println(index)
                        }
                    }

                }

                if (Math.random() > .5) {
                    bean {
                        ApplicationRunner {
                            println("hello world")
                        }
                    }
                }

                bean {
                    Bar()
                }
                bean {
                    val refToBar: Bar = ref<Bar>()
                    Foo(refToBar)
                }
            })
            .sources(FunctionSpringKotlinApplication::class.java)
            .run(*args)
}

class Bar

class Foo(val bar: Bar)