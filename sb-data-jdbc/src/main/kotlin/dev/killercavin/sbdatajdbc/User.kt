package dev.killercavin.sbdatajdbc

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table

@Table("USERS")
data class User(
    @Id
    val id: Long? = null,
    val email: String,
    val name: String,
    val gravatarUrl: String? = null,
    val hashedPassword: String,
    @MappedCollection(idColumn = "USER_ID")
    val userRoles: Set<UserRoleEntity> = emptySet(),
    val active: Boolean = false
)

@Table("USER_ROLES")
data class UserRoleEntity(
    val role: UserRole,
    @Id val id: Long? = null
)

data class UserResponse(
    val id: Long,
    val email: String,
    val name: String,
    val roles: List<UserRole>
)

fun User.toUserResponse() = UserResponse(
    id = this.id!!,
    email = this.email,
    name = this.name,
    roles = this.userRoles.map { it.role }
)




