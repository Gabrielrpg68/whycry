package br.com.fiap.whycry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.whycry.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
