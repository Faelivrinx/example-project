package com.iteo.shopping

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import com.jayway.restassured.module.mockmvc.response.MockMvcResponse

class TestHelper {

    MockMvcResponse post(String uri, String jsonBody) {
        return RestAssuredMockMvc.with().contentType("application/json").body(jsonBody).post(uri).thenReturn()
    }
}
