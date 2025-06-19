package vcmsa.kythera.musicplaylistmanagerapp
//Kythera Pather
//ST10479546
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // creating array list for storing data
    companion object {
        val songLists = ArrayList<String>()
        val artistNames = ArrayList<String>()
        val ratings = ArrayList<Int>()
        val comments = ArrayList<String>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//End of setContentView

        //Linking the elements to the layout
        val songList = findViewById<EditText>(R.id.edtSongList)
        val artistName = findViewById<EditText>(R.id.edtArtistName)
        val rating = findViewById<EditText>(R.id.edtRating)
        val comment = findViewById<EditText>(R.id.edtComment)
        val add = findViewById<Button>(R.id.btnAdd)
        val exit = findViewById<Button>(R.id.btnExit)
        val detailedView = findViewById<Button>(R.id.btnDetailedView)

        // Adding a Add to playlist button so it add to the details array list and has a toast message to enter the details for the playlist
        add.setOnClickListener {
            // add a log to check if the button is clicked
            Log.d("MainActivity", "Add button clicked")
            val song = songList.text.toString()
            val artist = artistName.text.toString()
            val ratingText = rating.text.toString()
            val com = comment.text.toString()

            //When the user clicks the add button, the user must be asked to enter the details for the playlist
            Toast.makeText(this, "Please enter the details for the playlist", Toast.LENGTH_SHORT).show()

            //check if the details are entered
            if (song.isBlank() || artist.isBlank() || ratingText.toString().isBlank() || com.isBlank()) {
                Toast.makeText(this, "Please enter all Filed correcting. The rating must be 1-5", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else{
                songLists.add(song)
                artistNames.add(artist)
                ratings.add(ratingText.toInt())
                comments.add(com)
                //Add log to check if the details are entered
                Log.d("MainActivity", "Song: $song, Artist: $artist, Rating: $ratingText, Comment: $com")
            }
            //Safely convert rate to integer
            val parsedRating = ratingText.toIntOrNull()
            if (rating == null) {
                Toast.makeText(this, "Please enter a valid rating(1-5)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //Clear the text fields
            songList.text.clear()
            artistName.text.clear()
            rating.text.clear()
            comment.text.clear()
            Log.d(add.toString(), "add button clicked")
        }

        //detailed view button to go to the next screen
        detailedView.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            intent.putExtra("songLists", songLists)
            intent.putExtra("artistNames", artistNames)
            intent.putExtra("ratings", ratings)
            intent.putExtra("comments", comments)
            startActivity(intent)
            Log.d(detailedView.toString(), "detailed view button clicked")
        }

        //exit button to exit the app
        exit.setOnClickListener {
            Log.d(exit.toString(), "exit button clicked")
            finish()
        }
    }
}