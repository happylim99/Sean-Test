package com.sean.seantest

import org.testng.ITestContext
import org.testng.ITestListener
import org.testng.ITestResult

class CustomListener: ITestListener {

    override fun onStart(context: ITestContext?) {
        super.onStart(context)
        println("onStart")
    }

    override fun onFinish(context: ITestContext?) {
        super.onFinish(context)
        println("onFinish")
    }

    override fun onTestStart(result: ITestResult?) {
        super.onTestStart(result)
        println("onTestStart")
    }

    override fun onTestSkipped(result: ITestResult?) {
        super.onTestSkipped(result)
        println("onTestSkipped")
    }

    override fun onTestSuccess(result: ITestResult?) {
        super.onTestSuccess(result)
        println("onTestSuccess")
    }

    override fun onTestFailure(result: ITestResult?) {
        super.onTestFailure(result)
        println("onTestFailure")
    }
}