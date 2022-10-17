import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {
    public static String getFullNumber(Phone phone){
        return phone.getPrefix()+phone.getNumber();
    }
}
