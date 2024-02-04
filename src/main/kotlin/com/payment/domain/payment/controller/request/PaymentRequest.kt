package com.payment.domain.payment.controller.request

import java.math.BigDecimal

data class PaymentRequest(
    val reservationId: Long,
    val price: BigDecimal,
    val name: String,
    val email: String,
    val phoneNumber: String
)
