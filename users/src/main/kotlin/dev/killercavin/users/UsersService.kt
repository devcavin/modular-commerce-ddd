package dev.killercavin.users

import org.springframework.stereotype.Service

@Service
class UserService {
    private val users = mutableMapOf(
        "user0@mail.com" to User("user0@mail.com", "User Zero"),
        "user1@mail.com" to User("user1@mail.com", "User One")
    )

    fun getUsers() = users
    fun getUser(email: String) = users[email]
    fun addUser(email: String, user: User) = users.put(email, user)
    fun deleteUser(email: String) = users.remove(email)
    fun modifyUser(email: String, user: User) = users.replace(email, user)
}
