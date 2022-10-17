import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class Phone {
    @NonNull String prefix;
    @NonNull String number;
}
