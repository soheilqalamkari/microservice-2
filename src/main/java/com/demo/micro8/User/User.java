package com.demo.micro8.User;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(catalog = "postgres",name = "user",schema = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;



}