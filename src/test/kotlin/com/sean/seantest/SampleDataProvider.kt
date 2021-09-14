package com.sean.seantest

import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class SampleDataProvider {

    // if the data comes from another class, we need dataProviderClass
    @Test(dataProvider = "loginData", dataProviderClass = SampleDataProvider::class)
    fun testlogin(obj: LoginReq) {
        println("${obj.email} ${obj.passwd}")
    }

    @DataProvider(name = "loginData")
    fun loginData(): Array<LoginReq> {

        val data = arrayOf(LoginReq("aaa@aaa.com", "abcd"), LoginReq("aaa@aaa.com", "abcd"))
        return data
    }
}