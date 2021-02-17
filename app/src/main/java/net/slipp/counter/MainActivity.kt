package net.slipp.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import net.slipp.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var binding: ActivityMainBinding
    override lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = MainPresenter(this)
        binding.buttonUp.setOnClickListener { presenter.increment() }
        binding.buttonDown.setOnClickListener { presenter.decrement() }
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun showCount(count: Long) {
        binding.textView.text = count.toString()
    }
}
