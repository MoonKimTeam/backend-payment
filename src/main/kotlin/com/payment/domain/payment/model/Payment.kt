package com.payment.domain.payment.model

import com.payment.domain.payment.controller.request.PaymentRequest
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
    @Column(name = "reservation_id", nullable = false)
    var reservationId: Long,

    @Comment("결제자 이메일")
    @Column(name = "email", nullable = false)
    var email: String,

    @Comment("결제자 휴대폰 번호")
    @Column(name = "phone_number", nullable = false)
    var phoneNumber: String,

    @Comment("결제자 이름")
    @Column(name = "name", nullable = false)
    var name: String,

    @Comment("결제 가격")
    @Column(name = "price", nullable = false)
    var price: BigDecimal
): BaseEntity() {

    companion object {
        fun from(
            paymentRequest: PaymentRequest
        ): Payment = Payment(
            reservationId = paymentRequest.reservationId,
            email = paymentRequest.email,
            phoneNumber = paymentRequest.phoneNumber,
            name = paymentRequest.name,
            price = paymentRequest.price
        )
    }
}