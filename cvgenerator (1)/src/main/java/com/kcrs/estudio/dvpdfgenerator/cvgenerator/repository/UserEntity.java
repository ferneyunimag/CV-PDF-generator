package com.kcrs.estudio.dvpdfgenerator.cvgenerator.repository;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.UserBasic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document("users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;

    public UserEntity(UserBasic user) {
        this.id = user.getId().getValue();
        this.name = user.getName().getValue();
        this.email = user.getEmail().getValue();
        this.phone = user.getPhone().getValue();

    }
}
