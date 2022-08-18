package com.BikkadIT.PhoneBookApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.PhoneBookApi.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
