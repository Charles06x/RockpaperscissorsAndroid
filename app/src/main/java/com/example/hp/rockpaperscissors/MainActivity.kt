package com.example.hp.rockpaperscissors

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : Activity() {
    lateinit var playButton: Button
    var userChoice: Int = 0
    var COMChoice: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniC.visibility = View.VISIBLE
        iniU.visibility = View.VISIBLE
        rock.visibility = View.VISIBLE
        paper.visibility = View.VISIBLE
        scissors.visibility = View.VISIBLE

        playButton = findViewById(R.id.playButton)

        playButton.setOnClickListener {
            if(rock.isChecked)
            {
                userChoice = 0
                //Toast.makeText(this, "Var: "+userChoice.toString(), Toast.LENGTH_SHORT).show()
            }

            if(paper.isChecked)
            {
                userChoice = 1
            }
            if(scissors.isChecked)
            {
                userChoice = 2
            }

            COMChoice = Random().nextInt(3 - 0) //Generates a random number from 0 until 2

            if(userChoice == 0 && COMChoice == 0) //Rock - Rock
            {
                piedraC.visibility = View.VISIBLE
                Toast.makeText(this, "EMPATE", Toast.LENGTH_SHORT).show()
                papelC.visibility = View.INVISIBLE
                tijeraC.visibility = View.INVISIBLE
            }
            if(userChoice == 0 && COMChoice == 1)   //Rock - Paper
            {
                papelC.visibility = View.VISIBLE
                Toast.makeText(this, "COM ganó", Toast.LENGTH_SHORT).show()
                piedraC.visibility = View.INVISIBLE
                tijeraC.visibility = View.INVISIBLE
            }
            if(userChoice == 0 && COMChoice == 2)   //Rock - Scissors
            {
                tijeraC.visibility = View.VISIBLE
                Toast.makeText(this, "User ganó", Toast.LENGTH_SHORT).show()
                papelC.visibility = View.INVISIBLE
                piedraC.visibility = View.INVISIBLE
            }
            if(userChoice == 1 && COMChoice == 0)   //Paper - Rock.
            {
                piedraC.visibility = View.VISIBLE
                Toast.makeText(this, "User ganó", Toast.LENGTH_SHORT).show()
                papelC.visibility = View.INVISIBLE
                tijeraC.visibility = View.INVISIBLE
            }
            if(userChoice == 1 && COMChoice == 1)   //Paper - Paper
            {
                papelC.visibility = View.VISIBLE
                Toast.makeText(this, "EMPATE", Toast.LENGTH_SHORT).show()
                piedraC.visibility = View.INVISIBLE
                tijeraC.visibility = View.INVISIBLE
            }
            if(userChoice == 1 && COMChoice == 2)   //Paper - Scissors
            {
                tijeraC.visibility = View.VISIBLE
                Toast.makeText(this, "COM ganó", Toast.LENGTH_SHORT).show()
                papelC.visibility = View.INVISIBLE
                piedraC.visibility = View.INVISIBLE
            }
            if(userChoice == 2 && COMChoice == 0)   //Scissors - Rock
            {
                piedraC.visibility = View.VISIBLE
                Toast.makeText(this, "COM ganó", Toast.LENGTH_SHORT).show()
                papelC.visibility = View.INVISIBLE
                tijeraC.visibility = View.INVISIBLE
            }
            if(userChoice == 2 && COMChoice == 1)   //Scissors - Paper
            {
                papelC.visibility = View.VISIBLE
                Toast.makeText(this, "USER ganó", Toast.LENGTH_SHORT).show()
                piedraC.visibility = View.INVISIBLE
                tijeraC.visibility = View.INVISIBLE
            }
            if(userChoice == 2 && COMChoice == 2)   //Scissors - Scissors
            {
                tijeraC.visibility = View.VISIBLE
                Toast.makeText(this, "EMPATE", Toast.LENGTH_SHORT).show()
                papelC.visibility = View.INVISIBLE
                piedraC.visibility = View.INVISIBLE
            }
        }

    }

    fun PiedraU(v: View) {

        if (piedraU.visibility == View.VISIBLE)
        {
            piedraU.visibility = View.INVISIBLE
        } else  {
            piedraU.visibility = View.VISIBLE
        }
        if(papelU.visibility == View.VISIBLE)
        {
            papelU.visibility = View.INVISIBLE
        }
        if(tijeraU.visibility == View.VISIBLE)
        {
            tijeraU.visibility = View.INVISIBLE
        }

        //Verify checked boxes

        if(scissors.isChecked )
            scissors.isChecked = false

        if(paper.isChecked)
            paper.isChecked = false

    }

    fun PapelU(v: View){

        if(tijeraU.visibility == View.VISIBLE)
        {
            tijeraU.visibility = View.INVISIBLE
        }

        if(papelU.visibility == View.INVISIBLE)
        {
            papelU.visibility = View.VISIBLE
        }else{
            papelU.visibility = View.INVISIBLE
        }

        if(piedraU.visibility == View.VISIBLE){
            piedraU.visibility = View.INVISIBLE
        }

        //Verify checked boxes

        if(scissors.isChecked )
            scissors.isChecked = false

        if(rock.isChecked)
            rock.isChecked = false

    }

    fun TijerasU(v: View){

        if(piedraU.visibility == View.VISIBLE)
            piedraU.visibility = View.INVISIBLE

        if(papelU.visibility == View.VISIBLE)
            papelU.visibility = View.INVISIBLE

        if(tijeraU.visibility == View.INVISIBLE)
            tijeraU.visibility = View.VISIBLE
        else
            tijeraU.visibility = View.INVISIBLE

        //Verify checked boxes

        if(paper.isChecked)
            paper.isChecked = false

        if(rock.isChecked)
            rock.isChecked = false
    }

    //Save user choice


    fun play(){

    }

}
