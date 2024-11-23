package com.example.agro_t2

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

data class drivers(
    val drivers_id: Int,
    var full_name: String,
    var password: String,
    var phome_number: String,
    var brith_number: String,
    var email: String,
    var rating: Int,
    var completed_orders: Int,
)
data class controllers(
    val controllers_id: Int,
    var full_name: String,
    var password: String,
    var phome_number: String,
    var brith_number: String,
    var email: String,
)
data class orders(
    val orders_id: Int,
    var user_id: Int,
    var address: String,
    var stite: String,
    var load_time: Int,
    var unload_time: Int,
    val num_bunkers: Int,
)
data class bunkers(
    var bunkers_id: Int,
    var name: String,
    var capacity: Int,
    val loaded_feed: Int,
    val load_percemrage: Int,
    var site_id: Int,
)
data class order_history(
    var history_id: Int,
    var order_id: Int,
    val status: Int,
    var address: String,
    var stite: String,
    var num_bunkers: Int,
    var total_loaded: Int,
    val deviation: Int,
)

class driversDatabase(private val filePath: String) {
    private val gson = Gson()

    fun Load(): MutableList<drivers> {
        val file = File(filePath)
        return if (file.exists()) {
            val json = file.readText()
            gson.fromJson(json, object : TypeToken<MutableList<drivers>>() {}.type)
        } else {
            mutableListOf()
        }
    }

    fun Save(users: List<drivers>) {
        val json = gson.toJson(users)
        File(filePath).writeText(json)
    }

    fun Add(user: drivers) {
        val users = Load()
        users.add(user)
        Save(users)
    }

    fun find(name: String): List<drivers> {
        val bd = Load()
        return bd.filter { it.full_name.contains(name, ignoreCase = true) }
    }
}
class controllersDatabase(private val filePath: String) {
    private val gson = Gson()

    fun Load(): MutableList<controllers> {
        val file = File(filePath)
        return if (file.exists()) {
            val json = file.readText()
            gson.fromJson(json, object : TypeToken<MutableList<controllers>>() {}.type)
        } else {
            mutableListOf()
        }
    }

    fun Save(users: List<controllers>) {
        val json = gson.toJson(users)
        File(filePath).writeText(json)
    }

    fun Add(user: controllers) {
        val users = Load()
        users.add(user)
        Save(users)
    }

    fun find(name: String): List<controllers> {
        val bd = Load()
        return bd.filter { it.full_name.contains(name, ignoreCase = true) }

    }
}
class ordersDatabase(private val filePath: String) {
    private val gson = Gson()

    fun Load(): MutableList<orders> {
        val file = File(filePath)
        return if (file.exists()) {
            val json = file.readText()
            gson.fromJson(json, object : TypeToken<MutableList<orders>>() {}.type)
        } else {
            mutableListOf()
        }
    }

    fun Save(users: List<orders>) {
        val json = gson.toJson(users)
        File(filePath).writeText(json)
    }

    fun Add(user: orders) {
        val users = Load()
        users.add(user)
        Save(users)
    }

}
class bunkersDatabase(private val filePath: String) {
    private val gson = Gson()

    fun Load(): MutableList<bunkers> {
        val file = File(filePath)
        return if (file.exists()) {
            val json = file.readText()
            gson.fromJson(json, object : TypeToken<MutableList<bunkers>>() {}.type)
        } else {
            mutableListOf()
        }
    }

    fun Save(users: List<bunkers>) {
        val json = gson.toJson(users)
        File(filePath).writeText(json)
    }

    fun Add(user: bunkers) {
        val users = Load()
        users.add(user)
        Save(users)
    }

}
class OHDatabase(private val filePath: String) {
    private val gson = Gson()

    fun Load(): MutableList<order_history> {
        val file = File(filePath)
        return if (file.exists()) {
            val json = file.readText()
            gson.fromJson(json, object : TypeToken<MutableList<order_history>>() {}.type)
        } else {
            mutableListOf()
        }
    }

    fun Save(users: List<order_history>) {
        val json = gson.toJson(users)
        File(filePath).writeText(json)
    }

    fun Add(user: order_history) {
        val users = Load()
        users.add(user)
        Save(users)
    }

}

fun driversMain() {
    val db = driversDatabase("drivers.json")
    db.Add(
        drivers(1, "div", "123", "+79174546454", "12.01.1994", "example@mai.ru", 1, 1)
    )
    val nameToFind = "div"
    val usersByName = db.find(nameToFind)
    println(usersByName)

}
fun controllersMain() {
    val db = controllersDatabase("controllers.json")
    db.Add(controllers(1, "con", "123", "+79174546454", "12.01.1994", "example@mai.ru"))

    val nameToFind = "con"
    val usersByName = db.find(nameToFind)
    println(usersByName)

}
fun ordersMain() {
    val db = ordersDatabase("orders.json")
    db.Add(orders(1, 1, "ул.пушкина", "11", 1, 1, 1))
}
fun bunkersMain() {
    val db = bunkersDatabase("bunkers.json")
    db.Add(bunkers(1, "con", 1, 1, 1, 1))


}
fun order_historyMain() {
    val db = OHDatabase("order_history.json")
    db.Add(order_history(1, 1, 1, "ул.пушкина", "11", 1, 1, 1))
}

