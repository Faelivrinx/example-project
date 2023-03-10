package com.iteo.shopping.order


class OrderFixture {

    static String requestForCostPreview(String productId, String... discountIds) {
        StringBuilder discounts = new StringBuilder()
        for (final def discountId in discountIds) {
            discounts.append("\"$discountId\"")
        }
        return """{ "productId": "$productId", "quantity": 1, "discountIds": [$discounts] }"""
    }
}
