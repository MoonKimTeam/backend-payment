package com.payment.domain.payment.service

import com.payment.domain.payment.controller.request.PaymentRequest
import com.payment.domain.payment.model.Payment
import com.payment.domain.payment.repository.PaymentRepository
import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val pgService: PgService,
    private val paymentRepository: PaymentRepository
) {

    fun payment(
        paymentRequest: PaymentRequest
    ): Long {
        val payment = paymentRepository.save(Payment.from(paymentRequest))
        pgService.paymentToPhoneNumber(paymentRequest.phoneNumber)

        return payment.id
    }
}