package br.com.jpegsinng.appheroes.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.jpegsinng.appheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
