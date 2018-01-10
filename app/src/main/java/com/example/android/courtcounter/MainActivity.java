package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //add 3 points to team a
    public void plusThreePointsTeamA(View view) {
        displayForTeamA(3);
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    //add 2 points to team a
    public void plusTwoPointsTeamA(View view) {
        displayForTeamA(2);
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    //add one point to team a
    public void plusOnePointTeamA(View view) {
        displayForTeamA(1);
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //add 3 points to team b
    public void plusThreePointsTeamB(View view) {
        displayForTeamB(3);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    //add 2 points to team b
    public void plusTwoPointsTeamB(View view) {
        displayForTeamB(2);
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    //add one point to team b
    public void plusOnePointTeamB(View view) {
        displayForTeamB(1);
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    //reset score to 0 for both teams
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

}
