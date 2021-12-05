package uz.sirojiddinov.template.service

import uz.sirojiddinov.template.model.User

interface UserService {

    fun SaveNewUser(user: User): User
}