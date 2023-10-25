package com.example.generic.repo;

import com.example.generic.entity.BookDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Meow
 */
@Repository
public interface BookRepo extends JpaRepository<BookDO, String> {


}
