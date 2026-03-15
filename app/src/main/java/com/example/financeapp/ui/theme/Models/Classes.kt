package com.example.financeapp.ui.theme.Models


import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

data class User(
    val nombre: String,
    val saldoActual: Double
)

data class SummaryCard(
    val titulo: String,
    val monto: String,
    val colorFondo: Color
)

data class Transaction(
    val establecimiento: String,
    val categoria: String,
    val monto: Double,
    val hora: String,
    val icon: ImageVector
)

val user = User("Juan", 1500.0)
val cards = listOf(
    SummaryCard("Actividad", "$280.99", Color(0xFFE7F3F1)),
    SummaryCard("Ventas", "$280.99", Color(0xFFEFDFD6)),
    SummaryCard("Ganancias", "$280.99", Color(0xFFE1DDEF))
)
val transactions = listOf(
    Transaction("Supermarket", "Groceries", 45.99, "10:30 AM", Icons.Default.ShoppingCart),
    Transaction("Gas Station", "Fuel", -30.5, "12:15 PM", Icons.Default.Place),
    Transaction("Coffee Shop", "Food & Drinks", 5.75, "8:00 AM", Icons.Default.Favorite),
    Transaction("Electronics Store", "Electronics", 120.0, "3:45 PM", Icons.Default.Build),
    Transaction("Bookstore", "Books", 25.99, "2:00 PM", Icons.Default.Edit),
    Transaction("Restaurant", "Dining", 60.0, "7:30 PM", Icons.Default.Star)
)