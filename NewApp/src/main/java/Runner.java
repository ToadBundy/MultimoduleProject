import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        String fullnumber = PhoneUtil.getFullNumber(new Phone("+7", "00000023"));
        log.info("телефонный номер:  "+fullnumber);
        String numberWithCode = PhoneUtil.getPhoneWithCode(new Phone("+7", "00000023", "007"));
        log.info("Номер с кодом:  "+numberWithCode);

    }
}