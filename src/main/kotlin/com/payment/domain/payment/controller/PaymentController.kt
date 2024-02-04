package com.payment.domain.payment.controller

import com.payment.domain.payment.controller.request.PaymentRequest
import com.payment.domain.payment.service.PaymentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pays")
class PaymentController(
    private val paymentService: PaymentService
) {

    @PostMapping
    fun payment(
        @RequestBody paymentRequest: PaymentRequest
    ): ResponseEntity<Long> {
        return ResponseEntity(paymentService.payment(paymentRequest), HttpStatus.OK)
    }
}