package org.unitec.disposicionvertical

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator

class DisposicionVertical : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disposicion_vertical)

        //Vamos a invocar el servicio del vibradorjujjji
      var  vibrador= getSystemService(Context.VIBRATOR_SERVICE)as Vibrator//este metodo nos obtiene un servicio de sistema  el que le pasemos como argumento.
      vibrador.vibrate(3000)
    }
}
