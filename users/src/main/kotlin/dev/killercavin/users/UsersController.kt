package dev.killercavin.users

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/users")
class UsersController(private val userService: UserService) {

    @GetMapping
    fun getUsers() = userService.getUsers()

    @GetMapping("/email/{email}")
    fun getUserByEmail(@PathVariable email: String) =
        userService.getUser(email) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)

    @DeleteMapping("/delete/{email}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable email: String) {
        if (userService.deleteUser(email) == null) throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addUser(email: String, @RequestBody user: User) = userService.addUser(email, user)

    @PutMapping("/update/{email}")
    fun modifyUser(@PathVariable email: String, @RequestBody user: User) =
        userService.modifyUser(email, user) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
}