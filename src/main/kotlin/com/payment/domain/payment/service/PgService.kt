package com.payment.domain.payment.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PgService {

    companion object {
        val logger = LoggerFactory.getLogger(PgService::class.java)
    }

    fun paymentToPhoneNumber(
        phoneNumber: String
    ) {
        logger.info("$phoneNumber - 휴대폰 결제")
    }
}