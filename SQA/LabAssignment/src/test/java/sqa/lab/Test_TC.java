package sqa.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_TC {

    @Test
    public void testTC01() {
        ShiftCipher cipher = new ShiftCipher();
        // คาดหวัง ZVMADHYL (ตามชีทอาจารย์)
        String result = cipher.shift("SOFTWARE", 3);
        assertEquals("ZVMADHYL", result);
    }

    @Test
    public void testTC02() {
        ShiftCipher cipher = new ShiftCipher();
        // คาดหวัง zvmadhyl (ตามชีทอาจารย์)
        String result = cipher.shift("software", 3);
        assertEquals("zvmadhyl", result);
    }

    @Test
    public void testTC03() {
        ShiftCipher cipher = new ShiftCipher();
        // คาดหวัง ORRNPRR (กรณีคิดเพิ่ม: พิมพ์ใหญ่)
        String result = cipher.shift("LOOKMOO", 3);
        assertEquals("ORRNPRR", result);
    }

    @Test
    public void testTC04() {
        ShiftCipher cipher = new ShiftCipher();
        // คาดหวัง orrnprr (กรณีคิดเพิ่ม: พิมพ์เล็ก)
        String result = cipher.shift("lookmoo", 3);
        assertEquals("orrnprr", result);
    }
}