package id.ac.unsrat.submission1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        verticalLayout{
            padding = dip(30)

            imageView {
                setImageResource(intent.getIntExtra("image",0))

                }.lparams(width = wrapContent){
                    gravity = Gravity.CENTER
                    width = dip(100)
                    height = dip(100)
                    bottomMargin = dip(20)
            }

            textView {
                text = intent.getStringExtra("name")
                textAlignment = View.TEXT_ALIGNMENT_CENTER
                textSize = 26f
            }

            textView {
                text = intent.getStringExtra("desc")
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }

        }

    }
}