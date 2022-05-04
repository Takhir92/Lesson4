package Lesson4;

import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class HomeWorkTest {
    @BeforeAll
    static void BeforeAll(){

    }
    @BeforeEach
    void BeforeEach(){

    }
    @Test
    void GivenBanZay(){
         Assertions.assertArrayEquals(Stream.of(1,2,3));

    }
}
