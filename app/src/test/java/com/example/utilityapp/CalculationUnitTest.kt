package com.example.utilityapp

import com.example.utilityapp.util.CalculatorUtil.add2Numbers
import com.example.utilityapp.util.CalculatorUtil.div2Numbers
import com.example.utilityapp.util.CalculatorUtil.mul2Numbers
import com.example.utilityapp.util.CalculatorUtil.sub2Numbers
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class CalculationUnitTest {

    @Test
    fun addition_isCorrect() {
        val x = 5
        val y = 4
        val result = add2Numbers(x, y)
        assertEquals(result, x + y)
    }

    @Test
    fun addition_isInCorrect() {
        val x = 5
        val y = 4
        val result = add2Numbers(x, y)
        assertNotEquals(result, x + y + 1)
    }

    @Test
    fun subtraction_isCorrect() {
        val x = 5
        val y = 4
        val result = sub2Numbers(x, y)
        assertEquals(result, x - y)
    }

    @Test
    fun subtraction_isInCorrect() {
        val x = 5
        val y = 4
        val result = sub2Numbers(x, y)
        assertNotEquals(result, x - y - 1)
    }

    @Test
    fun multiply_isCorrect() {
        val x = 5
        val y = 4
        val result = mul2Numbers(x, y)
        assertEquals(result, x * y)
    }

    @Test
    fun multiply_isInCorrect() {
        val x = 5
        val y = 4
        val result = mul2Numbers(x, y)
        assertNotEquals(result, x * y + 1)
    }

    @Test
    fun divide_isCorrect() {
        val x = 5
        val y = 4
        val result = div2Numbers(x, y)
        assertEquals(result, x / y)
    }

    @Test
    fun divide_isInCorrect() {
        val x = 5
        val y = 4
        val result = div2Numbers(x, y)
        assertNotEquals(result, x / y + 1)
    }
}