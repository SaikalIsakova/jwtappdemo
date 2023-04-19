package com.example.jwtappdemo.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@EnableJpaAuditing
public class Role extends BaseEntity{

    @Column(name = "name")
     String name;

    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
     List<User>users;

}
