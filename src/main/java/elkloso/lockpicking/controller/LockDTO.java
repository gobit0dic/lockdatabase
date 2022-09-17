package elkloso.lockpicking.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import elkloso.lockpicking.lockEntries.Lock;
import org.springframework.hateoas.RepresentationModel;

public class LockDTO extends RepresentationModel<LockDTO> {

    private final Lock[] content;

    @JsonCreator
    public LockDTO(@JsonProperty("content") Lock[] locks) {
        this.content = locks;
    }

    public Lock[] getContent() {
        return content;
    }

}
