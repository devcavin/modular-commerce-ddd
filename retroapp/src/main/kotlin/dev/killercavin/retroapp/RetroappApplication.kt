package dev.killercavin.retroapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RetroappApplication

fun main(args: Array<String>) {
	runApplication<RetroappApplication>(*args)
}
