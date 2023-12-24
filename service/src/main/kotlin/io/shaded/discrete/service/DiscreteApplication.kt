package io.shaded.discrete.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiscreteApplication

fun main(args: Array<String>) {
	runApplication<DiscreteApplication>(*args)
}
