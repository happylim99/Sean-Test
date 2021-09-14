package com.sean.seantest

import org.testng.Assert
import org.testng.annotations.*

class SampleTest {

    @BeforeSuite
    fun beforeSuite() {
        printC("before suite")
    }

    @AfterSuite
    fun afterSuite() {
        printC("after suite")
    }

    @BeforeTest
    fun beforeTest() {
        printC("before test")
    }

    @AfterTest
    fun afterTest() {
        printC("after test")
    }

    @BeforeClass
    fun beforeClass() {
        printC("before class")
    }

    @AfterClass
    fun afterClass() {
        printC("after class")
    }

    @BeforeMethod
    fun beforeMethod() {
        printC("before method")
    }

    @AfterMethod
    fun afterMethod() {
        printC("after method")
    }

    @Test(priority=1)
    fun setup() {
        printC("setup")
//        Assert.assertEquals("aa", "aaa")
    }

    @Test(priority=2)
    fun login() {
        printC("login")
//        Assert.assertEquals("aa", "aaa")
    }

    @Test(priority=3)
    fun logout() {
        printC("logout")
//        Assert.assertEquals("aa", "aaa")
    }

    private fun printC(msg: String) {
        println("SampleTest $msg")
    }
}