package com.payment.domain.payment.model

import com.payment.global.entity.BaseEntity
import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.math.BigDecimal

@Entity
@Table(name = "payment")
class Payment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = 0L,

    @Comment("예약 id")
    @Column(name = "reservation_id")
    var reservationId: Long,

    @Comment("결제자 이메일")
    @Column(name = "email")
    var email: String,

    @Comment("결제자 휴대폰 번호")
    @Column(name = "phone_number")
    var phoneNumber: String,

    @Comment("결제자 이름")
    @Column(name = "name")
    var name: String,

    @Comment("결제 가격")
    @Column(name = "price")
    var price: BigDecimal
): BaseEntity()