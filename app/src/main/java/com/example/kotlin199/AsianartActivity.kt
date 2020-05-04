package com.example.kotlin199

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.kotlin199.R
import com.squareup.picasso.Picasso

import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

import java.util.Random

class AsianartActivity : AppCompatActivity() {

    private var titleBox: TextView? = null
    private var artistBox: TextView? = null
    private var mediumBox: TextView? = null
    private var objectDateBox: TextView? = null
    private var cultureBox: TextView? = null
    private var queue: RequestQueue? = null
    private var r: Random? = null
    private var randomNum: Int = 0
    private var randomID: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.asianart_activity)

        val gobackButton = findViewById<Button>(R.id.gobackButton)
        gobackButton.setOnClickListener { v ->
            val x = Intent(this, LearnActivity2::class.java)
            startActivity(x)
            finish()
        }

        titleBox = findViewById(R.id.title)
        artistBox = findViewById(R.id.artist)
        mediumBox = findViewById(R.id.medium)
        objectDateBox = findViewById(R.id.objectDate)
        cultureBox = findViewById(R.id.culture)

        queue = Volley.newRequestQueue(this)
        generateID()
        //jsonParse();

        //ImageView image = findViewById(R.id.image);
        //String url = "https://images.metmuseum.org/CRDImages/ep/original/DP346475.jpg";
        //Picasso.get().load(url).into(image);
    }

    private fun loadImageFromUrl(url: String) {
        val image = findViewById<ImageView>(R.id.image)
        Picasso.get().load(url).into(image)
    }

    private fun jsonParse(randomI: Int) {
        println("final test of random ID: $randomI")
        //String url = "https://collectionapi.metmuseum.org/public/collection/v1/objects/4222";
        val url = "https://collectionapi.metmuseum.org/public/collection/v1/objects/$randomI"
        println("STRING URL IS$url")
        val request = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener { response ->
                    try {
                        //TextView artist = findViewById(R.id.artist);
                        //artist.setVisibility(View.GONE);
                        val title = "     " + response.getString("title")
                        titleBox.text = title
                        val artist = "     " + response.getString("artistDisplayName")
                        if (response.getString("artistDisplayName") == "") {
                            artistBox.text = "     No artist associated"
                        } else {
                            artistBox.text = artist
                        }
                        val medium = "     " + response.getString("medium")
                        mediumBox.text = medium
                        val objectDate = "     " + response.getString("objectDate")
                        if (response.getString("objectDate") == "") {
                            objectDateBox.text = "     No date associated"
                        } else {
                            objectDateBox.text = objectDate
                        }
                        val culture = "     " + response.getString("culture")
                        if (response.getString("culture") == "") {
                            cultureBox.text = "     No culture associated"
                        } else {
                            cultureBox.text = culture
                        }

                        val url = response.getString("primaryImage")
                        loadImageFromUrl(url)


                    } catch (e: JSONException) {
                        println("badbad")
                        e.printStackTrace()
                    }
                }, Response.ErrorListener { error ->
            println("internet broken")
            println(error.message + "hi")
        })
        queue.add(request)
    }

    private fun generateID() {
        val url = "https://collectionapi.metmuseum.org/public/collection/v1/objects?departmentIds=6"
        val request = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener { response ->
                    try {
                        val total = response.getInt("total")
                        val objectIDs = response.getJSONArray("objectIDs")
                        r = Random()
                        randomNum = r!!.nextInt(total)
                        randomID = objectIDs.getInt(randomNum)
                        jsonParse(randomID)
                    } catch (e: JSONException) {
                        println("badbad")
                        e.printStackTrace()
                    }
                }, Response.ErrorListener { error ->
            println("internet broken")
            println(error.message + "hi")
        })
        queue!!.add(request)
    }

}
