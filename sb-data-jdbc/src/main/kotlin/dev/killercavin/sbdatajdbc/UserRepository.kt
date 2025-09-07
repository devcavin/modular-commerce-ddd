package dev.killercavin.sbdatajdbc

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface UserRepository: CrudRepository<User, Long> {
    // custom query
    @Query("SELECT GRAVATAR_URL FROM USERS WHERE EMAIL = :email")
    fun getGravatarUrlByEmail(@Param("email") email: String): String?

    fun findUserByEmail(email: String): User?
}