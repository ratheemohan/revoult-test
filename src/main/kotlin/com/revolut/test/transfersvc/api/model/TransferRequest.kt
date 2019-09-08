package com.revolut.test.transfersvc.api.model

import java.math.BigDecimal

data class TransferRequest(
        val from: SortCodeAccountNumber,
        val to: SortCodeAccountNumber,
        val amount: BigDecimal,
        val reference: String
)

data class SortCodeAccountNumber(val sortCode: String, val accountNumber: String)