package uz.sirojiddinov.template.model

import lombok.*;
import javax.persistence.*


@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @NonNull
    var username: String,
    @NonNull
    var password: String
)