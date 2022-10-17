import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        String fullNumber = PhoneUtil.getFullNumber(new Phone("+7", "91222331"));
        log.info("Полный номер телфона:  " + fullNumber);
    }
}