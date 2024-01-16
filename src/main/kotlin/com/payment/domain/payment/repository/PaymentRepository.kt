package com.payment.domain.payment.repository

import com.payment.domain.payment.model.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository: JpaRepository<Payment, Long> {
}