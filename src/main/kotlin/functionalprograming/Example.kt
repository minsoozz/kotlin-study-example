package functionalprograming

class Example {
    fun main() {
        val persons = listOf(Person("민수"), Person("수민", age = 100))
        persons.maxByOrNull { it.age ?: 0 }
        findPerson { it.name == "Alice" }
    }

    private fun findPerson(function: (Person) -> Boolean): Boolean {
        return function.equals("Alice")
    }
}

