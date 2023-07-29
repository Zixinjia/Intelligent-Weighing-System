package com.open.harmony;



import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class HarmonyApplicationTests {
    @Test
    public void test2() {
        log.info("天气真热啊");
        log.error("天气真热啊");
    }
}
