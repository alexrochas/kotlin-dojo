package test.kotlin

import main.kotlin.Greeter
import main.kotlin.KotlinGreetingJoiner
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test as test

class TestSource() {
    @test fun f() {
        val example : KotlinGreetingJoiner = KotlinGreetingJoiner(Greeter("Hi"))
        example.addName("Harry")
        example.addName("Ron")
        example.addName(null)
        example.addName("Hermione")

        assertEquals(example.getJoinedGreeting(), "Hi Harry and Ron and Hermione")
    }
}
