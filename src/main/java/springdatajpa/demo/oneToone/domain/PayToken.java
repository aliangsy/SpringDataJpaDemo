package springdatajpa.demo.oneToone.domain;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Table(name = "paytoken")
@Data
@Entity
public class PayToken implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;
    private String trxid;
    private String submid;
    private String feetype;
    private Long totalfee;
    private Integer totalvalue;

}
