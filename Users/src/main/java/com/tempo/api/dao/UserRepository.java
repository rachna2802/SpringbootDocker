package com.tempo.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tempo.api.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    //JPQL
    @Query("select s from User s where s.location= ?1")
    User getUserByLocation(String location);


    //JPQL
    @Query("select s.firstName from User s where s.location = ?1")
    String getUserFirstNameBylocation(String location);

    //Native
    @Query(
            value = "SELECT * FROM USER_A s where s.displayName = ?1",
            nativeQuery = true
    )
    User getUserByDisplayName(String displayName);


    //Native Named Param
    @Query(
            value = "SELECT * FROM USER_A s where s.display_name = :displayName",
            nativeQuery = true
    )
    User getUserByDisplayNameNativeNamedParam(
            @Param("displayName") String displayName
    );

    @Modifying
    @Transactional
    @Query(
            value = "update USER_A set first_name = ?1 where last_name = ?2",
            nativeQuery = true
    )
    int updateUserNameByLastName(String firstName, String lastName);


}
