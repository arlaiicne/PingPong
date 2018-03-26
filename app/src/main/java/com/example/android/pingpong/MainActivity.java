package com.example.android.pingpong;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import com.example.android.pingpong.R;

public class MainActivity extends AppCompatActivity {

    /**
     * Tracks the score for Person A.
     */
    int scorePersonA = 0;

    int scorePersonAWins = 0;
    /**
     * Tracks the score for Person B.
     */
    int scorePersonB = 0;
    int scorePersonBWins = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /**
     * Increase the score for Person A by 1 points.
     */
    public void addOneForPersonA(View v) {
        scorePersonA = scorePersonA + 1;
        displayForPersonA(scorePersonA);
    }


    /**
     * Increase the score for Person B by 1 points.
     */
    public void addOneForPersonB(View v) {
        scorePersonB = scorePersonB + 1;
        displayForPersonB(scorePersonB);
    }

    /**
     * Tally for Person A.
     */
    public void addOneTallyForPersonA(View v) {
        scorePersonAWins = scorePersonAWins + 1;
        scorePersonA = 0 ; scorePersonB = 0;
        displayForPersonA(scorePersonA); displayForPersonB(scorePersonB);
        displayTallyForPersonA(scorePersonAWins);
    }

    /**
     * Tally for Person B.
     */
    public void addOneTallyForPersonB(View v) {
       scorePersonBWins = scorePersonBWins + 1;
        scorePersonA = 0 ; scorePersonB = 0;
        displayForPersonA(scorePersonA); displayForPersonB(scorePersonB);
        displayTallyForPersonB(scorePersonBWins);
    }

    /**
     * Puts both person back to 0 score.
     */
    public void resetScore(View v) {scorePersonA = 0; scorePersonB = 0; scorePersonAWins = 0; scorePersonBWins = 0;
    displayForPersonA(scorePersonA); displayForPersonB(scorePersonB);
    displayTallyForPersonA(scorePersonAWins); displayTallyForPersonB(scorePersonBWins);}

    /**
     * Displays the given score for Person A.
     */
    public void displayForPersonA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Person B.
     */
    public void displayForPersonB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the tally for Person A.
     */
    public void displayTallyForPersonA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_a_tally);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the tally for Person B.
     */
    public void displayTallyForPersonB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_b_tally);
        scoreView.setText(String.valueOf(score));
    }

}
