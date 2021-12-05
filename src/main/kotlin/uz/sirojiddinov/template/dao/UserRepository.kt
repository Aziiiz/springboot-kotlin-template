package uz.sirojiddinov.template.dao

import org.springframework.data.jpa.repository.JpaRepository
import uz.sirojiddinov.template.model.User

interface UserRepository: JpaRepository<User, Long> {

    fun findNyUserName(username: String): User?
}