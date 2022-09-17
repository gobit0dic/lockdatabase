package elkloso.lockpicking.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import elkloso.lockpicking.lockAttribute.LockAttribute;
import org.springframework.hateoas.RepresentationModel;

public class LockAttributeDTO extends RepresentationModel<LockAttributeDTO> {
    private final LockAttribute content;

    @JsonCreator
    public LockAttributeDTO(@JsonProperty("content") LockAttribute lockAttribute) {
        this.content = lockAttribute;
    }

    public LockAttribute getContent() {
        return content;
    }
}
