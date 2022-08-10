package com.ppoox.jpa.biz.main.member;

import com.ppoox.jpa.biz.main.order.Order;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
//    @JoinColumn(name = "order_id")
    List<Order> orders = new ArrayList<>();

}
