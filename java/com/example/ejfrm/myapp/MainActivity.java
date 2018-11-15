package com.example.ejfrm.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        class Calc {
            private int num,res = 0;
            private String op;

            final public void cal() {
                switch (op) {
                    case "+":
                        res += num;
                        break;
                    case "-":
                        res -= num;
                        break;
                    case "*":
                        res *= num;
                        break;
                    case "/":
                        res /= num;
                        break;
                }
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getRes() {
                return res;
            }

            public void setRes(int res) {
                this.res = res;
            }

            public void setOp(String op) {
                this.op = op;
            }
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num = findViewById(R.id.num);
        final Calc calc = new Calc();
        final TextView textView=findViewById(R.id.result);




        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"덧셈",Toast.LENGTH_LONG).show();
                calc.setOp("+");
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.cal();
                num.setText("");

            }
        });

        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "뺄셈", Toast.LENGTH_LONG).show();
                calc.setOp("-");
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.cal();
                num.setText("");
            }
        });

        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"곱셈", Toast.LENGTH_LONG).show();
                calc.setOp("*");
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.cal();
                num.setText("");
            }
        });

        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"나눗셈",Toast.LENGTH_LONG).show();
                calc.setOp("/");
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.cal();
                num.setText("");
            }
        });

        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"결과 : "+calc.getRes(),Toast.LENGTH_LONG).show();
                textView.setText("결과 : " +calc.getRes());
                num.setText("");
            }
        });
    }
}
/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //화면에서 들어오는 값을 알아볼수있게 해주는 것
        //값 유지하기 위해 값을 할당
        final EditText num = findViewById(R.id.num);
        final Context ctx = MainActivity.this;
        final TextView result = findViewById(R.id.result);

        // inner class
        class Calc {
            private int num,res=0; // 인스턴스 변수
            private String op;
            public void exe() {
                switch (op) {
                    case "+": res += num;
                        break;
                    case "-": res -= num;
                        break;
                    case "*": res *= num;
                        break;
                    case "/": res /= num;
                        break;
                }
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public void setOp(String op) {
                this.op = op;
            }

            public int getRes() {
                return res;
            }

            public void setRes(int res) {
                this.res = res;
            }
        }
        final Calc calc = new Calc(); // 메모리에 새로운공간을 만들어라

        //String a = num1.getText().toString();

        //Button plusBtn = findViewById(R.id.plusBtn);
        //Button minusBtn = findViewById(R.id.minusBtn);
        //Button multiBtn = findViewById(R.id.multiBtn);
        //Button divBtn = findViewById(R.id.divBtn);
        //Button equalBtn = findViewById(R.id.equalBtn);
        //함수형 프로그래밍으로 변환 찾자마자 바로 값을 전달 (이벤트 처리)
        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(num.getText().toString());//안드로이드는 텍스트타입->자바 문자열로 변환후 다시 인트로 변환
                Log.d("입력값",a+"");
                calc.setNum(a);
                calc.setOp("+");
                calc.exe();
                num.setText("");

            }
        });
        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                calc.setOp("-");
                calc.exe();
                num.setText("");

            }
        });
        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                calc.setOp("*");
                calc.exe();
                num.setText("");
            }
        });
        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                calc.setOp("/");
                calc.exe();
                num.setText("");
            }
        });
        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int c = calc.getRes();
                //Log.d("출력값",c+"");
                Toast.makeText(ctx, "결과 : "+calc.getRes(),Toast.LENGTH_LONG).show();
                result.setText(calc.getRes());
                num.setText("");

            }
        });

    }
}*/
