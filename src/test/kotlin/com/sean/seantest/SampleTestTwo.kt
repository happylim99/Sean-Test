package com.sean.seantest

import org.testng.Assert
import org.testng.annotations.*

@Listeners(CustomListener::class)
class SampleTestTwo {

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

    @Test(priority=1, groups = ["a"])
    fun setup() {
        printC("setup")
//        Assert.assertEquals("aa", "aaa")
    }

    @Test(priority=2, enabled = false)
    fun login() {
        printC("login")
//        Assert.assertEquals("aa", "aaa")
    }

    // always run even dependency fail
    @Test(
        priority=3,
        dependsOnMethods = ["logoutDepend1", "logoutDepend2"],
        alwaysRun = true,
        groups = ["a"]
    )
    @Parameters("role")
    fun logout(role: String) {
        println(role.toString())
        if(role == "admin") {
            printC("i am admin")
        } else {
            printC("i am user")
        }
        printC("logout")
//        Assert.assertEquals("aa", "aaa")
    }

    @Test(priority=4, groups = ["a"])
    fun logoutDepend1() {
        printC("logoutDepend1")
    }

    @Test(priority=5, groups = ["a"])
    fun logoutDepend2() {
        printC("logoutDepend2")
    }

    private fun printC(msg: String) {
        println("SampleTestTwo $msg")
    }

}