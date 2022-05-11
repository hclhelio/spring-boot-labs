package org.hcl.springbootlab.config.testes;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@TestMethodOrder(OrderAnnotation.class)
@Rollback(false)
public abstract class BaseJpaTest {

}
