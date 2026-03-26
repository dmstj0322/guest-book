package com.zizi.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zizi.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {
  
}
