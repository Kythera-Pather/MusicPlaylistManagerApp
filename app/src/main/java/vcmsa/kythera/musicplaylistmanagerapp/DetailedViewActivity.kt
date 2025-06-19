package vcmsa.kythera.musicplaylistmanagerapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.text.get

class DetailedViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//End of setContentView

        val songDetails = findViewById<TextView>(R.id.tvDetails)
        val displayDetails = findViewById<Button>(R.id.btnDisplayDetails)
        val averageRating = findViewById<Button>(R.id.btnAverageRating)
        val rating = findViewById<TextView>(R.id.tvRating)
        val back = findViewById<Button>(R.id.tvBack)

        // when the user clicks the display details button, the details will be displayed
        displayDetails.setOnClickListener {
            val result = StringBuilder()
            for (i in MainActivity.songLists.indices) {
                if (MainActivity.songLists[i].isNotEmpty()) {
                    result.append("Song: ${MainActivity.songLists[i]}\n")
                    result.append("Artist: ${MainActivity.artistNames[i]}\n")
                    result.append("Rating: ${MainActivity.ratings[i]}\n")
                    result.append("Comment: ${MainActivity.comments[i]}\n")
                    // add a log to check if the details are displayed
                    Log.d("DetailedViewActivity", "Song: ${MainActivity.songLists[i]}, Artist: ${MainActivity.artistNames[i]}, Rating: ${MainActivity.ratings[i]}, Comment: ${MainActivity.comments[i]}")
                }
                songDetails.text = result.toString()
                // add a log to check if the details are displayed
                Log.d("DetailedViewActivity", "Song details displayed")
            }
        }

        // when the user clicks the average rating button is calculates the average rating of the songs
        averageRating.setOnClickListener {
            var totalRating = 0
            for (rating in MainActivity.ratings) {
                totalRating += rating
            }
            val average = totalRating / MainActivity.ratings.size
            rating.text = "Average rating for all songs: $average"

            // add a log to check if the average rating is calculated
            Log.d("DetailedViewActivity", "Average rating calculated")

        }
        // when the user clicks the back button, the user will be taken back to the main activity
        back.setOnClickListener {
            // add a log to check if the back button is clicked
            Log.d("DetailedViewActivity", "Back button clicked")
            finish()
        }
    }
}