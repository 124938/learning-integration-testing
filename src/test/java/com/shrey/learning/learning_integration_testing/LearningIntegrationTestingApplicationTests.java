package com.shrey.learning.learning_integration_testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlMergeMode;

import javax.sql.DataSource;

import static org.springframework.test.context.jdbc.SqlMergeMode.MergeMode.MERGE;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("it")
@SqlMergeMode(MERGE)
@Sql(scripts = {"classpath:sql/it-init.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
class LearningIntegrationTestingApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    @Sql("classpath:sql/it-sample-data.sql")
    public void contextLoads() {

    }

}
