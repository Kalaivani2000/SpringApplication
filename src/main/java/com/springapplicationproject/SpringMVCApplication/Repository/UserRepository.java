package com.springapplicationproject.SpringMVCApplication.Repository;

import com.springapplicationproject.SpringMVCApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserRepository extends JpaRepository<User,Long> {
}