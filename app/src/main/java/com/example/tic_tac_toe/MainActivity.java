package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  TextView playersTurn;
   Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,resetbtn;
   private String TAG="MainActivity.Class";
   int statusarray[]=new int[9];
   int player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        for(int i=0;i<=8;i++)
            statusarray[i]=-1;

        playersTurn=(TextView) findViewById(R.id.playerturns);
        player=1;
        playersTurn.setText("X's Turn");


        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
     resetbtn=findViewById(R.id.resetbtn);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        resetbtn.setOnClickListener(this);


    }
    public void resetthegame(){

       for(int i=0;i<=8;i++)
        statusarray[i]=-1;
   Toast.makeText(this,"reset pressed",Toast.LENGTH_SHORT).show();
        btn0.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");


        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);


       player=1;

       playersTurn.setText("X's Turn");

    }

    public void disableallbuttonsexceptreset(){

        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
    }
    public void checkforwinnerordraw(){
        //rows check
        for(int i=0;i<=8;i+=3)
        {
            if (statusarray[i]==statusarray[i+1]&&statusarray[i]==statusarray[i+2])
            {
                if (statusarray[i]!=-1)
                {
                    if (statusarray[i]==0)
                           playersTurn.setText("O has Won");
                    else
                        playersTurn.setText("X has won");
                    disableallbuttonsexceptreset();
                    return ;
                }
            }
        }
        //columns check
        for(int i=0;i<=2;i++)
        {
            if (statusarray[i]==statusarray[i+3]&&statusarray[i]==statusarray[i+6])
            {
                if (statusarray[i]!=-1)
                {
                    if (statusarray[i]==0)
                        playersTurn.setText("O has Won");
                    else
                        playersTurn.setText("X has won");
                    disableallbuttonsexceptreset();
                    return ;
                }
            }
        }

        //left diag
           if (statusarray[0]==statusarray[4]&&statusarray[0]==statusarray[8])
           {
               if (statusarray[0]!=-1)
               {
                   if (statusarray[0]==0)
                       playersTurn.setText("O has Won");
                   else
                       playersTurn.setText("X has won");
                   disableallbuttonsexceptreset();
                   return ;

               }
           }

        //right diag
        if (statusarray[2]==statusarray[4]&&statusarray[2]==statusarray[6])
        {
            if (statusarray[2]!=-1)
            {
                if (statusarray[2]==0)
                    playersTurn.setText("O has Won");
                else
                    playersTurn.setText("X has won");
                disableallbuttonsexceptreset();
                return ;

            }
        }

        //check draw
        int flag=0;
        for(int i=0;i<=8;i++)
        {
            if (statusarray[i]==-1)
             {flag=1;break;}
        }
        if (flag==0)
        {
            playersTurn.setText("Game draw");
            disableallbuttonsexceptreset();
            return ;
        }
        else
        {
            if (player==1){
                player=0;
                playersTurn.setText("O's turn");
            }
            else
            {
                player=1;
                playersTurn.setText("X's turn");

            }
        }
    }

    @Override
    public void onClick(View v) {

        String btn=v.getTag().toString();
        switch(btn){
            case "0":
                if (btn0.isEnabled())
                {     btn0.setEnabled(false);
                    if (player==1) btn0.setText("X");
                    else btn0.setText("O");
                    statusarray[0]=player;
                    checkforwinnerordraw();

                }
                break;

            case "1":
                if (btn1.isEnabled())
                {   btn1.setEnabled(false);
                    if (player==1) btn1.setText("X");
                    else btn1.setText("O");
                    statusarray[1]=player;
                    checkforwinnerordraw();

                }
                break;

            case "2":
                if (btn2.isEnabled())
                {
                    btn2.setEnabled(false);
                    if (player==1) btn2.setText("X");
                    else btn2.setText("O");
                    statusarray[2]=player;
                    checkforwinnerordraw();

                }
                break;
            case "3":
                if (btn3.isEnabled())
                {   btn3.setEnabled(false);
                    if (player==1) btn3.setText("X");
                    else btn3.setText("O");
                    statusarray[3]=player;
                    checkforwinnerordraw();

                }
                break;
            case "4":
                if (btn4.isEnabled())
                {   btn4.setEnabled(false);
                    if (player==1) btn4.setText("X");
                    else btn4.setText("O");
                    statusarray[4]=player;
                    checkforwinnerordraw();

                }
                break;
            case "5":
                if (btn5.isEnabled())
                {   btn5.setEnabled(false);
                    if (player==1) btn5.setText("X");
                    else btn5.setText("O");
                    statusarray[5]=player;
                    checkforwinnerordraw();

                }
                break;
            case "6":
                if (btn6.isEnabled())
                {    btn6.setEnabled(false);
                    if (player==1) btn6.setText("X");
                    else btn6.setText("O");
                    statusarray[6]=player;
                    checkforwinnerordraw();

                }
                break;
            case "7":
                if (btn7.isEnabled())
                {   btn7.setEnabled(false);
                    if (player==1) btn7.setText("X");
                    else btn7.setText("O");
                    statusarray[7]=player;
                    checkforwinnerordraw();

                }
                break;

            case "8":
                if (btn8.isEnabled())
                {    btn8.setEnabled(false);
                       if (player==1) btn8.setText("X");
                       else btn8.setText("O");
                  statusarray[8]=player;
                 checkforwinnerordraw();

                }
               break;
            case "9":
                resetthegame();

        }

               }

    }

