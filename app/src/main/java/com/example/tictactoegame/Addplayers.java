package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addplayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplayers);

        final EditText playerOne = findViewById(R.id.playerOneName);
        final EditText playerTwo = findViewById(R.id.playerTwoName);
        final Button startGameBtn = findViewById(R.id.startGameBtn);



       startGameBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              final String getPlayerOneName = playerOne.getText().toString();
              final String getPlayerTwoName = playerTwo.getText().toString();

              if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                  Toast.makeText(Addplayers.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
              }
              else{
                  Intent intent = new Intent(Addplayers.this, MainActivity.class);
                  intent.putExtra("playerOne", getPlayerOneName);
                  intent.putExtra("playerTwo", getPlayerTwoName);
                  startActivity(intent);
              }
           }
       });
    }
}