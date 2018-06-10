package com.xm.springboot.Repository;

import com.xm.springboot.domain.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DemoRepository extends CrudRepository<Demo,Long> {
}
