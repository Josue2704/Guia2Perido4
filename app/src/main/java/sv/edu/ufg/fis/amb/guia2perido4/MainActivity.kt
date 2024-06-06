package sv.edu.ufg.fis.amb.guia2perido4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sv.edu.ufg.fis.amb.guia2perido4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonMain.setOnClickListener{
            val intent = Intent(this,Guardar::class.java)
            startActivity(intent)
        }
    }
}