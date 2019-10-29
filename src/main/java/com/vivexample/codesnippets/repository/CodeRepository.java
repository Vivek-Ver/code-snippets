package com.vivexample.codesnippets.repository;

import com.vivexample.codesnippets.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vivekverma on 2019-10-27.
 */

@Repository
public interface CodeRepository extends JpaRepository<Code, Long> {

}
