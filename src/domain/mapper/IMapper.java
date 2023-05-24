package domain.mapper;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public abstract class IMapper<FROM, TO> {
    public TO map(FROM from) {
        if (from != null) {
            return mapImpl(from);
        } else {
            throw new IllegalArgumentException("пустые данные");
        }
    }

    public List<TO> mapMany(List<FROM> items) {
        return items
                .stream()
                .map(this::mapImpl)
                .collect(Collectors.toList());
    }

    public abstract TO mapImpl(FROM from);
}
