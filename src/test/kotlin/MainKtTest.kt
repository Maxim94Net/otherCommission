import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionMir() {
        val result = calculateCommission("mir", 100, 0)
        assertEquals(35, result)
    }
    @Test
    fun calculateCommissionVK() {
        val result = calculateCommission("VK Pay", 20000, 0)
        assertEquals(null, result)
    }
    @Test
    fun calculateCommissionVisa() {
        val result = calculateCommission("visa", 20000, 0)
        assertEquals(1500, result)
    }
    @Test
    fun calculateCommissionMaster() {
        val result = calculateCommission("mastercard", 76000, 0)
        assertEquals(4580, result)
    }
    @Test
    fun calculateCommissionMaestro() {
        val result = calculateCommission("maestro", 74000, 0)
        assertEquals(0, result)
    }
    @Test
    fun calculateCommissionLimit() {
        val result = calculateCommission(purchaseAmount = 20000)
        assertEquals(null, result)
    }
    @Test
    fun calcMain() {
        val result = main()
        assertEquals(Unit, result)
    }
    @Test
    fun calculateCommissionMonthlyVK() {
        val result = calculateCommission(purchaseAmount = 66, purchaseAmountMonth = 45000)
        assertEquals(null,result)

    }

}