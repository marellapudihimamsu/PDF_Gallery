package tech.pudi.pdf_gallery

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bt1:Button=findViewById(R.id.b1)
        bt1.setOnClickListener(View.OnClickListener { v: View? ->
            var i=Intent()
            i.setAction(Intent.ACTION_GET_CONTENT)
            i.setType("application/pdf")
            startActivity(i)
        })

    }
}
