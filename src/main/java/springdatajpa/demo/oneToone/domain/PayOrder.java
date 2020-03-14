package springdatajpa.demo.oneToone.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "payorder")
@Data
public class PayOrder {

    @Id
    private String trxid;
    private String outradeno;
    private String prepayid;
    private String submid;
    private String deviceinfo;
    private String feetype;
    private Long totalfee;
    private String feesubmid;
    private Long feetypecnt;
    private String billip;
    private Date timestart;
    private Date timexpire;
    private String notifyurl;
    private String tradetype;
    private String userid;
    private String attach;
    private Date timend;
    private Integer tradestate;
    private String statedesc;
    private Date createtime;

    @OneToMany(cascade={CascadeType.ALL}, fetch = FetchType.EAGER,targetEntity = PayToken.class)
    @JoinColumn(name = "trxid", referencedColumnName = "trxid")
    private List<PayToken> payTokens;
}
