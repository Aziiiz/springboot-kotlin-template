package uz.sirojiddinov.template.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uz.sirojiddinov.template.dao.UserRepository
import uz.sirojiddinov.template.model.User
import uz.sirojiddinov.template.service.UserService


@Service
class UserServiceImpl(@Autowired private val userRepository: UserRepository): UserService {
    override fun SaveNewUser(user: User): User {
       user.password = this.passwordEncoder.encode(user.password)
        return userRepository.save(user)
    }

}
//https://velog.io/@lsb156/Kotlin%EC%9C%BC%EB%A1%9C-Spring-Boot-Security-Login-%EB%A7%9B%EB%B3%B4%EA%B8%B0