package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class MadeStreamingUrl extends AbstractEvent {

    private Long id;
    private String name;
    private String url;
}
