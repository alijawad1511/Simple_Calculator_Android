package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero;
    CardView btnAC,btnPlus,btnMinus,btnMultiply,btnDivide,btnMod,btnDel,btnEqual,btnComma;
    TextView tvDisplay,tvResult;

    String input = "";
    int num1=-1,num2=-1,result;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();     // Initialize all the Element Objects

        // OnClick Listeners
        setListeners();

    }

    private void init(){
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnAC = findViewById(R.id.btnAC);
        btnMod = findViewById(R.id.btnMod);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnEqual = findViewById(R.id.btnEqual);
        btnDel = findViewById(R.id.btnDel);
        btnComma = findViewById(R.id.btnComma);

        tvDisplay = findViewById(R.id.tvDisplay);
        tvResult = findViewById(R.id.tvResult);
    }
    private void setListeners(){
        // 1
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"1";
                tvDisplay.setText(input);
            }
        });

        // 2
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"2";
                tvDisplay.setText(input);
            }
        });

        // 3
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"3";
                tvDisplay.setText(input);
            }
        });

        // 4
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"4";
                tvDisplay.setText(input);
            }
        });

        // 5
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"5";
                tvDisplay.setText(input);
            }
        });

        // 6
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"6";
                tvDisplay.setText(input);
            }
        });

        // 7
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"7";
                tvDisplay.setText(input);
            }
        });

        // 8
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"8";
                tvDisplay.setText(input);
            }
        });

        // 9
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"9";
                tvDisplay.setText(input);
            }
        });


        // 0
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+"0";
                tvDisplay.setText(input);
            }
        });


        // Comma ','
        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString()+",";
                tvDisplay.setText(input);
            }
        });


        // +
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString().trim();

                if(input.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }else{
                    operator = '+';
                    num1 = Integer.parseInt(input);
                    tvDisplay.setText(input+"+");
                }
            }
        });

        // Minus -
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString().trim();

                if(input.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }else{
                    operator = '-';
                    num1 = Integer.parseInt(input);
                    tvDisplay.setText(input+"-");
                }
            }
        });

        // Multiply X
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString().trim();

                if(input.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }else{
                    operator = 'x';
                    num1 = Integer.parseInt(input);
                    tvDisplay.setText(input+"x");
                }
            }
        });

        // Divide ÷
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString().trim();

                if(input.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }else{
                    operator = '÷';
                    num1 = Integer.parseInt(input);
                    tvDisplay.setText(input+"÷");
                }
            }
        });

        // Modulus %
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString().trim();

                if(input.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }else{
                    operator = '%';
                    num1 = Integer.parseInt(input);
                    tvDisplay.setText(input+"%");
                }
            }
        });

        // DEL
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString();

                if(!input.isEmpty()){
                    input = input.substring(0,input.length()-1);
                    tvDisplay.setText(input);
                }

            }
        });

        // Equal =
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = tvDisplay.getText().toString().trim();

                if(!input.isEmpty()){
                    String[] numbers = input.split("[" + operator + "]");

                    if(numbers.length>2){
                        Toast.makeText(MainActivity.this, "Invalid Input! Enter only two numbers e.g. 2+3", Toast.LENGTH_SHORT).show();
                    }else{
                        num2 = Integer.parseInt(numbers[1]);
                        calculateResult();
                        Toast.makeText(MainActivity.this, num1+" "+operator+" "+num2+" = "+result, Toast.LENGTH_SHORT).show();
                        tvResult.setText(input+"="+result);
                        tvDisplay.setText("");
                    }
                }


            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
                tvDisplay.setText("");
            }
        });

        
        
        
    }

    private int calculateResult(){

        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '÷':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }

        return result;

    }
}