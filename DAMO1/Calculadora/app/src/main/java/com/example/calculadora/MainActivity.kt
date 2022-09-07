package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciar()
    }

    private fun iniciar() {
        binding.btnSum.setOnClickListener {
            val num1: Int = binding.num1.text.toString().toInt()
            val num2: Int = binding.num2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.sumar()
            binding.tvResp.text = suma.toString()
        }

        binding.btnRest.setOnClickListener {
            val n1: Int = binding.num1.text.toString().toInt()
            val n2: Int = binding.num1.text.toString().toInt()
            val op = Operacion(n1, n2)
            val resta = op.restar()
            binding.tvResp.text = resta.toString()
        }

        binding.btnMult.setOnClickListener {
            val num1: Int = binding.num1.text.toString().toInt()
            val num2: Int = binding.num2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val multiplicacion = op.multiplicar()
            binding.tvResp.text = multiplicacion.toString()
        }

        binding.btnDiv.setOnClickListener {
            val num1: Int = binding.num1.text.toString().toInt()
            val num2: Int = binding.num2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val division = op.dividir()
            binding.tvResp.text = division.toString()
        }
    }
}