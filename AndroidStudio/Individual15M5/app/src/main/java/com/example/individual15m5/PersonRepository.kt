package com.example.individual15m5

class PersonRepository {
    fun getPersonList(): List<Person> {
        return listOf(
            Person("John", "Doe", 25),
            Person("Jane", "Smith", 30),
            Person("Michael", "Johnson", 22),
            Person("Emily", "Davis", 28)
        )
    }
}