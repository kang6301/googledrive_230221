package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class MadeStreamingUrl extends AbstractEvent {

    private Long id;
    private String name;
    private String URL;
}
