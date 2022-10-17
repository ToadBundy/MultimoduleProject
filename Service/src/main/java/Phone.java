import lombok.*;

@Getter
@RequiredArgsConstructor
public class Phone {
    @NonNull String prefix;
    @NonNull String number;
    String bonusCode;

    Phone(String prefix, String number, String bonusCode){
        this.prefix = prefix;
        this.number = number;
        this.bonusCode = bonusCode;
    }
}
