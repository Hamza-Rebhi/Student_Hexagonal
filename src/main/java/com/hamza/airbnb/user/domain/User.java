package com.hamza.airbnb.user.domain;

import com.hamza.airbnb.sharedkernel.domain.AbstractAuditingEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;
import java.util.UUID;

@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "airbnb_user")
public class User extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequenceGenerator")
    @SequenceGenerator(name = "userSequenceGenerator", sequenceName = "user_generator", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "email")
    private  String email;
    @Column(name = "image_url")
    private String imageUrl;
    @UuidGenerator
    @Column(name = "public_id",nullable = false)
    private UUID public_id;
    @ManyToMany
    @JoinTable(name = "user_authority",
    joinColumns = {@JoinColumn(name = "authority_name",referencedColumnName = "name")})
    private Set<Authority> authorities;

}
