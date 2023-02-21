package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
}
