package mongoQueryDsl.dsl.domain.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import nonapi.io.github.classgraph.json.Id;

@Data
@Document
@Accessors(chain = true)
public class Member {

    @Id
    private String id;
    private String name;
    private String address;
    
}
