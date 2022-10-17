import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {
    public static String getFullNumber(Phone phone){
        return phone.getPrefix()+phone.getNumber();
    }
    public static  String getPhoneWithCode(Phone phone){
        if(phone.getBonusCode() == null){
            return phone.getPrefix()+phone.getNumber();
        }

        return phone.getPrefix()+phone.getNumber()+"#"+phone.getBonusCode();
    }
}
