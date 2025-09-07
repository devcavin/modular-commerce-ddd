package dev.killercavin.sbdatajdbc

import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findByEmail(email: String): UserResponse? {
        return userRepository.findUserByEmail(email)?.toUserResponse()
    }

    fun allUsers(): List<UserResponse?> {
        return userRepository.findAll().map { it.toUserResponse() }
    }
}