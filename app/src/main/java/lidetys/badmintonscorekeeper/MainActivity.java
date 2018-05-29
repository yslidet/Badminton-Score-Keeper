package lidetys.badmintonscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //List all of the Variable
    Button btnBlue;
    Button btnRed;
    TextView txtAnnounce;
    Button btnNewGame;

    int blueScore=0;
    int redScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to the XML
        btnBlue = (Button) findViewById(R.id.btn_b);
        btnRed = (Button) findViewById(R.id.btn_r);
        txtAnnounce = (TextView) findViewById(R.id.txt);
        btnNewGame = (Button) findViewById(R.id.btn_restart);
    }


    public void PressBlue(View view){
        //increase blueScore
        blueScore = blueScore + 1;

        //update the score on the screen
        btnBlue.setText(String.valueOf(blueScore));

        //update the text
        txtAnnounce.setText("Blue Scored!\n Blue turn to serve");

    }

    public void PressRed(View view){
        //increase blueScore
        redScore = redScore + 1;

        //update the score on the screen
        btnRed.setText(String.valueOf(redScore));

        //update the text
        txtAnnounce.setText("Red Scored!\n Red turn to serve");

    }

    public void PressNewGame(View view){
        //increase blueScore
        blueScore = 0;
        redScore = 0;

        //update the score on the screen
        btnBlue.setText(String.valueOf(blueScore));
        btnRed.setText(String.valueOf(redScore));

        //update the text
        txtAnnounce.setText("New Game. Ready Set Go!");

    }
}
