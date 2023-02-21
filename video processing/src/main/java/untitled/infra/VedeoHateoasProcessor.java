package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class VedeoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Vedeo>> {

    @Override
    public EntityModel<Vedeo> process(EntityModel<Vedeo> model) {
        return model;
    }
}
