package com.rheuijer.quoterino

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class QuoterinoApplication

fun main(args: Array<String>) {
    SpringApplication.run(QuoterinoApplication::class.java, *args)
}
